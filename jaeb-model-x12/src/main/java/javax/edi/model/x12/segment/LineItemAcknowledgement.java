package javax.edi.model.x12.segment;

import java.math.BigInteger;
import java.util.Date;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="ACK")
public class LineItemAcknowledgement {

	@EDIElement(fieldName="ACK01", dataElement="668")
	@NotNull
	@Size(min=2, max=2)
	private String lineItemStatus;

	@EDIElement(fieldName="ACK02", dataElement="380")
	@Size(min=1, max=9)
	private BigInteger quantity;


	@EDIElement(fieldName="ACK03", dataElement="355")
	@Size(min=2, max=3)
	private String unitOfMeasure;


	@EDIElement(fieldName="ACK04", dataElement="374")
	@Size(min=1, max=14)
	private String dateTimeQualifier;


	@EDIElement(fieldName="ACK05", dataElement="373")
	@EDIElementFormat("yyyyMMdd")
	private Date date;


	@EDIElement(fieldName="ACK06", dataElement="380")
	@Size(min=1, max=10)
	private String referenceNumber;


	@EDIElement(fieldName="ACK07", dataElement="355")
	@Size(min=2, max=2)
	private String productServiceIDQualifier1;


	@EDIElement(fieldName="ACK08", dataElement="352")
	@Size(min=1, max=80)
	private String productServiceID1;


	@EDIElement(fieldName="ACK09", dataElement="235")
	private String productServiceIDQualifier2;


	@EDIElement(fieldName="ACK10", dataElement="234")
	private String productServiceID2;


	public String getLineItemStatus() {
		return lineItemStatus;
	}


	public void setLineItemStatus(String lineItemStatus) {
		this.lineItemStatus = lineItemStatus;
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


	public String getDateTimeQualifier() {
		return dateTimeQualifier;
	}


	public void setDateTimeQualifier(String dateTimeQualifier) {
		this.dateTimeQualifier = dateTimeQualifier;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getReferenceNumber() {
		return referenceNumber;
	}


	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
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

	
	
}
