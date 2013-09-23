package javax.edi.model.x12.edi997.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.FunctionalGroupResponseHeader;
import javax.edi.model.x12.segment.TransactionSetHeader;

@EDISegmentGroup
public class Header {

	private TransactionSetHeader transactionSetHeader;
	private FunctionalGroupResponseHeader functionalGroupResponseHeader;
	
	public TransactionSetHeader getTransactionSetHeader() {
		return transactionSetHeader;
	}
	public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
		this.transactionSetHeader = transactionSetHeader;
	}
	public FunctionalGroupResponseHeader getFunctionalGroupResponseHeader() {
		return functionalGroupResponseHeader;
	}
	public void setFunctionalGroupResponseHeader(
			FunctionalGroupResponseHeader functionalGroupResponseHeader) {
		this.functionalGroupResponseHeader = functionalGroupResponseHeader;
	}
	
	
}
