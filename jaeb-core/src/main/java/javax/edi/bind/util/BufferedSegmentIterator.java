package javax.edi.bind.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BufferedSegmentIterator implements Iterator<String> {

	private final SegmentIterator segmentIterator;
	private Queue<String> lookAheadQueue;
	
	public BufferedSegmentIterator(SegmentIterator iterator) {
		this.segmentIterator = iterator;
		
		this.lookAheadQueue = new LinkedList<String>();
	}
	
	public boolean hasNext() {
		return segmentIterator.hasNext() || (lookAheadQueue.size() > 0);
	}

	public String next() {
		//return from the look ahead first.
		if(lookAheadQueue.size() > 0) {
			return lookAheadQueue.remove();
		}
		
		return segmentIterator.next();
	}
	
	public void add(String str) {
		lookAheadQueue.add(str);
	}
	
	public String peek() {
		if(lookAheadQueue.size() == 0) {
			//otherwise, pull the next segment.
			String seg = segmentIterator.next();
			lookAheadQueue.add(seg);
		}
		return lookAheadQueue.peek();
	}
	
	public void remove() {
		throw new UnsupportedOperationException("SegmentIterator does not support removing elements from the reader.");
	}
}
