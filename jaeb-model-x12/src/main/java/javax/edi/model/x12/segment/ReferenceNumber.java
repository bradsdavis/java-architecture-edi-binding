package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="REF")
public class ReferenceNumber {

	@EDIElement(fieldName="REF01",dataElement="128")
	@NotNull
	@Size(min = 2, max = 2)
	private String referenceIdentificationQualifier;
	
	@EDIElement(fieldName="REF02",dataElement="127",conditional=true)
	@Size(min = 1, max = 35)
	private String referenceIdentification;
	
	
	@EDIElement(fieldName="REF03",dataElement="352",conditional=true)
	@Size(min = 1, max = 2)
	private String referenceDescription; 

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

	public String getReferenceDescription() {
		return referenceDescription;
	}

	public void setReferenceDescription(String referenceDescription) {
		this.referenceDescription = referenceDescription;
	}

	
	
}
