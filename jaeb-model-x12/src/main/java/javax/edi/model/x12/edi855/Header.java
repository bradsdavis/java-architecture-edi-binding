package javax.edi.model.x12.edi855;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.edi855.segment.BeginningSegmentForPOAcknowledgement;
import javax.edi.model.x12.segment.TransactionSetHeader;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Header {

	@NotNull
	private TransactionSetHeader transactionSetHeader;
	
	@NotNull
	private BeginningSegmentForPOAcknowledgement beginningSegment;

	public TransactionSetHeader getTransactionSetHeader() {
		return transactionSetHeader;
	}

	public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
		this.transactionSetHeader = transactionSetHeader;
	}

	public BeginningSegmentForPOAcknowledgement getBeginningSegment() {
		return beginningSegment;
	}

	public void setBeginningSegment(
			BeginningSegmentForPOAcknowledgement beginningSegment) {
		this.beginningSegment = beginningSegment;
	}
	
	
}
