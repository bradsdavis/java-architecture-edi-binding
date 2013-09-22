package javax.edi.model.x12.segment;

import java.math.BigDecimal;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="SLN")
public class SubLineItemDetail {

	@EDIElement(fieldName="SLN01", dataElement="350")
	@NotNull
	@Size(min=1, max=20)
	private String assignedIdentification;
	
	@EDIElement(fieldName="SLN02", dataElement="350")
	@Size(min=1, max=20)
	private String assignedIndent;
	
	@EDIElement(fieldName="SLN03", dataElement="661")
	@Size(min=1, max=1)
	private String configurationCode;
	
	@EDIElement(fieldName="SLN04", dataElement="380")
	@Size(min=1, max=15)
	private Integer quantity;
	
	@EDIElement(fieldName="SLN05", dataElement="355")
	@Size(min=2, max=2)
	private String unitofMeasureCode;
	
	@EDIElement(fieldName="SLN06")
	@EDIElementFormat("####.##")
	private BigDecimal unitPrice;
	
	@EDIElement(fieldName="SLN07")
	@Size(min=2, max=2)
	private String basisOfUnitPriceCode;

	@EDIElement(fieldName="SLN08")
	@Size(min=1, max=1)
	private String relationshipCode;
	
	@EDIElement(fieldName="SLN09", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQualifier1;
	
	@EDIElement(fieldName="SLN10", dataElement="234")
	@Size(min=1, max=48)
	private String prodServID1;
	
	@EDIElement(fieldName="SLN11", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQualifier2;
	
	@EDIElement(fieldName="SLN12", dataElement="234")
	@Size(min=1, max=48)
	private String prodServID2;
	
	@EDIElement(fieldName="SLN13", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQualifier3;
	
	@EDIElement(fieldName="SLN14", dataElement="234")
	@Size(min=1, max=48)
	private String prodServID3;
	
	@EDIElement(fieldName="SLN15", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQualifier4;
	
	@EDIElement(fieldName="SLN16", dataElement="234")
	@Size(min=1, max=48)
	private String prodServID4;
	
	@EDIElement(fieldName="SLN17", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQualifier5;
	
	@EDIElement(fieldName="SLN18", dataElement="234")
	@Size(min=1, max=48)
	private String prodServID5;

	public String getAssignedIdentification() {
		return assignedIdentification;
	}

	public void setAssignedIdentification(String assignedIdentification) {
		this.assignedIdentification = assignedIdentification;
	}

	public String getAssignedIndent() {
		return assignedIndent;
	}

	public void setAssignedIndent(String assignedIndent) {
		this.assignedIndent = assignedIndent;
	}

	public String getConfigurationCode() {
		return configurationCode;
	}

	public void setConfigurationCode(String configurationCode) {
		this.configurationCode = configurationCode;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getUnitofMeasureCode() {
		return unitofMeasureCode;
	}

	public void setUnitofMeasureCode(String unitofMeasureCode) {
		this.unitofMeasureCode = unitofMeasureCode;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getBasisOfUnitPriceCode() {
		return basisOfUnitPriceCode;
	}

	public void setBasisOfUnitPriceCode(String basisOfUnitPriceCode) {
		this.basisOfUnitPriceCode = basisOfUnitPriceCode;
	}

	public String getRelationshipCode() {
		return relationshipCode;
	}

	public void setRelationshipCode(String relationshipCode) {
		this.relationshipCode = relationshipCode;
	}

	public String getProdServIDQualifier1() {
		return prodServIDQualifier1;
	}

	public void setProdServIDQualifier1(String prodServIDQualifier1) {
		this.prodServIDQualifier1 = prodServIDQualifier1;
	}

	public String getProdServID1() {
		return prodServID1;
	}

	public void setProdServID1(String prodServID1) {
		this.prodServID1 = prodServID1;
	}

	public String getProdServIDQualifier2() {
		return prodServIDQualifier2;
	}

	public void setProdServIDQualifier2(String prodServIDQualifier2) {
		this.prodServIDQualifier2 = prodServIDQualifier2;
	}

	public String getProdServID2() {
		return prodServID2;
	}

	public void setProdServID2(String prodServID2) {
		this.prodServID2 = prodServID2;
	}

	public String getProdServIDQualifier3() {
		return prodServIDQualifier3;
	}

	public void setProdServIDQualifier3(String prodServIDQualifier3) {
		this.prodServIDQualifier3 = prodServIDQualifier3;
	}

	public String getProdServID3() {
		return prodServID3;
	}

	public void setProdServID3(String prodServID3) {
		this.prodServID3 = prodServID3;
	}

	public String getProdServIDQualifier4() {
		return prodServIDQualifier4;
	}

	public void setProdServIDQualifier4(String prodServIDQualifier4) {
		this.prodServIDQualifier4 = prodServIDQualifier4;
	}

	public String getProdServID4() {
		return prodServID4;
	}

	public void setProdServID4(String prodServID4) {
		this.prodServID4 = prodServID4;
	}

	public String getProdServIDQualifier5() {
		return prodServIDQualifier5;
	}

	public void setProdServIDQualifier5(String prodServIDQualifier5) {
		this.prodServIDQualifier5 = prodServIDQualifier5;
	}

	public String getProdServID5() {
		return prodServID5;
	}

	public void setProdServID5(String prodServID5) {
		this.prodServID5 = prodServID5;
	}

	
}
