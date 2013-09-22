package javax.edi.model.x12.edi850.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="IEA")
public class InterchangeEnvelopeTrailer {

	@NotNull
	@Size(min = 1, max = 5)
	@EDIElement
	private String numberOfIncludedGroups; // Total number of group envelopes in this interchange (transmission)
	
	@NotNull
	@Size(min = 9, max = 9)
	@EDIElement
	private String interchangeControlNumber; // A number which matches the control number on the ISA segment of this interchange

}
