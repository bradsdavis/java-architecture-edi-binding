package com.bradsdavis.edi.testing.x12;

import com.bradsdavis.edi.annotations.EDIMessage;

@EDIMessage
public class PurchaseOrder {

	private Heading heading;
	private Detail detail;
	private Summary summary;
	
	
}
