package javax.edi.bind.util;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.apache.commons.io.IOUtils;

public class SegmentIterator implements Iterator<String> {

	private final SegmentAwareReader segmentReader;
	private String cached;
	private boolean finished;
	
	public SegmentIterator(Reader reader, char segmentDelimiter, boolean ignoreNewLine) {
		this.segmentReader = new SegmentAwareReader(reader, segmentDelimiter, ignoreNewLine);
	}
	
	public boolean hasNext() {

		//if we have a null cache & we aren't done reading, read to the cache.
		if(cached == null && !finished) {
			//read a new value to the cache.
			try {
				cached = segmentReader.readSegment();
				if(cached == null) {
					//set the finished if the reader returns null.
					finished = true;
				}
				
			} catch (IOException e) {
				throw new IllegalStateException(e);
			}
			finally {
				IOUtils.closeQuietly(segmentReader);
			}
		}
		
		//return if we aren't complete.
		return !finished;
		
	}

	public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more segments.");
        }
        //read from cache.
        String current = cached;
        
        //empty cache.
        cached = null;
        
        return current;
	}

	public void remove() {
		throw new UnsupportedOperationException("SegmentIterator does not support removing elements from the reader.");
	}

}
