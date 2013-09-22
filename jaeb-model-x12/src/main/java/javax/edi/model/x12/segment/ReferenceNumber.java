package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="REF")
public class ReferenceNumber {

	@EDIElement(fieldName="REF01", dataElement="128")
	@NotNull
	@Size(min=2,max=2)
	private String referenceID;


	@EDIElement(fieldName="REF02", dataElement="127")
	@Size(min=1,max=30)
	private String referenceNumber;


	public String getReferenceID() {
		return referenceID;
	}


	public void setReferenceID(String referenceID) {
		this.referenceID = referenceID;
	}


	public String getReferenceNumber() {
		return referenceNumber;
	}


	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
}
