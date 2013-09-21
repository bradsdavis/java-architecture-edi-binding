package com.apd.model.edi.x12.segment;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDISegmentGroup;

@EDISegmentGroup
public class PurchaseOrderHeader {

	@NotNull
	private TransactionSetHeader transactionSetHeader;
	
	@NotNull
	private BeginningSegment beginningSegment;
	
	@Size(max=12)
	private List<ReferenceNumber> referenceNumbers;
	
	@Size(max=12)
	private List<SpecifyingDeliveryCarrier> specifyingDeliveryCarriers;

	private ReferenceIdentification referenceIdentification;

	private Currency currency;
		
	private AdministrationCommunicationsContact administrationCommunicationsContact;

}
