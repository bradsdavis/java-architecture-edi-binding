package javax.edi.bind;

import java.io.Writer;
import java.lang.reflect.Field;
import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDIComponent;
import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDIMessage;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.bind.util.FieldAwareConverter;

import org.apache.commons.beanutils.PropertyUtils;


public class EDIMarshaller {

	private EDIMarshaller() {
		// seal
	}
	
    public static <T> void marshal(T obj, Writer writer) throws Exception {
    	Class<T> clazz = (Class<T>)obj.getClass(); 
    	
        if(!clazz.isAnnotationPresent(EDIMessage.class)) {
        	throw new EDIMessageException("Not a EDI Message!");
        }
        
        EDIMessage message = clazz.getAnnotation(EDIMessage.class);
        processSegmentsAndSegmentGroups(message, obj, writer);
    }
    
    protected static <T> void processSegmentsAndSegmentGroups(EDIMessage message, T obj, Writer writer) throws Exception {
    	Class clazz = obj.getClass();
    	
    	//now, loop through all segments.
        for(int i=0, j=clazz.getDeclaredFields().length; i<j; i++) {
        	//first, get the object from the message.
        	Field field = clazz.getDeclaredFields()[i];
        	Object fieldObj = PropertyUtils.getProperty(obj, field.getName());
        	
        	if(Collection.class.isAssignableFrom(fieldObj.getClass())) {
        		Collection collectionObjs = (Collection)fieldObj;

        		if(collectionObjs.size() > 0) {
        			if(!field.isAnnotationPresent(EDICollectionType.class)) {
        				throw new EDIMessageException("@EDICollectionType Annotation is required for field: "+field.getName());
        			}
        			Class testClass = field.getAnnotation(EDICollectionType.class).value();
        			
        			if(testClass.isAnnotationPresent(EDISegment.class)) {
        				writeNSegments(message, collectionObjs, writer);
            		}
        			else if(testClass.isAnnotationPresent(EDISegmentGroup.class)) {
        				writeNSegmentGroups(message, collectionObjs, writer);
        			}
        			else {
        				throw new EDIMessageException("EDI Message Class Field is not Annotated as Segment of SegmentGroup.");
        			}
        		}
        	}
        	else {
        		if(fieldObj.getClass().isAnnotationPresent(EDISegment.class)) {
        			writeSegment(message, fieldObj, writer);
        		}
    			else if(fieldObj.getClass().isAnnotationPresent(EDISegmentGroup.class)) {
    				write1SegmentGroup(message, fieldObj, writer);
    			}
    			else {
    				throw new EDIMessageException("EDI Message Class Field["+field.getName()+"] is not Annotated as Segment of SegmentGroup.");
    			}
        	}
        }   
    }

    protected static <T> void write1SegmentGroup(EDIMessage message, T obj, Writer writer) throws Exception {
		Class<T> clazz = (Class<T>)obj.getClass();

		EDISegmentGroup segmentGroup = clazz.getAnnotation(EDISegmentGroup.class);
		
		if(obj == null) {
    		return;
    	}
		
        if(!clazz.isAnnotationPresent(EDISegmentGroup.class)) {
        	throw new EDIMessageException("Expected EDI Segment Group.");
        }
        
        if(segmentGroup.header() != null && segmentGroup.header() != "") {
        	//print the header / footer.
        	writer.append(segmentGroup.header()+message.segmentDelimiter());
        }

		writeSegmentGroup(message, obj, writer);
        
        if(segmentGroup.footer() != null && segmentGroup.footer() != "") {
        	//print the header / footer.
        	writer.append(segmentGroup.footer()+message.segmentDelimiter());
        }
    }
    
    protected static <T> void writeNSegmentGroups(EDIMessage message, T obj, Writer writer) throws Exception {
		Collection collectionObjs = (Collection)obj;
		Object testObject = collectionObjs.iterator().next();
		Class<T> clazz = (Class<T>)testObject.getClass();

		EDISegmentGroup segmentGroup = clazz.getAnnotation(EDISegmentGroup.class);
		
		if(obj == null) {
    		return;
    	}
		
        if(!clazz.isAnnotationPresent(EDISegmentGroup.class)) {
        	throw new EDIMessageException("Expected EDI Segment Group.");
        }
        
        if(segmentGroup.header() != null && segmentGroup.header() != "") {
        	//print the header / footer.
        	writer.append(segmentGroup.header()+message.segmentDelimiter());
        }


		for(Object collectionObj : collectionObjs) {
			writeSegmentGroup(message, collectionObj, writer);
		}
        
        if(segmentGroup.footer() != null && segmentGroup.footer() != "") {
        	//print the header / footer.
        	writer.append(segmentGroup.footer()+message.segmentDelimiter());
        }
    }
    
    protected static <T> void writeSegmentGroup(EDIMessage message, T obj, Writer writer) throws Exception {
    	processSegmentsAndSegmentGroups(message, obj, writer);
    }
    
    protected static <T> void writeNSegments(EDIMessage message, T obj, Writer writer) throws Exception {
    	Collection collectionObjs = (Collection)obj;
		
    	for(Object collectionObj : collectionObjs) {
				writeSegment(message, collectionObj, writer);
		}
    }
    
    protected static <T> void writeSegment(EDIMessage message, T obj, Writer writer) throws Exception {
    	if(obj == null) {
    		return;
    	}
    	
    	Class<T> clazz = (Class<T>)obj.getClass(); 
    	
        if(!clazz.isAnnotationPresent(EDISegment.class)) {
        	throw new EDIMessageException("Expected EDI Segment.");
        }
        
        //add the segment code.
        EDISegment segment = clazz.getAnnotation(EDISegment.class);
        writer.append(segment.tag()+message.elementDelimiter());
        
        //now, loop through all segments.
        for(int i=0, j=clazz.getDeclaredFields().length; i<j; i++) {
        	Field field = clazz.getDeclaredFields()[i];
        	EDIElement f = field.getAnnotation(EDIElement.class);
        	String fieldName = field.getName();
        	Class<?> fieldType = field.getType();
        	
        	if(i > 0) {
        		writer.append(message.elementDelimiter());
        	}
        	
        	writeField(message, field, obj, writer);
        }  
        
        writer.append(message.segmentDelimiter());
    }
    
    protected static <T> void writeField(EDIMessage message, Field field, T obj, Writer writer) throws Exception {
    	Object value = PropertyUtils.getProperty(obj, field.getName());
    	if(value == null) {
    		return;
    	}
    	
    	if(field.isAnnotationPresent(EDIComponent.class)) {
    		EDIComponent ediComponent = field.getAnnotation(EDIComponent.class);
    		String componentDelimiter = (ediComponent.delimiter() == null || ediComponent.delimiter().equals("")) ? message.componentDelimiter() : ediComponent.delimiter(); 
    		
    		//treat as component.
    		if(Collection.class.isAssignableFrom(value.getClass())) {
    			StringBuilder componentField = new StringBuilder();
    			
    			Collection collectionObjs = (Collection)value;
    			int i=0;
    			for(Object collectionObj : collectionObjs) {
        			//get the component...
        			if(i>0) {
        				componentField.append(componentDelimiter);
        			}
        			componentField.append(FieldAwareConverter.convertToString(field, collectionObj));
        			i++;
        		}
    			
    			writer.append(componentField.toString());
    		}
    	}
    	else {
    		String val = FieldAwareConverter.convertToString(field, value);    	
        	writer.append(val);
    	}
    }
  
}
