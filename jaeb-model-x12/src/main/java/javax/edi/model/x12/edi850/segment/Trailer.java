package javax.edi.model.x12.edi850.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.TransactionSetTrailer;
import javax.edi.model.x12.segment.TransactionTotal;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Trailer {

	@NotNull
	private TransactionTotal transactionTotals;
	
	@NotNull
	private TransactionSetTrailer transactionSetTrailer;

	public TransactionTotal getTransactionTotals() {
		return transactionTotals;
	}

	public void setTransactionTotals(TransactionTotal transactionTotals) {
		this.transactionTotals = transactionTotals;
	}

	public TransactionSetTrailer getTransactionSetTrailer() {
		return transactionSetTrailer;
	}

	public void setTransactionSetTrailer(TransactionSetTrailer transactionSetTrailer) {
		this.transactionSetTrailer = transactionSetTrailer;
	}
	
}
