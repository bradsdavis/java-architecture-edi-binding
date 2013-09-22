package javax.edi.model.x12.edi850.segment;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;

@EDISegment(tag="BIG")
public class BeginningSegment {

	@NotNull
	@Size(min = 2, max = 2)
	@EDIElement
	private String transactionSetPurposeCode; // '00' = Original

	@NotNull
	@Size(min = 2, max = 2)
	@EDIElement
	private String purchaseOrderTypeCode; // 'NE = New Order, 'OS' = Will Call Order

	@Size(min = 1, max = 30)
	@EDIElement
	private String releaseNumber; //
	
	@NotNull
	@Size(min = 1, max = 22)
	@EDIElement
	private String purchaseOrderNumber; // Your company's P.O. reference number for this order
	
	@NotNull
	@EDIElementFormat(format="CCYYMMDD") 
	private Date purchaseOrderDate;
	
	@Size(min = 1, max = 30)
	@EDIElement
	private String contractNumber; // 
	
	@Size(min = 2, max = 2)
	@EDIElement
	private String acknowledgementType; // 
	
	@Size(min = 3, max = 3)
	@EDIElement
	private String invoiceTypeCode; // 
	
	@Size(min = 2, max = 2)
	@EDIElement
	private String contractTypeCode; // 
	
	@Size(min = 2, max = 2)
	@EDIElement
	private String purchaseCategory; // 
	
	@Size(min = 2, max = 2)
	@EDIElement
	private String securityLevelCode; // 
	
	@Size(min = 2, max = 2)
	@EDIElement
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
