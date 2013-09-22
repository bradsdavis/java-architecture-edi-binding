package javax.edi.model.x12.edi855;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.TransactionSetTrailer;
import javax.edi.model.x12.segment.TransactionTotal;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Trailer {

	@NotNull
	private TransactionTotal transactionTotal;
	
	@NotNull
	private TransactionSetTrailer transactionSetTrailer;
	
	public TransactionTotal getTransactionTotal() {
		return transactionTotal;
	}
	public void setTransactionTotal(TransactionTotal transactionTotal) {
		this.transactionTotal = transactionTotal;
	}
	public TransactionSetTrailer getTransactionSetTrailer() {
		return transactionSetTrailer;
	}
	public void setTransactionSetTrailer(TransactionSetTrailer transactionSetTrailer) {
		this.transactionSetTrailer = transactionSetTrailer;
	}
	
	
}
