package javax.edi.bind.test.beans;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDIMessage;

import org.apache.commons.lang.builder.EqualsBuilder;

@EDIMessage()
public class ExampleMessage {
	
	private Item segment;
	private Item another;
	
	@EDICollectionType(Item.class)
	private Collection<Item> nSegments;
	
	private ExampleSegmentGroup segmentGroup;

	@EDICollectionType(ExampleSegmentGroup.class)
	private Collection<ExampleSegmentGroup> multileGroups;
	
	@Override
	public String toString() {
		return "ExampleMessage [segment=" + segment + ", another=" + another + ", nSegments=" + nSegments + ", segmentGroup=" + segmentGroup + ", multileGroups=" + multileGroups + "]";
	}

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
