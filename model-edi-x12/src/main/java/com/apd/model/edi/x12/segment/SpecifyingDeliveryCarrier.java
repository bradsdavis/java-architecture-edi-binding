package com.apd.model.edi.x12.segment;

import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag="TD5")
public class SpecifyingDeliveryCarrier {
	
	@Size(min = 1, max = 2)
	@EDIElement
	private String routingSequenceCode; //
	
	@Size(min = 1, max = 2)
	@EDIElement
	//@Conditional
	private String identificationCodeQualifier; // 
	
	@Size(min = 2, max = 80)
	@EDIElement
	//@Conditionl
	private String identificationCode; // Carrier Specific Billing ID for third party billing only.
	
	@Size(min = 1, max = 2)
	@EDIElement
	//@Conditional
	private String transportationMethod; // 
	
	@Size(min = 1, max = 35)
	@EDIElement
	//@Conditional
	private String routing; // Carrier Code used for third party billing only.  Use "UPS" for United Parcel Service and "FDX" for Federal Express.
	
	@Size(min = 2, max = 2)
	@EDIElement
	//@Conditional
	private String shipmentOrderStatusCode; // 
}
