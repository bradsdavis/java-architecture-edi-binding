package com.bradsdavis.edi.testing.x12;

import com.bradsdavis.edi.annotations.EDISegmentGroup;

@EDISegmentGroup
public class Heading {

	private TransactionSetHeader transactionSetHeader;
	private BeginningSegment beginningSegment;
	private Currency currency;
	private ReferenceIdentification referenceIdentification;
	private AdministrationCommunicationsContact administrationCommunicationsContact;

}
