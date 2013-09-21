package com.bradsdavis.edi.testing.x12;

import com.bradsdavis.edi.annotations.EDISegment;

@EDISegment(tag="ST")
public class TransactionSetHeader {

	private String transactionSetIdentifierCode;
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
