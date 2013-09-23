package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="N3")
public class AddressInformation {

	@EDIElement(fieldName="N301", dataElement="166")
	@NotNull
	@Size(min=1, max=35)
	private String addressLine1;

	@EDIElement(fieldName="N302", dataElement="166")
	@Size(min=1, max=35)
	private String addressLine2;

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	
}
