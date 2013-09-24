package javax.edi.model.x12.segment;

import java.math.BigInteger;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;

@EDISegment(tag="PO4")
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

	@EDIElement(fieldName="PO408", dataElement="355")
	private BigInteger volumePerPack;

	@EDIElement(fieldName="PO409", dataElement="355")
	@Size(min=1, max=2)
	private String volumeUnitOfMeasurement;

	@EDIElement(fieldName="PO410", dataElement="355")
	private BigInteger length;

	@EDIElement(fieldName="PO411", dataElement="355")
	private BigInteger width;

	@EDIElement(fieldName="PO412", dataElement="355")
	@Size(min=2, max=2)
	private BigInteger height;


	@EDIElement(fieldName="PO413", dataElement="355")
	@Size(min=2, max=2)
	private String unitOfMeasurement;

	
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

	public BigInteger getVolumePerPack() {
		return volumePerPack;
	}

	public void setVolumePerPack(BigInteger volumePerPack) {
		this.volumePerPack = volumePerPack;
	}

	public String getVolumeUnitOfMeasurement() {
		return volumeUnitOfMeasurement;
	}

	public void setVolumeUnitOfMeasurement(String volumeUnitOfMeasurement) {
		this.volumeUnitOfMeasurement = volumeUnitOfMeasurement;
	}

	public BigInteger getLength() {
		return length;
	}

	public void setLength(BigInteger length) {
		this.length = length;
	}

	public BigInteger getWidth() {
		return width;
	}

	public void setWidth(BigInteger width) {
		this.width = width;
	}

	public BigInteger getHeight() {
		return height;
	}

	public void setHeight(BigInteger height) {
		this.height = height;
	}

	public String getUnitOfMeasurement() {
		return unitOfMeasurement;
	}

	public void setUnitOfMeasurement(String unitOfMeasurement) {
		this.unitOfMeasurement = unitOfMeasurement;
	}
	
	
}
