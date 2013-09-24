package javax.edi.model.x12.edi850.segment;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;

@EDISegment(tag="BEG")
public class PurchaseOrderBeginningSegment {

	@EDIElement(fieldName="BEG01",dataElement="353")
	@NotNull
	@Size(min = 2, max = 2)
	private String transactionSetPurposeCode; // '00' = Original

	@EDIElement(fieldName="BEG02",dataElement="92")
	@NotNull
	@Size(min = 2, max = 2)
	private String purchaseOrderTypeCode; // 'NE = New Order, 'OS' = Will Call Order

	@EDIElement(fieldName="BEG03",dataElement="324")
	@Size(min = 1, max = 30)
	private String releaseNumber;
	
	@EDIElement(fieldName="BEG04",dataElement="328")
	@NotNull
	@Size(min = 1, max = 22)
	private String purchaseOrderNumber;
	
	@EDIElement(fieldName="BEG05",dataElement="373")
	@NotNull
	@EDIElementFormat("yyyyMMdd")
	private Date purchaseOrderDate;
	
	@EDIElement(fieldName="BEG06",dataElement="367")
	@Size(min = 1, max = 30)
	private String contractNumber;
	
	@EDIElement(fieldName="BEG07",dataElement="587")
	@Size(min = 2, max = 2)
	private String acknowledgementType;
	
	@EDIElement(fieldName="BEG08",dataElement="1019")
	@Size(min = 3, max = 3)
	private String invoiceTypeCode;
	
	@EDIElement(fieldName="BEG09",dataElement="1166")
	@Size(min = 2, max = 2)
	private String contractTypeCode;
	
	@EDIElement(fieldName="BEG10",dataElement="1232")
	@Size(min = 2, max = 2)
	private String purchaseCategory;
	
	@EDIElement(fieldName="BEG11",dataElement="786")
	@Size(min = 2, max = 2)
	private String securityLevelCode;
	
	@EDIElement(fieldName="BEG12",dataElement="640")
	@Size(min = 2, max = 2)
	private String transactionTypeCode;

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
