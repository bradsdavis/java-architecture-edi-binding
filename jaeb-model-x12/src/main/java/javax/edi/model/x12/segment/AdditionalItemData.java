package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@EDISegment(tag="IT3")
public class AdditionalItemData {

	@EDIElement(fieldName="IT301", dataElement="234")
	private String productServiceID;
	
	@EDIElement(fieldName="IT302", dataElement="355")
	private String unitOfMeasurementCode;
	
	@EDIElement(fieldName="IT303", dataElement="368")
	private String shipmentOrderStatusCode;
	
	@EDIElement(fieldName="IT304", dataElement="383")
	@Min(1) @Max(9)
	private String quantityDifference;

	public String getQuantityDifference() {
		return quantityDifference;
	}

	public void setQuantityDifference(String quantityDifference) {
		this.quantityDifference = quantityDifference;
	}

	@Override
	public String toString() {
		return "AdditionalItemData [quantityDifference=" + quantityDifference
				+ "]";
	}
}
