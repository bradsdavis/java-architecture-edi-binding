package javax.edi.model.x12.edi810.segment;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag = "N3")
public class AddressInformation {
	
	@NotNull
	@Size(min = 1, max = 35)
	@EDIElement
	private String address1; //
	
	@Size(min = 1, max = 35)
	@EDIElement
	private String address2; //
}
