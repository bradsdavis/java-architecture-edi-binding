package javax.edi.model.x12.edi855.segment;

import java.math.BigInteger;
import java.util.Date;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="BAK")
public class POAcknowledgementBeginningSegment {

	
	@EDIElement(fieldName="BAK01", dataElement="353")
	@NotNull
	@Size(min=2, max=2)
	private String transactionSetPurposeCode;
	
	
	@EDIElement(fieldName="BAK02", dataElement="587")
	@NotNull
	@Size(min=2, max=2)
	private String acknowledgmentType;
	
	
	@EDIElement(fieldName="BAK03", dataElement="324")
	@NotNull
	@Size(min=1, max=22)
	private String purchaseOrderNumber;
	
	
	@EDIElement(fieldName="BAK04", dataElement="323")
	@NotNull
	@EDIElementFormat("yyyyMMdd")
	private Date purchaseOrderDate;
	
	
	@EDIElement(fieldName="BAK05", dataElement="328")
	@Size(min=1, max=30)
	private String releaseNumber;
	
	
	@EDIElement(fieldName="BAK06", dataElement="327")
	private BigInteger changeOrderSeqNo;
	
	
	@EDIElement(fieldName="BAK07", dataElement="640")
	@Size(min=2, max=2)
	private String transactionTypeCode;


	public String getTransactionSetPurposeCode() {
		return transactionSetPurposeCode;
	}


	public void setTransactionSetPurposeCode(String transactionSetPurposeCode) {
		this.transactionSetPurposeCode = transactionSetPurposeCode;
	}


	public String getAcknowledgmentType() {
		return acknowledgmentType;
	}


	public void setAcknowledgmentType(String acknowledgmentType) {
		this.acknowledgmentType = acknowledgmentType;
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


	public String getReleaseNumber() {
		return releaseNumber;
	}


	public void setReleaseNumber(String releaseNumber) {
		this.releaseNumber = releaseNumber;
	}


	public BigInteger getChangeOrderSeqNo() {
		return changeOrderSeqNo;
	}


	public void setChangeOrderSeqNo(BigInteger changeOrderSeqNo) {
		this.changeOrderSeqNo = changeOrderSeqNo;
	}


	public String getTransactionTypeCode() {
		return transactionTypeCode;
	}


	public void setTransactionTypeCode(String transactionTypeCode) {
		this.transactionTypeCode = transactionTypeCode;
	}

	

}
