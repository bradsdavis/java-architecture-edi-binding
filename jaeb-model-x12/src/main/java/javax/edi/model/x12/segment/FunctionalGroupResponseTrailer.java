package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="AK9")
public class FunctionalGroupResponseTrailer {

	
	@EDIElement(fieldName="AK901", dataElement="715")
	@NotNull
	@Size(min=1, max=1)
	private String functionalGroupAcknowledgeCode;
	
	
	@EDIElement(fieldName="AK902", dataElement="97")
	@NotNull
	@Size(min=1, max=6)
	private String numberOfTransactionSetsIncluded;
	
	
	@EDIElement(fieldName="AK903", dataElement="123")
	@NotNull
	@Size(min=1, max=6)
	private String numberOfReceivedTransactionSets;
	
	
	@EDIElement(fieldName="AK904", dataElement="2")
	@NotNull
	@Size(min=1, max=6)
	private String numberOfAcceptedTransactionSets;
	
	
	@EDIElement(fieldName="AK905", dataElement="716")
	@Size(min=1, max=3)
	private String functionalGroupSyntaxErrorCode1;
	
	
	@EDIElement(fieldName="AK906", dataElement="716")
	@Size(min=1, max=3)
	private String functionalGroupSyntaxErrorCode2;
	
	
	@EDIElement(fieldName="AK907", dataElement="716")
	@Size(min=1, max=3)
	private String functionalGroupSyntaxErrorCode3;
	
	
	@EDIElement(fieldName="AK908", dataElement="716")
	@Size(min=1, max=3)
	private String functionalGroupSyntaxErrorCode4;
	
	
	@EDIElement(fieldName="AK909", dataElement="716")
	@Size(min=1, max=3)
	private String functionalGroupSyntaxErrorCode5;


	public String getFunctionalGroupAcknowledgeCode() {
		return functionalGroupAcknowledgeCode;
	}


	public void setFunctionalGroupAcknowledgeCode(
			String functionalGroupAcknowledgeCode) {
		this.functionalGroupAcknowledgeCode = functionalGroupAcknowledgeCode;
	}


	public String getNumberOfTransactionSetsIncluded() {
		return numberOfTransactionSetsIncluded;
	}


	public void setNumberOfTransactionSetsIncluded(
			String numberOfTransactionSetsIncluded) {
		this.numberOfTransactionSetsIncluded = numberOfTransactionSetsIncluded;
	}


	public String getNumberOfReceivedTransactionSets() {
		return numberOfReceivedTransactionSets;
	}


	public void setNumberOfReceivedTransactionSets(
			String numberOfReceivedTransactionSets) {
		this.numberOfReceivedTransactionSets = numberOfReceivedTransactionSets;
	}


	public String getNumberOfAcceptedTransactionSets() {
		return numberOfAcceptedTransactionSets;
	}


	public void setNumberOfAcceptedTransactionSets(
			String numberOfAcceptedTransactionSets) {
		this.numberOfAcceptedTransactionSets = numberOfAcceptedTransactionSets;
	}


	public String getFunctionalGroupSyntaxErrorCode1() {
		return functionalGroupSyntaxErrorCode1;
	}


	public void setFunctionalGroupSyntaxErrorCode1(
			String functionalGroupSyntaxErrorCode1) {
		this.functionalGroupSyntaxErrorCode1 = functionalGroupSyntaxErrorCode1;
	}


	public String getFunctionalGroupSyntaxErrorCode2() {
		return functionalGroupSyntaxErrorCode2;
	}


	public void setFunctionalGroupSyntaxErrorCode2(
			String functionalGroupSyntaxErrorCode2) {
		this.functionalGroupSyntaxErrorCode2 = functionalGroupSyntaxErrorCode2;
	}


	public String getFunctionalGroupSyntaxErrorCode3() {
		return functionalGroupSyntaxErrorCode3;
	}


	public void setFunctionalGroupSyntaxErrorCode3(
			String functionalGroupSyntaxErrorCode3) {
		this.functionalGroupSyntaxErrorCode3 = functionalGroupSyntaxErrorCode3;
	}


	public String getFunctionalGroupSyntaxErrorCode4() {
		return functionalGroupSyntaxErrorCode4;
	}


	public void setFunctionalGroupSyntaxErrorCode4(
			String functionalGroupSyntaxErrorCode4) {
		this.functionalGroupSyntaxErrorCode4 = functionalGroupSyntaxErrorCode4;
	}


	public String getFunctionalGroupSyntaxErrorCode5() {
		return functionalGroupSyntaxErrorCode5;
	}


	public void setFunctionalGroupSyntaxErrorCode5(
			String functionalGroupSyntaxErrorCode5) {
		this.functionalGroupSyntaxErrorCode5 = functionalGroupSyntaxErrorCode5;
	}
	

	

}
