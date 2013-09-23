package javax.edi.bind.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class SegmentAwareReader extends BufferedReader {
    public static final char CR = '\r';
    public static final char LR = '\n';
    private static final int EOF = -1;
    
    
    protected char segmentDelimiter;
	protected boolean ignoreNewLine;
	protected int currentSegment = 0;
	protected boolean finished = false;
	
	public SegmentAwareReader(Reader in, char segmentDelimiter, boolean ignoreNewLine) {
		super(in);
		this.segmentDelimiter = segmentDelimiter;
		this.ignoreNewLine = ignoreNewLine;
	}
	
	public String readSegment() throws IOException {
		StringBuilder builder = new StringBuilder();
		
		int current;
		
		//while the stream has characters..
		while ((current = this.read()) != EOF) {
            char ch = (char) current;

            if(ch == segmentDelimiter) {
            	break;
            }
            
            if(ignoreNewLine) {
	            if(!(ch == CR || ch == LR)) {
	            	builder.append(ch);
	            }
            }
            else {
            	builder.append(ch);
            }
		}
		
		if(current == EOF) {
			finished = true;
			return null;
		}
		
		currentSegment++;
		return builder.toString();
	}
	
	public int getCurrentSegment() {
		return currentSegment;
	}
}
