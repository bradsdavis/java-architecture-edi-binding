package javax.edi.model.x12;

import javax.edi.bind.annotations.EDIElement;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class InterchangeEnvelopeTrailer {

	@EDIElement(fieldName="IEA01", dataElement="I16")
	@NotNull
	@Size(min=1, max=5)
	private String numberOfIncludedGroups;


	@EDIElement(fieldName="IEA02", dataElement="I12")
	@NotNull
	@Size(min=9, max=9)
	private String interchangeControlNumber;


}
