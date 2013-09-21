package javax.edi.model.x12.edi810.segment;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag="ST")
public class TransactionSetHeader {

	@EDIElement
	@NotNull
	@Size(min = 3,max = 3)
	private String transactionSetIdentifierCode; // '850' Purchase Order
	
	@EDIElement
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
