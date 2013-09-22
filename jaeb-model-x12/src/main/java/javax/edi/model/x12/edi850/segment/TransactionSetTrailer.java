package javax.edi.model.x12.edi850.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="SE")
public class TransactionSetTrailer {
	
	@NotNull
	@Size(min = 1, max = 6)
	@EDIElement
	private String numberOfIncludedSegments; // Total number of segments in the transaction set including the ST and SE segments
	
	@NotNull
	@Size(min = 4, max = 9)
	@EDIElement
	private String transactionControlNumber; // A number which matches the control number on the ST segment for this transaction
}
