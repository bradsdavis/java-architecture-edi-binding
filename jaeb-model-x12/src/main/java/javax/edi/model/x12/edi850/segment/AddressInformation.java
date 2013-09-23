package javax.edi.model.x12.edi850.segment;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag = "N3")
public class AddressInformation {
	
	@NotNull
	@Size(min = 1, max = 35)
	@EDIElement(fieldName="N301",dataElement="166")
	private String address1; //
	
	@Size(min = 1, max = 35)
	@EDIElement(fieldName="N302",dataElement="166")
	private String address2; //

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}
}
