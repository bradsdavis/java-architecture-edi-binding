package javax.edi.model.x12.edi850.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="GE")
public class GroupEnvelopeTrailer {
	
	@NotNull
	@Size(min = 1, max = 6)
	@EDIElement
	private String numberOfTransactionSets; // Total number of transaction sets in this group envelope
	
	@NotNull
	@Size(min = 1, max = 9)
	@EDIElement
	private String groupControlNumber; // A number which matches the control number on the GS segment for this group envelope
}
