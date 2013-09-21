package com.bradsdavis.edi.parser;

import java.io.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.convert.ConversionException;
import org.apache.commons.io.LineIterator;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.text.StrTokenizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bradsdavis.edi.annotations.EDICollectionType;
import com.bradsdavis.edi.annotations.EDIComponent;
import com.bradsdavis.edi.annotations.EDIMessage;
import com.bradsdavis.edi.annotations.EDISegment;
import com.bradsdavis.edi.annotations.EDISegmentGroup;
import com.bradsdavis.edi.util.CollectionFactory;
import com.bradsdavis.edi.util.FieldAwareConverter;

public class EDIReader {
	private static final Logger LOG = LoggerFactory.getLogger(EDIReader.class);

	private EDIReader() {
		// seal
	}
	
    public static <T> T read(Class<T> clz, Reader reader) throws Exception {
    	LineIterator lineIterator = new LineIterator(reader);
    	return parseEDIMessage(clz, lineIterator);
    }
    
    public static <T> T parseEDIMessage(Class<T> clz, LineIterator lineIterator) throws EDIMessageException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException, ConversionException {
    	if(!clz.isAnnotationPresent(EDIMessage.class)) {
    		throw new EDIMessageException("Not EDI Message Class.");
    	}
    	EDIMessage ediMessage = clz.getAnnotation(EDIMessage.class);
    	
		Field[] fields = clz.getDeclaredFields();
		Iterator<Field> fieldIterator = Arrays.asList(fields).iterator();
		
		T obj = clz.newInstance();
		
		while(fieldIterator.hasNext() && lineIterator.hasNext()) {
			parseEDISegment(ediMessage, obj, fieldIterator, lineIterator);
		}
		return obj;
    }
    
    public static <T> void parseEDISegment(EDIMessage ediMessage, T object, Iterator<Field> fieldIterator, LineIterator lineIterator) throws EDIMessageException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, ConversionException {
    	if(!fieldIterator.hasNext()) {
    		throw new EDIMessageException("No more fields to read.");
    	}
    	
    	if(!lineIterator.hasNext()) {
    		throw new EDIMessageException("No more lines to read.");
    	}
    	
    	//match up iterators...
    	FieldMatch fm = advanceToMatch(fieldIterator, lineIterator);
    	if(fm != null) {
    		//we have a match between the current line and the current field. (FieldMatch) 
    		
    		Object obj = fm.getField().getType().newInstance();
    		BeanUtils.setProperty(object, fm.getField().getName(), obj);
    		parseEDIField(ediMessage, obj, fm.getLine());
    	}
    }
    
    public static FieldMatch advanceToMatch(Iterator<Field> fieldIterator, LineIterator lineIterator) {
		//advance the reader, read the line.
    	String line = lineIterator.next();
    	StringTokenizer tokenizer = new StringTokenizer(line, "*");
    	
    	//first token is always the tag.
    	String ediSegmentTag = tokenizer.nextToken();

    	while(fieldIterator.hasNext()) {
    		Field field = fieldIterator.next();
    		if(matchesSegment(field, ediSegmentTag)) {
    			return new FieldMatch(field, line);
    		}
    		
    		if(LOG.isDebugEnabled()) {
    			LOG.debug("Field: "+field+" does not match: "+line);
    		}
    	}
    	
    	return null;
    }
    
    
    public static boolean matchesSegment(Field field, String segmentTag) {
    	Class<?> clz = field.getType();
    	
    	if(clz.isAnnotationPresent(EDISegment.class)) {
    		EDISegment es = clz.getAnnotation(EDISegment.class);
    		if(StringUtils.equals(segmentTag, es.tag())) {
    			return true;
    		}
    	}
    	else if(clz.isAnnotationPresent(EDISegmentGroup.class)) {
    		EDISegmentGroup esg = clz.getAnnotation(EDISegmentGroup.class);
    		
    		String ediSegmentGroupTag = esg.header();
    		if(StringUtils.equals(segmentTag, ediSegmentGroupTag))
    		{
    			return true;
    		}
    	}

    	return false;
    }
    
    public static <T> void parseEDIField(EDIMessage ediMessage, Object segment, String line) throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, ConversionException, InstantiationException {
    	if(LOG.isDebugEnabled()) {
    		LOG.debug("Before Field Values: "+ReflectionToStringBuilder.toString(segment));
    		LOG.debug("Line Values: "+line);
    	}
    	
    	//now, tokenize the line, and set the fields. 
    	StrTokenizer tokenizer = new StrTokenizer(line, "*");
    	tokenizer.setEmptyTokenAsNull(true);
    	tokenizer.setIgnoreEmptyTokens(false);
    	
    	//move past the initial tag.
    	tokenizer.next();
    	
    	Iterator<Field> fieldIterator = Arrays.asList(segment.getClass().getDeclaredFields()).iterator();
    	while(tokenizer.hasNext() && fieldIterator.hasNext()) {
    		Field field = fieldIterator.next();
    		String val = tokenizer.nextToken();
    		
    		//check field to see if it is a component of regular field type.
    		if(field.isAnnotationPresent(EDIComponent.class)) {
    			EDIComponent ediComponent = field.getAnnotation(EDIComponent.class);
    			Collection obj = CollectionFactory.newInstance(field.getType());
    			Class objType = getCollectionType(field);
    			
    			String componentDelimiter = StringUtils.defaultIfBlank(ediComponent.delimiter(), ediMessage.componentDelimiter());
    			
    			//parse each element to the collection.
    			StrTokenizer componentTokenizer = new StrTokenizer(val, componentDelimiter);
    			componentTokenizer.setEmptyTokenAsNull(true);
    			componentTokenizer.setIgnoreEmptyTokens(false);
    	    	
    			while(componentTokenizer.hasNext()) {
    				String component = componentTokenizer.nextToken();
    				
            		Object fieldObj = objType.cast(FieldAwareConverter.convertFromString(objType, field, component));
            		obj.add(fieldObj);
    			}
    			BeanUtils.setProperty(segment, field.getName(), obj);
    		}
    		else {

        		if(LOG.isDebugEnabled()) {
        			LOG.debug("Field: "+field);
        			LOG.debug("Value: "+val);
        		}
        		
        		if(val == null) {
        			continue;
        		}
        		
        		//try and populate the field.
        		
        		Object fieldObj = FieldAwareConverter.convertFromString(field.getType(), field, val);
        		BeanUtils.setProperty(segment, field.getName(), fieldObj);
    		}
    		
    	}
    	
    	if(LOG.isDebugEnabled()) {
    		LOG.debug("After Field Values: "+ReflectionToStringBuilder.toString(segment));
    	}
    }
    
    
    
    private static Class getCollectionType(Field field) {
    	if(field.isAnnotationPresent(EDICollectionType.class)) {
    		return field.getAnnotation(EDICollectionType.class).type();
    	}
    	
    	return null;
    }
    
    
    

    private static class FieldMatch {
    	
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
