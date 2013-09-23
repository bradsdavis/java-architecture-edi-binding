package javax.edi.bind;

import java.io.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDIComponent;
import javax.edi.bind.annotations.EDIMessage;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.bind.util.CollectionFactory;
import javax.edi.bind.util.FieldAwareConverter;
import javax.edi.bind.util.SegmentIterator;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.convert.ConversionException;
import org.apache.commons.lang.CharUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.text.StrTokenizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EDIUnmarshaller {
	private static final Logger LOG = LoggerFactory
			.getLogger(EDIUnmarshaller.class);

	private EDIUnmarshaller() {
		// seal
	}

	public static <T> T unmarshal(Class<T> clz, Reader reader) throws Exception {
		return parseEDIMessage(clz, reader);
	}

	protected static <T> T parseEDIMessage(Class<T> clz, Reader reader)
			throws EDIMessageException, InstantiationException,
			IllegalAccessException, InvocationTargetException,
			ClassNotFoundException, ConversionException {
		if (!clz.isAnnotationPresent(EDIMessage.class)) {
			throw new EDIMessageException("Not EDI Message Class.");
		}
		EDIMessage ediMessage = clz.getAnnotation(EDIMessage.class);

		SegmentIterator segmentIterator = new SegmentIterator(reader,
				ediMessage.segmentDelimiter(), true);

		Field[] fields = clz.getDeclaredFields();
		Iterator<Field> fieldIterator = Arrays.asList(fields).iterator();

		T obj = clz.newInstance();

		Queue<String> lookAhead = new LinkedList<String>();
		while (fieldIterator.hasNext() && (segmentIterator.hasNext() || lookAhead.size() > 0)) {
			parseEDISegmentOrSegmentGroup(ediMessage, obj, fieldIterator, lookAhead, segmentIterator);
		}
		return obj;
	}

	protected static <T> void parseEDISegmentOrSegmentGroup(EDIMessage ediMessage, T object, Iterator<Field> fieldIterator, Queue<String> lookAhead, SegmentIterator segmentIterator)
			throws EDIMessageException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, ConversionException {
		if (!fieldIterator.hasNext()) {
			throw new EDIMessageException("No more fields to read.");
		}

		if (!segmentIterator.hasNext() && lookAhead.size() == 0) {
			return;
		}

		// get the queued object first...
		String line = lookAhead.size() > 0 ? lookAhead.remove() : segmentIterator.next();

		// match up the field with the line...
		FieldMatch fm = advanceToMatch(ediMessage, fieldIterator, line);

		//
		
		
		if (fm != null) {
			Class<?> fieldType = getEDISegmentOrGroupType(fm.getField());
			if (fieldType.isAnnotationPresent(EDISegment.class)) {
				processSegment(ediMessage, object, lookAhead, segmentIterator, fm);
			} else if (fieldType.isAnnotationPresent(EDISegmentGroup.class)) {
				processSegmentGroup(ediMessage, object, lookAhead, segmentIterator, fm);
			}
		}
		else {
			lookAhead.add(line);
		}
	}

	protected static <T> void processSegmentGroup(EDIMessage ediMessage,
			T object, Queue<String> lookAhead, SegmentIterator segmentIterator,
			FieldMatch fm) throws InstantiationException,
			IllegalAccessException, InvocationTargetException,
			ClassNotFoundException, ConversionException, EDIMessageException {

		LOG.debug("Object: " + ReflectionToStringBuilder.toString(object));
		LOG.debug("Field: " + fm.getField().getName());

		Class<?> segmentGroupClass = getEDISegmentOrGroupType(fm.getField());
		if (!segmentGroupClass.isAnnotationPresent(EDISegmentGroup.class)) {
			throw new EDIMessageException("Segment Group should have annotation.");
		}

		LOG.debug("Segment Group Type: " + segmentGroupClass);

		String line = fm.getLine();
		EDISegmentGroup es = segmentGroupClass.getAnnotation(EDISegmentGroup.class);
		
		if (StringUtils.equals(es.header(), line)) {
			// feed line.
		} 
		else {
			LOG.debug("Adding to Look Ahead: " + line);
			lookAhead.add(line);
		}

		if (Collection.class.isAssignableFrom(fm.getField().getType())) {
			Collection obj = CollectionFactory.newInstance(fm.getField().getType());
			BeanUtils.setProperty(object, fm.getField().getName(), obj);

			String segmentTag = getSegmentTag(fm.getField(), true);

			while (true) {
				LOG.debug("Looping to collect Collection of Segment Groups");
				// parse the group...
				Field[] fields = segmentGroupClass.getDeclaredFields();
				Iterator<Field> fieldIterator = Arrays.asList(fields).iterator();

				Object collectionObj = segmentGroupClass.newInstance();
				while (fieldIterator.hasNext() && (segmentIterator.hasNext() || lookAhead.size() > 0)) {
					parseEDISegmentOrSegmentGroup(ediMessage, collectionObj, fieldIterator, lookAhead, segmentIterator);
				}

				obj.add(collectionObj);

				// look to next line...
				String nextLine = lookAhead.size() > 0 ? lookAhead.remove() : segmentIterator.next();
				// get the first element of the line.
				StrTokenizer nextLineTokenizer = new StrTokenizer(nextLine, ediMessage.elementDelimiter());

				if (StringUtils.equals(segmentTag, nextLineTokenizer.nextToken())) {
					LOG.debug("Might be a repeat..");
					LOG.debug("Next line: " + line);
					lookAhead.add(nextLine);
				} else {
					lookAhead.add(nextLine);
					break;
				}

				// now, look ahead to see whether the next line is of the same
				// object type..
				if (!segmentIterator.hasNext() && lookAhead.size() == 0) {
					break;
				}
			}

		} else {
			Field[] fields = segmentGroupClass.getDeclaredFields();
			Iterator<Field> fieldIterator = Arrays.asList(fields).iterator();

			Object obj = segmentGroupClass.newInstance();
			while (fieldIterator.hasNext()
					&& (segmentIterator.hasNext() || lookAhead.size() > 0)) {
				parseEDISegmentOrSegmentGroup(ediMessage, obj, fieldIterator, lookAhead, segmentIterator);
			}

			BeanUtils.setProperty(object, fm.getField().getName(), obj);
		}

		// look at next...
		if (StringUtils.isNotBlank(es.header())) {
			line = lookAhead.size() > 0 ? lookAhead.remove() : segmentIterator
					.next();

			if (StringUtils.endsWith(es.footer(), line)) {
				// feed line.
				LOG.debug("Popping footer off of the line iterator.");
			} else {
				lookAhead.add(line);
			}

		}
	}

	protected static <T> void processSegment(EDIMessage ediMessage, T object, Queue<String> lookAhead, SegmentIterator SegmentIterator, FieldMatch fm) throws InstantiationException,
			IllegalAccessException, InvocationTargetException, ClassNotFoundException, ConversionException {
	
		if (Collection.class.isAssignableFrom(fm.getField().getType())) {
			Collection obj = CollectionFactory.newInstance(fm.getField()
					.getType());
			BeanUtils.setProperty(object, fm.getField().getName(), obj);

			// look ahead to see if we need to break.
			Class<?> collectionClass = getCollectionType(fm.getField());

			if (collectionClass.isAnnotationPresent(EDISegment.class)) {
				EDISegment es = collectionClass.getAnnotation(EDISegment.class);

				//first, go ahead and add the object from the field match.
				Object matchObject = collectionClass.newInstance();
				
				parseEDISegmentFields(ediMessage, matchObject, fm.getLine());
				obj.add(matchObject);
				
				Queue<String> segments = queueLinesForType(ediMessage, es, lookAhead, SegmentIterator);
				for (String segment : segments) {
					Object collectionObject = collectionClass.newInstance();
					parseEDISegmentFields(ediMessage, collectionObject, segment);
					obj.add(collectionObject);
				}
			}
		} else {
			Object obj = fm.getField().getType().newInstance();
			BeanUtils.setProperty(object, fm.getField().getName(), obj);
			parseEDISegmentFields(ediMessage, obj, fm.getLine());
		}
		
	}

	protected static Queue<String> queueLinesForType(EDIMessage ediMessage, EDISegment segment, Queue<String> lookAhead,
			SegmentIterator SegmentIterator) {
		Queue<String> segments = new LinkedList<String>();

		while (SegmentIterator.hasNext()) {
			String line = SegmentIterator.next();
			StringTokenizer tokenizer = new StringTokenizer(line,
					CharUtils.toString(ediMessage.elementDelimiter()));
			String token = tokenizer.nextToken();

			if (StringUtils.equals(segment.tag(), token)) {
				segments.add(line);
			} else {
				lookAhead.add(line);
				break;
			}
		}

		return segments;
	}

	protected static FieldMatch advanceToMatch(EDIMessage ediMessage, Iterator<Field> fieldIterator, String line) {
		// advance the reader, read the line.
		StringTokenizer tokenizer = new StringTokenizer(line, CharUtils.toString(ediMessage.elementDelimiter()));

		// first token is always the tag.
		String ediSegmentTag = tokenizer.nextToken();

		while (fieldIterator.hasNext()) {
			Field field = fieldIterator.next();
			if (matchesSegment(field, ediSegmentTag)) {
				LOG.debug("SegmentMatch["+ ediSegmentTag +" -> " + field.getType().getName() + "] :: " + line);
				return new FieldMatch(field, line);
			}

			if (LOG.isDebugEnabled()) {
				LOG.debug("Field: " + field + " does not match: " + line);
			}
		}

		return null;
	}

	protected static String getSegmentTag(Field field, boolean inner) {
		Class<?> clz = field.getType();

		if (Collection.class.isAssignableFrom(clz)) {
			clz = getCollectionType(field);
		}

		if (clz.isAnnotationPresent(EDISegment.class)) {
			EDISegment es = clz.getAnnotation(EDISegment.class);
			return es.tag();
		} else if (clz.isAnnotationPresent(EDISegmentGroup.class)) {
			EDISegmentGroup esg = clz.getAnnotation(EDISegmentGroup.class);

			String ediSegmentGroupTag = esg.header();

			if (!inner && StringUtils.isNotBlank(ediSegmentGroupTag)) {
				return ediSegmentGroupTag;
			} else {
				// get the segement group's first field, and recurse.
				if (clz.getDeclaredFields().length > 0) {
					return getSegmentTag(clz.getDeclaredFields()[0], false);
				}
			}
		}

		return null;
	}

	protected static boolean matchesSegment(Field field, String segmentTag) {
		Class<?> clz = field.getType();

		if (Collection.class.isAssignableFrom(clz)) {
			clz = getCollectionType(field);
		}

		if (clz.isAnnotationPresent(EDISegment.class)) {
			EDISegment es = clz.getAnnotation(EDISegment.class);
			if (StringUtils.equals(segmentTag, es.tag())) {
				return true;
			}
		} else if (clz.isAnnotationPresent(EDISegmentGroup.class)) {
			EDISegmentGroup esg = clz.getAnnotation(EDISegmentGroup.class);

			String ediSegmentGroupTag = esg.header();

			if (StringUtils.isNotBlank(ediSegmentGroupTag)) {
				if (StringUtils.equals(segmentTag, ediSegmentGroupTag)) {
					return true;
				}
			} else {
				// get the segement group's first field, and recurse.
				if (clz.getDeclaredFields().length > 0) {
					return matchesSegment(clz.getDeclaredFields()[0],
							segmentTag);
				}
			}
		}

		return false;
	}

	protected static <T> void parseEDISegmentFields(EDIMessage ediMessage, Object segment, String segmentLine) throws IllegalAccessException,
			InvocationTargetException, ClassNotFoundException, ConversionException, InstantiationException {
		if (LOG.isDebugEnabled()) {
			LOG.debug("Before Field Values: "
					+ ReflectionToStringBuilder.toString(segment));
			LOG.debug("Segment Values: " + segmentLine);
		}

		// now, tokenize the line, and set the fields.
		StrTokenizer tokenizer = new StrTokenizer(segmentLine, ediMessage.elementDelimiter());

		tokenizer.setEmptyTokenAsNull(true);
		tokenizer.setIgnoreEmptyTokens(false);

		// move past the initial tag.
		tokenizer.next();

		Iterator<Field> fieldIterator = Arrays.asList(segment.getClass().getDeclaredFields()).iterator();
		while (tokenizer.hasNext() && fieldIterator.hasNext()) {
			Field field = fieldIterator.next();
			String val = tokenizer.nextToken();

			// check field to see if it is a component of regular field type.
			if (field.isAnnotationPresent(EDIComponent.class)) {
				EDIComponent ediComponent = field
						.getAnnotation(EDIComponent.class);
				Collection obj = CollectionFactory.newInstance(field.getType());
				Class objType = getCollectionType(field);

				char componentDelimiter = ediComponent.delimiter() == Character.UNASSIGNED ? ediMessage
						.componentDelimiter() : ediComponent.delimiter();

				// parse each element to the collection.
				StrTokenizer componentTokenizer = new StrTokenizer(val,
						componentDelimiter);
				componentTokenizer.setEmptyTokenAsNull(true);
				componentTokenizer.setIgnoreEmptyTokens(false);

				while (componentTokenizer.hasNext()) {
					String component = componentTokenizer.nextToken();
					Object fieldObj = objType.cast(FieldAwareConverter.convertFromString(objType, field, component));
					obj.add(fieldObj);
				}
				BeanUtils.setProperty(segment, field.getName(), obj);
			} else {
				if (val == null) {
					LOG.debug("  "+field.getName()+" -> null");
					continue;
				}

				// try and populate the field.

				try {
					Object fieldObj = FieldAwareConverter.convertFromString(field.getType(), field, val);
					LOG.debug("  "+field.getName()+" -> "+val);
					
					
					BeanUtils.setProperty(segment, field.getName(), fieldObj);
				}
				catch(Exception e) {
					throw new ConversionException("Exception setting: "+segment.getClass()+"."+field.getName()+" with value: "+val, e);
				}
				
				
			}

		}

		if (LOG.isDebugEnabled()) {
			LOG.debug("After Field Values: " + ReflectionToStringBuilder.toString(segment));
		}
	}

	protected static Class getEDISegmentOrGroupType(Field field) {
		if (Collection.class.isAssignableFrom(field.getType())) {
			return getCollectionType(field);
		} else {
			return field.getType();
		}
	}

	protected static Class getCollectionType(Field field) {
		if (field.isAnnotationPresent(EDICollectionType.class)) {
			return field.getAnnotation(EDICollectionType.class).value();
		}

		LOG.warn("Ensure the field: "+field.toString()+" contains the @EDICollectionType annotation.");
		return null;
	}

	protected static class FieldMatch {

		private final Field field;
		private final String line;

		public FieldMatch(Field field, String line) {
			this.field = field;
			this.line = line;
		}

		public Field getField() {
			return field;
		}

		public String getLine() {
			return line;
		}
	}

}
