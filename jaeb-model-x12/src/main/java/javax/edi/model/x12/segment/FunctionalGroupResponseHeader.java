package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="AK1")
public class FunctionalGroupResponseHeader {


	@EDIElement(fieldName="AK101", dataElement="479")
	@NotNull
	@Size(min=2, max=2)
	private String functionalIdentifierCode;
	
	
	@EDIElement(fieldName="AK102", dataElement="28")
	@NotNull
	@Size(min=1, max=9)
	private String groupControlNumber;


	public String getFunctionalIdentifierCode() {
		return functionalIdentifierCode;
	}


	public void setFunctionalIdentifierCode(String functionalIdentifierCode) {
		this.functionalIdentifierCode = functionalIdentifierCode;
	}


	public String getGroupControlNumber() {
		return groupControlNumber;
	}


	public void setGroupControlNumber(String groupControlNumber) {
		this.groupControlNumber = groupControlNumber;
	}


	@Override
	public String toString() {
		return "FunctionalGroupResponseHeader [functionalIdentifierCode="
				+ functionalIdentifierCode + ", groupControlNumber="
				+ groupControlNumber + "]";
	}
	
	
}
