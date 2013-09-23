package javax.edi.model.x12;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag="ST")
public class TransactionSetHeader {

	@EDIElement(fieldName="ST01", description="Transaction Set ID Code")
	@NotNull
	@Size(min = 3,max = 3)
	private String transactionSetIdentifierCode; // '850' Purchase Order
	
	@EDIElement(fieldName="ST02", description="Transaction Set Control #")
	@NotNull
	@Size(min = 4,max = 9)
	private String transactionSetControlNumber; // An identifying number used to track this transaction
	
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
