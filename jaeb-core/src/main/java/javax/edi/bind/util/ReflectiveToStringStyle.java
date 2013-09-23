package javax.edi.bind.util;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import org.apache.commons.lang.SystemUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class ReflectiveToStringStyle extends ToStringStyle {

	private SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	
	    private static final int    INFINITE_DEPTH  = -1;

	    /**
	     * Setting {@link #maxDepth} to 0 will have the same effect as using original {@link #ToStringStyle}: it will
	     * print all 1st level values without traversing into them. Setting to 1 will traverse up to 2nd level and so
	     * on.
	     */
	    private int maxDepth;
	    private int depth;

	    public ReflectiveToStringStyle() {
	        this(INFINITE_DEPTH);
	    }

	    public ReflectiveToStringStyle(int maxDepth) {
	        setUseShortClassName(true);
	        setUseIdentityHashCode(false);
	        this.maxDepth = maxDepth;
	    }

	    @Override
	    protected void appendFieldStart(StringBuffer buffer, String fieldName) {
	    	buffer.append(SystemUtils.LINE_SEPARATOR);
	    	//append indent..
	    	for(int i=0; i<depth; i++) {
	    		buffer.append("\t");
	    	}
	    	
	    	super.appendFieldStart(buffer, fieldName);
	    }
	    
	    @Override
	    protected void appendDetail(StringBuffer buffer, String fieldName, Object value) {
	        if (value.getClass().getName().startsWith("java.lang.") || (maxDepth != INFINITE_DEPTH && depth >= maxDepth)) {
	        	buffer.append(value);
	        }
	        else {
	            depth++;
	            if(value instanceof Date) {
	            	buffer.append(sdf.format(value));
	            }
	            else {
	            	buffer.append(ReflectionToStringBuilder.toString(value, this));
	            }
	            
	            depth--;
	        }
	    }
	    
	    @Override
	    protected void appendDetail(StringBuffer buffer, String fieldName, Collection coll) {
	    	depth++;
            buffer.append(ReflectionToStringBuilder.toString(coll.toArray(), this));
            depth--;
	    }
	}