package javax.edi.model.x12.edi850.segment;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;

@EDISegment(tag="BEG")
public class BeginningSegmentForPurchaseOrder {

	@NotNull
	@Size(min = 2, max = 2)
	@EDIElement(fieldName="BEG01",dataElement="353")
	private String transactionSetPurposeCode; // '00' = Original

	@NotNull
	@Size(min = 2, max = 2)
	@EDIElement(fieldName="BEG02",dataElement="92")
	private String purchaseOrderTypeCode; // 'NE = New Order, 'OS' = Will Call Order

	@Size(min = 1, max = 30)
	@EDIElement(fieldName="BEG03",dataElement="324")
	private String releaseNumber; //
	
	@NotNull
	@Size(min = 1, max = 22)
	@EDIElement(fieldName="BEG04",dataElement="328")
	private String purchaseOrderNumber; // Your company's P.O. reference number for this order
	
	@NotNull
	@EDIElementFormat("yyyyMMdd")
	@EDIElement(fieldName="BEG05",dataElement="373")
	private Date purchaseOrderDate;
	
	@Size(min = 1, max = 30)
	@EDIElement(fieldName="BEG06",dataElement="367")
	private String contractNumber; // 
	
	@Size(min = 2, max = 2)
	@EDIElement(fieldName="BEG07",dataElement="587")
	private String acknowledgementType; // 
	
	@Size(min = 3, max = 3)
	@EDIElement(fieldName="BEG08",dataElement="1019")
	private String invoiceTypeCode; // 
	
	@Size(min = 2, max = 2)
	@EDIElement(fieldName="BEG09",dataElement="1166")
	private String contractTypeCode; // 
	
	@Size(min = 2, max = 2)
	@EDIElement(fieldName="BEG10",dataElement="1232")
	private String purchaseCategory; // 
	
	@Size(min = 2, max = 2)
	@EDIElement(fieldName="BEG11",dataElement="786")
	private String securityLevelCode; // 
	
	@Size(min = 2, max = 2)
	@EDIElement(fieldName="BEG12",dataElement="640")
	private String transactionTypeCode; //

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

	public String getReleaseNumber() {
		return releaseNumber;
	}

	public void setReleaseNumber(String releaseNumber) {
		this.releaseNumber = releaseNumber;
	}

	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}

	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}

	public Date getPurchaseOrderDate() {
		return purchaseOrderDate;
	}

	public void setPurchaseOrderDate(Date purchaseOrderDate) {
		this.purchaseOrderDate = purchaseOrderDate;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public String getAcknowledgementType() {
		return acknowledgementType;
	}

	public void setAcknowledgementType(String acknowledgementType) {
		this.acknowledgementType = acknowledgementType;
	}

	public String getInvoiceTypeCode() {
		return invoiceTypeCode;
	}

	public void setInvoiceTypeCode(String invoiceTypeCode) {
		this.invoiceTypeCode = invoiceTypeCode;
	}

	public String getContractTypeCode() {
		return contractTypeCode;
	}

	public void setContractTypeCode(String contractTypeCode) {
		this.contractTypeCode = contractTypeCode;
	}

	public String getPurchaseCategory() {
		return purchaseCategory;
	}

	public void setPurchaseCategory(String purchaseCategory) {
		this.purchaseCategory = purchaseCategory;
	}

	public String getSecurityLevelCode() {
		return securityLevelCode;
	}

	public void setSecurityLevelCode(String securityLevelCode) {
		this.securityLevelCode = securityLevelCode;
	}

	public String getTransactionTypeCode() {
		return transactionTypeCode;
	}

	public void setTransactionTypeCode(String transactionTypeCode) {
		this.transactionTypeCode = transactionTypeCode;
	}
}
