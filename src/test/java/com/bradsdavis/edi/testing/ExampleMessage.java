package com.bradsdavis.edi.testing;

import java.util.Collection;

import com.bradsdavis.edi.annotations.EDIMessage;

@EDIMessage()
public class ExampleMessage {
	
	private Item segment;
	private Item another;
	
	private Collection<Item> nSegments;
	
	private ExampleSegmentGroup segmentGroup;
	
	private Collection<ExampleSegmentGroup> multileGroups;
	
	public Collection<ExampleSegmentGroup> getMultileGroups() {
		return multileGroups;
	}
	
	public void setMultileGroups(Collection<ExampleSegmentGroup> multileGroups) {
		this.multileGroups = multileGroups;
	}
	
	public ExampleSegmentGroup getSegmentGroup() {
		return segmentGroup;
	}
	
	public void setSegmentGroup(ExampleSegmentGroup segmentGroup) {
		this.segmentGroup = segmentGroup;
	}
	
	
	public Collection<Item> getnSegments() {
		return nSegments;
	}
	
	public void setnSegments(Collection<Item> nSegments) {
		this.nSegments = nSegments;
	}
	
	public Item getSegment() {
		return segment;
	}
	
	public void setSegment(Item segment) {
		this.segment = segment;
	}
	
	public Item getAnother() {
		return another;
	}
	
	public void setAnother(Item another) {
		this.another = another;
	}
}
