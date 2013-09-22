package javax.edi.model.x12.edi810.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="SE")
public class TransactionSetTrailer {

	@EDIElement(fieldName="SE01", dataElement="96")
	@NotNull
	@Size(min=1, max=6)
	private String numberOfIncludedSegments;
	
	@EDIElement(fieldName="SE02", dataElement="329")
	@NotNull
	@Size(min=4, max=9)
	private String transactionControlNumber;

}
