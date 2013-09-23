package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="AK2")
public class TransactionSetResponseHeader {

	@EDIElement(fieldName="AK201", dataElement="143")
	@NotNull
	@Size(min=3, max=3)
	private String transactionSetIdentifierCode;
	
	
	@EDIElement(fieldName="AK202", dataElement="329")
	@NotNull
	@Size(min=4, max=9)
	private String transactionSetControlNumber;


	public String getTransactionSetIdentifierCode() {
		return transactionSetIdentifierCode;
	}


	public void setTransactionSetIdentifierCode(String transactionSetIdentifierCode) {
		this.transactionSetIdentifierCode = transactionSetIdentifierCode;
	}


	public String getTransactionSetControlNumber() {
		return transactionSetControlNumber;
	}


	public void setTransactionSetControlNumber(String transactionSetControlNumber) {
		this.transactionSetControlNumber = transactionSetControlNumber;
	}
	
	
}
