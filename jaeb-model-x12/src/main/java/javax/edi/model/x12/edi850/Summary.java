package javax.edi.model.x12.edi850;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.edi850.segment.TransactionSetTotals;
import javax.edi.model.x12.edi850.segment.TransactionSetTrailer;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Summary {

	@NotNull
	private TransactionSetTotals transactionSetTotals;

	@NotNull
	private TransactionSetTrailer transactionSetTrailer;

	public TransactionSetTotals getTransactionSetTotals() {
		return transactionSetTotals;
	}

	public void setTransactionSetTotals(TransactionSetTotals transactionSetTotals) {
		this.transactionSetTotals = transactionSetTotals;
	}

	public TransactionSetTrailer getTransactionSetTrailer() {
		return transactionSetTrailer;
	}

	public void setTransactionSetTrailer(TransactionSetTrailer transactionSetTrailer) {
		this.transactionSetTrailer = transactionSetTrailer;
	}
}
