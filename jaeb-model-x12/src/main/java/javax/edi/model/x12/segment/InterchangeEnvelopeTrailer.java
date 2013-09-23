package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class InterchangeEnvelopeTrailer {

	@EDIElement(fieldName="IEA01", dataElement="I16")
	@NotNull
	@Size(min=1, max=5)
	private String numberOfIncludedGroups; // Total number of group envelopes in this interchange (transmission)


	@EDIElement(fieldName="IEA02", dataElement="I12")
	@NotNull
	@Size(min=9, max=9)
	private String interchangeControlNumber; // A number which matches the control number on the ISA segment of this interchange


	public String getNumberOfIncludedGroups() {
		return numberOfIncludedGroups;
	}


	public void setNumberOfIncludedGroups(String numberOfIncludedGroups) {
		this.numberOfIncludedGroups = numberOfIncludedGroups;
	}


	public String getInterchangeControlNumber() {
		return interchangeControlNumber;
	}


	public void setInterchangeControlNumber(String interchangeControlNumber) {
		this.interchangeControlNumber = interchangeControlNumber;
	}


}
