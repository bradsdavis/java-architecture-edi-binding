package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="PO1")
public class POBaselineItemData {

	
	@EDIElement(fieldName="PO101", dataElement="350")
	@Size(min=1, max=11)
	private String assignedIdentifier;
	
	
	@EDIElement(fieldName="PO102", dataElement="330")
	@NotNull
	@Size(min=1, max=9)
	private String quantity;
	
	@EDIElement(fieldName="PO103", dataElement="355")
	@NotNull
	@Size(min=2, max=2)
	private String unitOfMeasure;
	
	
	@EDIElement(fieldName="PO104", dataElement="212")
	@Size(min=1, max=14)
	private String unitPrice;
	
	
	@EDIElement(fieldName="PO105", dataElement="639")
	@Size(min=2, max=2)
	private String basisUnitPriceCode;
	
	
	@EDIElement(fieldName="PO106", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQual1;
	
	
	@EDIElement(fieldName="PO107", dataElement="234")
	@Size(min=1, max=30)
	private String prodServID1;
	
	
	@EDIElement(fieldName="PO108", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQual2;
	
	
	@EDIElement(fieldName="PO109", dataElement="234")
	@Size(min=1, max=30)
	private String prodServID2;


	public String getAssignedIdentifier() {
		return assignedIdentifier;
	}


	public void setAssignedIdentifier(String assignedIdentifier) {
		this.assignedIdentifier = assignedIdentifier;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}


	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}


	public String getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getBasisUnitPriceCode() {
		return basisUnitPriceCode;
	}


	public void setBasisUnitPriceCode(String basisUnitPriceCode) {
		this.basisUnitPriceCode = basisUnitPriceCode;
	}


	public String getProdServIDQual1() {
		return prodServIDQual1;
	}


	public void setProdServIDQual1(String prodServIDQual1) {
		this.prodServIDQual1 = prodServIDQual1;
	}


	public String getProdServID1() {
		return prodServID1;
	}


	public void setProdServID1(String prodServID1) {
		this.prodServID1 = prodServID1;
	}


	public String getProdServIDQual2() {
		return prodServIDQual2;
	}


	public void setProdServIDQual2(String prodServIDQual2) {
		this.prodServIDQual2 = prodServIDQual2;
	}


	public String getProdServID2() {
		return prodServID2;
	}


	public void setProdServID2(String prodServID2) {
		this.prodServID2 = prodServID2;
	}
	
	

}
