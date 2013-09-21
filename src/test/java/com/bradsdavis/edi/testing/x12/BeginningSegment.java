package com.bradsdavis.edi.testing.x12;

import java.util.Date;

import com.bradsdavis.edi.annotations.EDISegment;
import com.bradsdavis.edi.annotations.elements.EDIElementFormat;

@EDISegment(tag="BIG")
public class BeginningSegment {

	private String transactionSetPurposeCode;
	private String purchaseOrderTypeCode;
	private String purchaseOrderNumber;
	
	@EDIElementFormat(format="CCYYMMDD")
	private Date date;
	
	public String getTransactionSetPurposeCode() {
		return transactionSetPurposeCode;
	}
	public void setTransactionSetPurposeCode(String transactionSetPurposeCode) {
		this.transactionSetPurposeCode = transactionSetPurposeCode;
	}
	public String getPurchaseOrderTypeCode() {
		return purchaseOrderTypeCode;
	}
	public void setPurchaseOrderTypeCode(String purchaseOrderTypeCode) {
		this.purchaseOrderTypeCode = purchaseOrderTypeCode;
	}
	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}
	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
