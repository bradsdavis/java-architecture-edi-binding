package com.bradsdavis.edi.testing;

import com.bradsdavis.edi.annotations.EDISegmentGroup;

@EDISegmentGroup(header="PRICING", footer="ENDPRICING")
public class ExampleSegmentGroup {

	private Item exampleSegment;
	private Price exampleSegmentAnother;
	
	
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
