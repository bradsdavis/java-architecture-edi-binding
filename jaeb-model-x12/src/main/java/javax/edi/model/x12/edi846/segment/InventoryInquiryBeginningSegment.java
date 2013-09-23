package javax.edi.model.x12.edi846.segment;

import java.util.Date;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="BIA")
public class InventoryInquiryBeginningSegment {

	
	@EDIElement(fieldName="BIA01", dataElement="353")
	@NotNull
	@Size(min=2, max=2)
	private String transactionSetPurposeCode;
	
	@EDIElement(fieldName="BIA02", dataElement="755")
	@NotNull
	@Size(min=2, max=2)
	private String reportTypeCode;
	
	@EDIElement(fieldName="BIA03", dataElement="127")
	@NotNull
	@Size(min=1, max=30)
	private String referenceNumber;
	
	@EDIElement(fieldName="BIA04", dataElement="373")
	@NotNull
	@Size(min=4, max=8)
	@EDIElementFormat("yyyyMMdd")
	private Date date;

	public String getTransactionSetPurposeCode() {
		return transactionSetPurposeCode;
	}

	public void setTransactionSetPurposeCode(String transactionSetPurposeCode) {
		this.transactionSetPurposeCode = transactionSetPurposeCode;
	}

	public String getReportTypeCode() {
		return reportTypeCode;
	}

	public void setReportTypeCode(String reportTypeCode) {
		this.reportTypeCode = reportTypeCode;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
