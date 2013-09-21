package com.bradsdavis.edi.parser;

import java.io.Reader;
import java.lang.reflect.Field;
import java.util.StringTokenizer;

import org.apache.commons.io.LineIterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bradsdavis.edi.annotations.EDISegment;

public class EDIReader {
	private static final Logger LOG = LoggerFactory.getLogger(EDIReader.class);

	private EDIReader() {
		// seal
	}
	
    public static <T> T read(Class<T> clz, Reader reader) throws Exception {
    	LineIterator lineIterator = new LineIterator(reader);
    	return parseEDIMessage(clz, lineIterator);
    }
    
    public static <T> T parseEDIMessage(Class<T> clz, LineIterator lineIterator) throws EDIMessageException {
		Field[] fields = clz.getDeclaredFields();
    	
		for(Field field : fields) {
			parseEDISegment(field, lineIterator);
		}
    		
    	return null;
    }
    
    public static <T> T parseEDISegment(Field clzField, LineIterator lineIterator) throws EDIMessageException {
    	if(LOG.isDebugEnabled()) {
    		LOG.debug(clzField.getName() +" -> "+ clzField.getType());
    	}
    	
    	if(!lineIterator.hasNext()) {
    		throw new EDIMessageException("No more lines to read.");
    	}
    	//advance the reader, read the line.
    	StringTokenizer tokenizer = new StringTokenizer(lineIterator.next());
    	
    	//first token is always the tag.
    	String ediSegmentTag = tokenizer.nextToken();
    	
    	Class clz = clzField.getClass();

    	//get all declared fields
    	Field[] fields = clz.getDeclaredFields();
    	
    	while(tokenizer.hasMoreElements()) {
    		String currentElement = tokenizer.nextToken();
    		
    		LOG.info("Current Element: "+currentElement);
    	}
    
    	return null;
    }
    
    public static boolean matchesSegment(Class clz, String segmentTag) {
    	if(clz.isAnnotationPresent(EDISegment.class)) {
    		//thi
    	}
    	
    	return true;
    }
    
    public static boolean isSegment(Class clz, String segmentTag) {
    	if(clz.isAnnotationPresent(EDISegment.class)) {
    		//thi
    	}
    	
    	return true;
    }
    
    public static boolean isSegmentGroup(Class clz, String segmentTag) {
    	if(clz.isAnnotationPresent(EDISegment.class)) {
    		//thi
    	}
    	
    	return true;
    }
    
    public static <T> T parseEDIField(Field field, String str) {
    	
    	return null;
    }
    
    
    
    
    
    
}
