package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="GE")
public class GroupEnvelopeTrailer {

	@EDIElement(fieldName="GE01", dataElement="97")
	@NotNull
	@Size(min=1, max=6)
	private String numberOfTransactionSets; // Total number of transaction sets in this group envelope
	
	
	@EDIElement(fieldName="GE02", dataElement="28") // A number which matches the control number on the GS segment for this group envelope
	@NotNull
	@Size(min=1, max=9)
	private String groupControlNumber;


	public String getNumberOfTransactionSets() {
		return numberOfTransactionSets;
	}


	public void setNumberOfTransactionSets(String numberOfTransactionSets) {
		this.numberOfTransactionSets = numberOfTransactionSets;
	}


	public String getGroupControlNumber() {
		return groupControlNumber;
	}


	public void setGroupControlNumber(String groupControlNumber) {
		this.groupControlNumber = groupControlNumber;
	}
	

}
