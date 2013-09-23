package javax.edi.model.x12.edi846.segment;

import javax.edi.model.x12.segment.TransactionSetTotals;
import javax.edi.model.x12.segment.TransactionSetTrailer;
import javax.validation.constraints.NotNull;

public class Trailer {

	@NotNull
	private TransactionSetTotals transactionSetTotals;
	
	@NotNull
	private TransactionSetTrailer transactionSetTrailer;
}
