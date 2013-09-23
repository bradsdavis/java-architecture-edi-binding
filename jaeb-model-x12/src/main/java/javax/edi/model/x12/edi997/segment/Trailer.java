package javax.edi.model.x12.edi997.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.FunctionalGroupResponseTrailer;
import javax.edi.model.x12.segment.TransactionSetTrailer;

@EDISegmentGroup
public class Trailer {

	private FunctionalGroupResponseTrailer functionalGroupResponseTrailer;
	private TransactionSetTrailer transactionSetTrailer;
	
	public FunctionalGroupResponseTrailer getFunctionalGroupResponseTrailer() {
		return functionalGroupResponseTrailer;
	}
	public void setFunctionalGroupResponseTrailer(
			FunctionalGroupResponseTrailer functionalGroupResponseTrailer) {
		this.functionalGroupResponseTrailer = functionalGroupResponseTrailer;
	}
	public TransactionSetTrailer getTransactionSetTrailer() {
		return transactionSetTrailer;
	}
	public void setTransactionSetTrailer(TransactionSetTrailer transactionSetTrailer) {
		this.transactionSetTrailer = transactionSetTrailer;
	}
	
	
}
