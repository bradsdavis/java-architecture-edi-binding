package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;

@EDISegment(tag="MEA")
public class Measurement {

	@EDIElement(fieldName="MEA01", dataElement="737")
	@Size(min=2, max=2)
	private String measurementReferenceID;

	@EDIElement(fieldName="MEA02", dataElement="738")
	@Size(min=1, max=3)
	private String measurementQualifier;

	@EDIElement(fieldName="MEA03", dataElement="739")
	@Size(min=1, max=20)
	private String measurementValue;

	@EDIElement(fieldName="MEA04", dataElement="C001")
	@Size(min=0, max=20)
	private String unit;

	public String getMeasurementReferenceID() {
		return measurementReferenceID;
	}

	public void setMeasurementReferenceID(String measurementReferenceID) {
		this.measurementReferenceID = measurementReferenceID;
	}

	public String getMeasurementQualifier() {
		return measurementQualifier;
	}

	public void setMeasurementQualifier(String measurementQualifier) {
		this.measurementQualifier = measurementQualifier;
	}

	public String getMeasurementValue() {
		return measurementValue;
	}

	public void setMeasurementValue(String measurementValue) {
		this.measurementValue = measurementValue;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	
}
