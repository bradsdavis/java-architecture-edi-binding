package javax.edi.model.x12.edi846;

import javax.edi.model.x12.TransactionSetTrailer;
import javax.edi.model.x12.edi846.segment.TransactionSetTotals;
import javax.validation.constraints.NotNull;

public class Trailer {

	@NotNull
	private TransactionSetTotals transactionSetTotals;
	
	@NotNull
	private TransactionSetTrailer transactionSetTrailer;
}
