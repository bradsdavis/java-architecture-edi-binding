package javax.edi.model.x12.edi810.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="FOB")
public class FOBRelatedInstruction {

	@EDIElement(fieldName="FOB01", dataElement="146")
	@NotNull
	@Size(min=2, max=2)
	private String shipmentMethodOfPayment;


	@EDIElement(fieldName="FOB02", dataElement="309")
	@Size(min=1, max=2)
	private String locationQualifier;


	public String getShipmentMethodOfPayment() {
		return shipmentMethodOfPayment;
	}


	public void setShipmentMethodOfPayment(String shipmentMethodOfPayment) {
		this.shipmentMethodOfPayment = shipmentMethodOfPayment;
	}


	public String getLocationQualifier() {
		return locationQualifier;
	}


	public void setLocationQualifier(String locationQualifier) {
		this.locationQualifier = locationQualifier;
	}

}
