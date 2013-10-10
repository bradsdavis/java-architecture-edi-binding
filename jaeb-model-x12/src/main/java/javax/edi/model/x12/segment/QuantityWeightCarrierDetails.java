package javax.edi.model.x12.segment;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="TD1")
public class QuantityWeightCarrierDetails {

	@NotNull
	@Size(min=3, max=3)
	@EDIElement(fieldName="TD101", dataElement="103")
	private String packagingCode;
	
	@NotNull
	@EDIElement(fieldName="TD102", dataElement="80")
	private BigInteger ladingQuantity;
	
	@EDIElement(fieldName="TD103", dataElement="23")
	@Size(min=1, max=1)
	private String commodityCodeQualifier;

	@EDIElement(fieldName="TD104", dataElement="22")
	@Size(min=1, max=30)
	private String commodityCode;

	@EDIElement(fieldName="TD105", dataElement="79")
	@Size(min=1, max=50)
	private String ladingDescription;
	
	@NotNull
	@EDIElement(fieldName="TD106", dataElement="187")
	@Size(min=1, max=2)
	private String weightQualifier;
	
	@NotNull
	@EDIElement(fieldName="TD107", dataElement="81")
	private BigDecimal weight;
	
	@NotNull
	@EDIElement(fieldName="TD108", dataElement="355")
	@Size(min=2, max=2)
	private String unitOrBasisForWeight;

	public String getPackagingCode() {
		return packagingCode;
	}
	
	public void setPackagingCode(String packagingCode) {
		this.packagingCode = packagingCode;
	}

	public BigInteger getLadingQuantity() {
		return ladingQuantity;
	}

	public void setLadingQuantity(BigInteger ladingQuantity) {
		this.ladingQuantity = ladingQuantity;
	}

	public String getCommodityCodeQualifier() {
		return commodityCodeQualifier;
	}

	public void setCommodityCodeQualifier(String commodityCodeQualifier) {
		this.commodityCodeQualifier = commodityCodeQualifier;
	}

	public String getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getLadingDescription() {
		return ladingDescription;
	}

	public void setLadingDescription(String ladingDescription) {
		this.ladingDescription = ladingDescription;
	}

	public String getWeightQualifier() {
		return weightQualifier;
	}

	public void setWeightQualifier(String weightQualifier) {
		this.weightQualifier = weightQualifier;
	}

	
	public String getUnitOrBasisForWeight() {
		return unitOrBasisForWeight;
	}

	public void setUnitOrBasisForWeight(String unitOrBasisForWeight) {
		this.unitOrBasisForWeight = unitOrBasisForWeight;
	}
	
	public BigDecimal getWeight() {
		return weight;
	}
	
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	
	
}
