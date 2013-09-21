package com.bradsdavis.edi.testing.x12;

import com.bradsdavis.edi.annotations.EDISegment;

@EDISegment(tag="REF")
public class ReferenceIdentification {

	private String referenceIdentificationQualifier;
	private String referenceIdentification;
	
	public String getReferenceIdentificationQualifier() {
		return referenceIdentificationQualifier;
	}
	public void setReferenceIdentificationQualifier(
			String referenceIdentificationQualifier) {
		this.referenceIdentificationQualifier = referenceIdentificationQualifier;
	}
	public String getReferenceIdentification() {
		return referenceIdentification;
	}
	public void setReferenceIdentification(String referenceIdentification) {
		this.referenceIdentification = referenceIdentification;
	}
	
	
}
