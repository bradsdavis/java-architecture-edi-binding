package javax.edi.model.x12.segment;

import java.math.BigDecimal;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="IT1")
public class BaselineItemData {

	@EDIElement(fieldName="IT101", dataElement="350")
	@Size(min=1, max=11)
	private String assignedIdentificationNumber;

	@EDIElement(fieldName="IT102", dataElement="358")
	@NotNull
	@Size(min=1, max=10)
	private String quantityInvoiced;

	@EDIElement(fieldName="IT103", dataElement="355")
	@NotNull
	@Size(min=2, max=2)
	private String unitOfMeasureCode;

	@EDIElement(fieldName="IT104", dataElement="212")
	@NotNull
	@EDIElementFormat("####.##")
	private BigDecimal unitPrice;

	@EDIElement(fieldName="IT105", dataElement="639")
	@Size(min=2, max=2)
	private String basisUnitPriceCode;

	@EDIElement(fieldName="IT106", dataElement="235")
	@Size(min=2, max=2)
	private String productServiceIDQualifier1;

	@EDIElement(fieldName="IT107", dataElement="234")
	@Size(min=1, max=30)
	private String productServiceID1;

	@EDIElement(fieldName="IT108", dataElement="235")
	@Size(min=2, max=2)
	private String productServiceIDQualifier2;

	@EDIElement(fieldName="IT109", dataElement="234")
	@Size(min=1, max=30)
	private String productServiceID2;

	@EDIElement(fieldName="IT110", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQualifier3;

	@EDIElement(fieldName="IT111", dataElement="234")
	@Size(min=1, max=30)
	private String productServiceID3;

	public String getAssignedIdentificationNumber() {
		return assignedIdentificationNumber;
	}

	public void setAssignedIdentificationNumber(String assignedIdentificationNumber) {
		this.assignedIdentificationNumber = assignedIdentificationNumber;
	}

	public String getQuantityInvoiced() {
		return quantityInvoiced;
	}

	public void setQuantityInvoiced(String quantityInvoiced) {
		this.quantityInvoiced = quantityInvoiced;
	}

	public String getUnitOfMeasureCode() {
		return unitOfMeasureCode;
	}

	public void setUnitOfMeasureCode(String unitOfMeasureCode) {
		this.unitOfMeasureCode = unitOfMeasureCode;
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

	public String getProductServiceIDQualifier1() {
		return productServiceIDQualifier1;
	}

	public void setProductServiceIDQualifier1(String productServiceIDQualifier1) {
		this.productServiceIDQualifier1 = productServiceIDQualifier1;
	}

	public String getProductServiceID1() {
		return productServiceID1;
	}

	public void setProductServiceID1(String productServiceID1) {
		this.productServiceID1 = productServiceID1;
	}

	public String getProductServiceIDQualifier2() {
		return productServiceIDQualifier2;
	}

	public void setProductServiceIDQualifier2(String productServiceIDQualifier2) {
		this.productServiceIDQualifier2 = productServiceIDQualifier2;
	}

	public String getProductServiceID2() {
		return productServiceID2;
	}

	public void setProductServiceID2(String productServiceID2) {
		this.productServiceID2 = productServiceID2;
	}

	public String getProdServIDQualifier3() {
		return prodServIDQualifier3;
	}

	public void setProdServIDQualifier3(String prodServIDQualifier3) {
		this.prodServIDQualifier3 = prodServIDQualifier3;
	}

	public String getProductServiceID3() {
		return productServiceID3;
	}

	public void setProductServiceID3(String productServiceID3) {
		this.productServiceID3 = productServiceID3;
	}

	@Override
	public String toString() {
		return "BaselineItemData [assignedIdentificationNumber="
				+ assignedIdentificationNumber + ", quantityInvoiced="
				+ quantityInvoiced + ", unitOfMeasureCode=" + unitOfMeasureCode
				+ ", unitPrice=" + unitPrice + ", basisUnitPriceCode="
				+ basisUnitPriceCode + ", productServiceIDQualifier1="
				+ productServiceIDQualifier1 + ", productServiceID1="
				+ productServiceID1 + ", productServiceIDQualifier2="
				+ productServiceIDQualifier2 + ", productServiceID2="
				+ productServiceID2 + ", prodServIDQualifier3="
				+ prodServIDQualifier3 + ", productServiceID3="
				+ productServiceID3 + "]";
	}

}
