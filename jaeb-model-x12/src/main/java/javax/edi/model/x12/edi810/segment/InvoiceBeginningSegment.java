package javax.edi.model.x12.edi810.segment;

import java.math.BigInteger;
import java.util.Date;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="BIG")
public class InvoiceBeginningSegment {
	
	@EDIElement(fieldName="BIG01")
	@EDIElementFormat("yyyyMMdd")
	@NotNull
	private Date invoiceDate;
	
	@EDIElement(fieldName="BIG02")
	@NotNull
	@Size(min=1, max=7)
	private String invoiceNumber;
	
	@EDIElement(fieldName="BIG03")
	@EDIElementFormat("yyyyMMdd")
	private Date purchaseOrderDate;
	
	@EDIElement(fieldName="BIG04")
	@Size(min=1, max=22)
	private String purchaseOrderNumber;
	

	@EDIElement(fieldName="BIG05")
	@Size(min=1, max=30)
	private String releaseNumber;
	

	@EDIElement(fieldName="BIG06")
	@Size(min=2, max=2)
	private BigInteger changeOrderSequenceNumber;
	
	@EDIElement(fieldName="BIG07")
	@Size(min=2, max=2)
	private String transactionTypeCode;

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public Date getPurchaseOrderDate() {
		return purchaseOrderDate;
	}

	public void setPurchaseOrderDate(Date purchaseOrderDate) {
		this.purchaseOrderDate = purchaseOrderDate;
	}

	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}

	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}

	public String getTransactionTypeCode() {
		return transactionTypeCode;
	}

	public void setTransactionTypeCode(String transactionTypeCode) {
		this.transactionTypeCode = transactionTypeCode;
	}
	
	

	public String getReleaseNumber() {
		return releaseNumber;
	}

	public void setReleaseNumber(String releaseNumber) {
		this.releaseNumber = releaseNumber;
	}

	public BigInteger getChangeOrderSequenceNumber() {
		return changeOrderSequenceNumber;
	}

	public void setChangeOrderSequenceNumber(BigInteger changeOrderSequenceNumber) {
		this.changeOrderSequenceNumber = changeOrderSequenceNumber;
	}

	@Override
	public String toString() {
		return "InvoiceBeginningSegment [invoiceDate=" + invoiceDate
				+ ", invoiceNumber=" + invoiceNumber + ", purchaseOrderDate="
				+ purchaseOrderDate + ", purchaseOrderNumber="
				+ purchaseOrderNumber + ", transactionTypeCode="
				+ transactionTypeCode + "]";
	}
}
