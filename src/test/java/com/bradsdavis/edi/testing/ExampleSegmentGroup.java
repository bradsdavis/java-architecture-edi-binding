package com.bradsdavis.edi.testing;

import javax.edi.bind.annotations.EDISegmentGroup;

@EDISegmentGroup(header="PRICING", footer="ENDPRICING")
public class ExampleSegmentGroup {

	private Item exampleSegment;
	private Price exampleSegmentAnother;
	
	@Override
	public String toString() {
		return "ExampleSegmentGroup [exampleSegment=" + exampleSegment + ", exampleSegmentAnother=" + exampleSegmentAnother + "]";
	}

	public Item getExampleSegment() {
		return exampleSegment;
	}
	
	public Price getExampleSegmentAnother() {
		return exampleSegmentAnother;
	}
	
	public void setExampleSegment(Item exampleSegment) {
		this.exampleSegment = exampleSegment;
	}
	
	public void setExampleSegmentAnother(
			Price exampleSegmentAnother) {
		this.exampleSegmentAnother = exampleSegmentAnother;
	}
	
}
