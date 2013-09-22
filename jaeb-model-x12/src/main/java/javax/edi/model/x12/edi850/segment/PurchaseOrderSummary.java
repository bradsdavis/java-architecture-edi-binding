package javax.edi.model.x12.edi850.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class PurchaseOrderSummary {

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
