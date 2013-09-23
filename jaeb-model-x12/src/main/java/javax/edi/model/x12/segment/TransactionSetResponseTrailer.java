package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="AK4")
public class TransactionSetResponseTrailer {

	
	@EDIElement(fieldName="AK501", dataElement="717")
	@NotNull
	@Size(min=1, max=1)
	private String transactionSetAcknowledgementCode;
	
	@EDIElement(fieldName="AK502", dataElement="718")
	@Size(min=1, max=3)
	private String transactionSetSyntaxErrorCode1;
	
	@EDIElement(fieldName="AK503", dataElement="718")
	@Size(min=1, max=3)
	private String transactionSetSyntaxErrorCode2;
	
	@EDIElement(fieldName="AK504", dataElement="718")
	@Size(min=1, max=3)
	private String transactionSetSyntaxErrorCode3;
	
	@EDIElement(fieldName="AK505", dataElement="718")
	@Size(min=1, max=3)
	private String transactionSetSyntaxErrorCode4;
	
	@EDIElement(fieldName="AK506", dataElement="718")
	@Size(min=1, max=3)
	private String transactionSetSyntaxErrorCode5;


	
	
	
	public String getTransactionSetAcknowledgementCode() {
		return transactionSetAcknowledgementCode;
	}


	public void setTransactionSetAcknowledgementCode(
			String transactionSetAcknowledgementCode) {
		this.transactionSetAcknowledgementCode = transactionSetAcknowledgementCode;
	}


	public String getTransactionSetSyntaxErrorCode1() {
		return transactionSetSyntaxErrorCode1;
	}


	public void setTransactionSetSyntaxErrorCode1(
			String transactionSetSyntaxErrorCode1) {
		this.transactionSetSyntaxErrorCode1 = transactionSetSyntaxErrorCode1;
	}


	public String getTransactionSetSyntaxErrorCode2() {
		return transactionSetSyntaxErrorCode2;
	}


	public void setTransactionSetSyntaxErrorCode2(
			String transactionSetSyntaxErrorCode2) {
		this.transactionSetSyntaxErrorCode2 = transactionSetSyntaxErrorCode2;
	}


	public String getTransactionSetSyntaxErrorCode3() {
		return transactionSetSyntaxErrorCode3;
	}


	public void setTransactionSetSyntaxErrorCode3(
			String transactionSetSyntaxErrorCode3) {
		this.transactionSetSyntaxErrorCode3 = transactionSetSyntaxErrorCode3;
	}


	public String getTransactionSetSyntaxErrorCode4() {
		return transactionSetSyntaxErrorCode4;
	}


	public void setTransactionSetSyntaxErrorCode4(
			String transactionSetSyntaxErrorCode4) {
		this.transactionSetSyntaxErrorCode4 = transactionSetSyntaxErrorCode4;
	}


	public String getTransactionSetSyntaxErrorCode5() {
		return transactionSetSyntaxErrorCode5;
	}


	public void setTransactionSetSyntaxErrorCode5(
			String transactionSetSyntaxErrorCode5) {
		this.transactionSetSyntaxErrorCode5 = transactionSetSyntaxErrorCode5;
	}

	
}
