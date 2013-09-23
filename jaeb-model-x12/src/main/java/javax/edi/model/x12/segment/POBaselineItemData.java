package javax.edi.model.x12.segment;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="PO1")
public class POBaselineItemData {

	
	@EDIElement(fieldName="PO101", dataElement="350")
	@Size(min=1, max=11)
	private String assignedIdentifier;
	
	
	@EDIElement(fieldName="PO102", dataElement="330")
	@NotNull
	private BigInteger quantity;
	
	@EDIElement(fieldName="PO103", dataElement="355")
	@NotNull
	@Size(min=2, max=2)
	private String unitOfMeasure;
	
	@EDIElement(fieldName="PO104", dataElement="212")
	@EDIElementFormat("####.##")
	private BigDecimal unitPrice;
	
	@EDIElement(fieldName="PO105", dataElement="639")
	@Size(min=2, max=2)
	private String basisUnitPriceCode;
	
	@EDIElement(fieldName="PO106", dataElement="235")
	@Size(min=2, max=2)
	private String prodServiceIDQualifier1;
	
	
	@EDIElement(fieldName="PO107", dataElement="234")
	@Size(min=1, max=48)
	private String prodServiceID1;
	
	@EDIElement(fieldName="PO108", dataElement="235")
	@Size(min=2, max=2)
	private String prodServiceIDQualifier2;
	
	
	@EDIElement(fieldName="PO109", dataElement="234")
	@Size(min=1, max=48)
	private String prodServiceID2;
	
	
	@EDIElement(fieldName="PO110", dataElement="235")
	@Size(min=2, max=2)
	private String prodServiceIDQualifier3;
	
	
	@EDIElement(fieldName="PO111", dataElement="234")
	@Size(min=1, max=48)
	private String prodServiceID3;
	
	
	@EDIElement(fieldName="PO112", dataElement="235")
	@Size(min=2, max=2)
	private String prodServiceIDQualifier4;
	
	
	@EDIElement(fieldName="PO113", dataElement="234")
	@Size(min=1, max=48)
	private String prodServiceID4;
	
	
	@EDIElement(fieldName="PO114", dataElement="235")
	@Size(min=2, max=2)
	private String prodServiceIDQualifier5;
	
	
	@EDIElement(fieldName="PO115", dataElement="234")
	@Size(min=1, max=48)
	private String prodServiceID5;
	
	
	@EDIElement(fieldName="PO116", dataElement="235")
	@Size(min=2, max=2)
	private String prodServiceIDQualifier6;
	
	
	@EDIElement(fieldName="PO117", dataElement="234")
	@Size(min=1, max=48)
	private String prodServiceID6;
	
	
	@EDIElement(fieldName="PO118", dataElement="235")
	@Size(min=2, max=2)
	private String prodServiceIDQualifier7;
	
	
	@EDIElement(fieldName="PO119", dataElement="234")
	@Size(min=1, max=48)
	private String prodServiceID7;
	
	
	@EDIElement(fieldName="PO120", dataElement="235")
	@Size(min=2, max=2)
	private String prodServiceIDQualifier8;
	
	
	@EDIElement(fieldName="PO121", dataElement="234")
	@Size(min=1, max=48)
	private String prodServiceID8;
	
	
	@EDIElement(fieldName="PO122", dataElement="235")
	@Size(min=2, max=2)
	private String prodServiceIDQualifier9;
	
	
	@EDIElement(fieldName="PO123", dataElement="234")
	@Size(min=1, max=48)
	private String prodServiceID9;
	
	
	@EDIElement(fieldName="PO124", dataElement="235")
	@Size(min=2, max=2)
	private String prodServiceIDQualifier10;
	
	
	@EDIElement(fieldName="PO125", dataElement="234")
	@Size(min=1, max=48)
	private String prodServiceID10;


	public String getAssignedIdentifier() {
		return assignedIdentifier;
	}


	public void setAssignedIdentifier(String assignedIdentifier) {
		this.assignedIdentifier = assignedIdentifier;
	}


	public BigInteger getQuantity() {
		return quantity;
	}


	public void setQuantity(BigInteger quantity) {
		this.quantity = quantity;
	}


	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}


	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}


	public BigDecimal getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getBasisUnitPriceCode() {
		return basisUnitPriceCode;
	}


	public void setBasisUnitPriceCode(String basisUnitPriceCode) {
		this.basisUnitPriceCode = basisUnitPriceCode;
	}


	public String getProdServiceIDQualifier1() {
		return prodServiceIDQualifier1;
	}


	public void setProdServiceIDQualifier1(String prodServiceIDQualifier1) {
		this.prodServiceIDQualifier1 = prodServiceIDQualifier1;
	}


	public String getProdServiceID1() {
		return prodServiceID1;
	}


	public void setProdServiceID1(String prodServiceID1) {
		this.prodServiceID1 = prodServiceID1;
	}


	public String getProdServiceIDQualifier2() {
		return prodServiceIDQualifier2;
	}


	public void setProdServiceIDQualifier2(String prodServiceIDQualifier2) {
		this.prodServiceIDQualifier2 = prodServiceIDQualifier2;
	}


	public String getProdServiceID2() {
		return prodServiceID2;
	}


	public void setProdServiceID2(String prodServiceID2) {
		this.prodServiceID2 = prodServiceID2;
	}


	public String getProdServiceIDQualifier3() {
		return prodServiceIDQualifier3;
	}


	public void setProdServiceIDQualifier3(String prodServiceIDQualifier3) {
		this.prodServiceIDQualifier3 = prodServiceIDQualifier3;
	}


	public String getProdServiceID3() {
		return prodServiceID3;
	}


	public void setProdServiceID3(String prodServiceID3) {
		this.prodServiceID3 = prodServiceID3;
	}


	public String getProdServiceIDQualifier4() {
		return prodServiceIDQualifier4;
	}


	public void setProdServiceIDQualifier4(String prodServiceIDQualifier4) {
		this.prodServiceIDQualifier4 = prodServiceIDQualifier4;
	}


	public String getProdServiceID4() {
		return prodServiceID4;
	}


	public void setProdServiceID4(String prodServiceID4) {
		this.prodServiceID4 = prodServiceID4;
	}


	public String getProdServiceIDQualifier5() {
		return prodServiceIDQualifier5;
	}


	public void setProdServiceIDQualifier5(String prodServiceIDQualifier5) {
		this.prodServiceIDQualifier5 = prodServiceIDQualifier5;
	}


	public String getProdServiceID5() {
		return prodServiceID5;
	}


	public void setProdServiceID5(String prodServiceID5) {
		this.prodServiceID5 = prodServiceID5;
	}


	public String getProdServiceIDQualifier6() {
		return prodServiceIDQualifier6;
	}


	public void setProdServiceIDQualifier6(String prodServiceIDQualifier6) {
		this.prodServiceIDQualifier6 = prodServiceIDQualifier6;
	}


	public String getProdServiceID6() {
		return prodServiceID6;
	}


	public void setProdServiceID6(String prodServiceID6) {
		this.prodServiceID6 = prodServiceID6;
	}


	public String getProdServiceIDQualifier7() {
		return prodServiceIDQualifier7;
	}


	public void setProdServiceIDQualifier7(String prodServiceIDQualifier7) {
		this.prodServiceIDQualifier7 = prodServiceIDQualifier7;
	}


	public String getProdServiceID7() {
		return prodServiceID7;
	}


	public void setProdServiceID7(String prodServiceID7) {
		this.prodServiceID7 = prodServiceID7;
	}


	public String getProdServiceIDQualifier8() {
		return prodServiceIDQualifier8;
	}


	public void setProdServiceIDQualifier8(String prodServiceIDQualifier8) {
		this.prodServiceIDQualifier8 = prodServiceIDQualifier8;
	}


	public String getProdServiceID8() {
		return prodServiceID8;
	}


	public void setProdServiceID8(String prodServiceID8) {
		this.prodServiceID8 = prodServiceID8;
	}


	public String getProdServiceIDQualifier9() {
		return prodServiceIDQualifier9;
	}


	public void setProdServiceIDQualifier9(String prodServiceIDQualifier9) {
		this.prodServiceIDQualifier9 = prodServiceIDQualifier9;
	}


	public String getProdServiceID9() {
		return prodServiceID9;
	}


	public void setProdServiceID9(String prodServiceID9) {
		this.prodServiceID9 = prodServiceID9;
	}


	public String getProdServiceIDQualifier10() {
		return prodServiceIDQualifier10;
	}


	public void setProdServiceIDQualifier10(String prodServiceIDQualifier10) {
		this.prodServiceIDQualifier10 = prodServiceIDQualifier10;
	}


	public String getProdServiceID10() {
		return prodServiceID10;
	}


	public void setProdServiceID10(String prodServiceID10) {
		this.prodServiceID10 = prodServiceID10;
	}
	
	
}
