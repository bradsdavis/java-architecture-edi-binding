package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;

@EDISegment(tag="P04")
public class ItemPhysicalDetail {

	@EDIElement(fieldName="PO401", dataElement="356")
	@Size(min=1, max=6)
	private String pack;

	@EDIElement(fieldName="PO402", dataElement="357")
	@Size(min=1, max=8)
	private String size;

	@EDIElement(fieldName="PO403", dataElement="355")
	@Size(min=2, max=2)
	private String unitofMeasureCode;

	@EDIElement(fieldName="PO406", dataElement="384")
	@Size(min=1, max=9)
	private String grossWeightofPack;

	@EDIElement(fieldName="PO407", dataElement="355")
	@Size(min=2, max=2)
	private String basisforMeasurement;

	@EDIElement(fieldName="PO414", dataElement="810")
	@Size(min=1, max=6)
	private String innerPack;

	public String getPack() {
		return pack;
	}

	public void setPack(String pack) {
		this.pack = pack;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getUnitofMeasureCode() {
		return unitofMeasureCode;
	}

	public void setUnitofMeasureCode(String unitofMeasureCode) {
		this.unitofMeasureCode = unitofMeasureCode;
	}

	public String getGrossWeightofPack() {
		return grossWeightofPack;
	}

	public void setGrossWeightofPack(String grossWeightofPack) {
		this.grossWeightofPack = grossWeightofPack;
	}

	public String getBasisforMeasurement() {
		return basisforMeasurement;
	}

	public void setBasisforMeasurement(String basisforMeasurement) {
		this.basisforMeasurement = basisforMeasurement;
	}

	public String getInnerPack() {
		return innerPack;
	}

	public void setInnerPack(String innerPack) {
		this.innerPack = innerPack;
	}
	
	
}
