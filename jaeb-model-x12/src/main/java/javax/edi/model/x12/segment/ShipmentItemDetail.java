package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="SN1")
public class ShipmentItemDetail {

	@Size(min=1, max=20)
	@EDIElement(fieldName="SN101", dataElement="350")
	private String assignedIdentificationNumber;
	
	@Size(min=1, max=10)
	@NotNull
	@EDIElement(fieldName="SN102", dataElement="382")
	private String numberOfUnitsShipped;
	
	@Size(min=2, max=2)
	@NotNull
	@EDIElement(fieldName="SN103", dataElement="385")
	private String unitOfMeasureCode;

	public String getAssignedIdentificationNumber() {
		return assignedIdentificationNumber;
	}

	public void setAssignedIdentificationNumber(String assignedIdentificationNumber) {
		this.assignedIdentificationNumber = assignedIdentificationNumber;
	}

	public String getNumberOfUnitsShipped() {
		return numberOfUnitsShipped;
	}

	public void setNumberOfUnitsShipped(String numberOfUnitsShipped) {
		this.numberOfUnitsShipped = numberOfUnitsShipped;
	}

	public String getUnitOfMeasureCode() {
		return unitOfMeasureCode;
	}

	public void setUnitOfMeasureCode(String unitOfMeasureCode) {
		this.unitOfMeasureCode = unitOfMeasureCode;
	}

	
}
