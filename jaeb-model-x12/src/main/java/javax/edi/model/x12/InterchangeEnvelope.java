package javax.edi.model.x12;

import java.util.Date;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag = "ISA")
public class InterchangeEnvelope {
	
	@EDIElement(fieldName="ISA01", dataElement="I01")
	@NotNull
	@Size(min=2, max=2)
	private String authorizationInformationQualifier;

	@EDIElement(fieldName="ISA02", dataElement="I02")
	@NotNull
	@Size(min=10, max=10)
	private String authorizationInformation;

	@EDIElement(fieldName="ISA03", dataElement="I03")
	@NotNull
	@Size(min=2, max=2)
	private String securityInformationQualifier;

	@EDIElement(fieldName="ISA04", dataElement="I04")
	@NotNull
	@Size(min=10, max=10)
	private String securityInformation;

	@EDIElement(fieldName="ISA05", dataElement="I05")
	@NotNull
	@Size(min=2, max=2)
	private String senderInterchangeIDQualifier;

	@EDIElement(fieldName="ISA06", dataElement="I06")
	@NotNull
	@Size(min=15, max=15)
	private String interchangeSenderID;

	@EDIElement(fieldName="ISA07", dataElement="I05")
	@NotNull
	@Size(min=2, max=2)
	private String receiverInterchangeIDQualifier;

	@EDIElement(fieldName="ISA08", dataElement="I07")
	@NotNull
	@Size(min=15, max=15)
	private String interchangeReceiverID;

	@EDIElement(fieldName="ISA09", dataElement="I08")
	@NotNull
	@Size(min=6, max=6)
	private Date interchangeDate;

	@EDIElement(fieldName="ISA10", dataElement="I09")
	@NotNull
	@Size(min=4, max=4)
	private String interchangeTime;

	@EDIElement(fieldName="ISA11", dataElement="I10")
	@NotNull
	@Size(min=1, max=1)
	private String interchangeControlID;

	@EDIElement(fieldName="ISA12", dataElement="I11")
	@NotNull
	@Size(min=5, max=5)
	private String interchangeVersionNumber;

	@EDIElement(fieldName="ISA13", dataElement="I12")
	@NotNull
	@Size(min=9, max=9)
	private String interchangeControlNumber;

	@EDIElement(fieldName="ISA14", dataElement="I13")
	@NotNull
	@Size(min=1, max=1)
	private String iSAAcknowledgmentRequested;

	@EDIElement(fieldName="ISA15", dataElement="I14")
	@NotNull
	@Size(min=1, max=1)
	private String testIndicator;

	@EDIElement(fieldName="ISA16", dataElement="I15")
	@NotNull
	@Size(min=1, max=1)
	private String subelementSeparator;

	public String getAuthorizationInformationQualifier() {
		return authorizationInformationQualifier;
	}

	public void setAuthorizationInformationQualifier(
			String authorizationInformationQualifier) {
		this.authorizationInformationQualifier = authorizationInformationQualifier;
	}

	public String getAuthorizationInformation() {
		return authorizationInformation;
	}

	public void setAuthorizationInformation(String authorizationInformation) {
		this.authorizationInformation = authorizationInformation;
	}

	public String getSecurityInformationQualifier() {
		return securityInformationQualifier;
	}

	public void setSecurityInformationQualifier(String securityInformationQualifier) {
		this.securityInformationQualifier = securityInformationQualifier;
	}

	public String getSecurityInformation() {
		return securityInformation;
	}

	public void setSecurityInformation(String securityInformation) {
		this.securityInformation = securityInformation;
	}

	public String getSenderInterchangeIDQualifier() {
		return senderInterchangeIDQualifier;
	}

	public void setSenderInterchangeIDQualifier(String senderInterchangeIDQualifier) {
		this.senderInterchangeIDQualifier = senderInterchangeIDQualifier;
	}

	public String getInterchangeSenderID() {
		return interchangeSenderID;
	}

	public void setInterchangeSenderID(String interchangeSenderID) {
		this.interchangeSenderID = interchangeSenderID;
	}

	public String getReceiverInterchangeIDQualifier() {
		return receiverInterchangeIDQualifier;
	}

	public void setReceiverInterchangeIDQualifier(
			String receiverInterchangeIDQualifier) {
		this.receiverInterchangeIDQualifier = receiverInterchangeIDQualifier;
	}

	public String getInterchangeReceiverID() {
		return interchangeReceiverID;
	}

	public void setInterchangeReceiverID(String interchangeReceiverID) {
		this.interchangeReceiverID = interchangeReceiverID;
	}

	public Date getInterchangeDate() {
		return interchangeDate;
	}

	public void setInterchangeDate(Date interchangeDate) {
		this.interchangeDate = interchangeDate;
	}

	public String getInterchangeTime() {
		return interchangeTime;
	}

	public void setInterchangeTime(String interchangeTime) {
		this.interchangeTime = interchangeTime;
	}

	public String getInterchangeControlID() {
		return interchangeControlID;
	}

	public void setInterchangeControlID(String interchangeControlID) {
		this.interchangeControlID = interchangeControlID;
	}

	public String getInterchangeVersionNumber() {
		return interchangeVersionNumber;
	}

	public void setInterchangeVersionNumber(String interchangeVersionNumber) {
		this.interchangeVersionNumber = interchangeVersionNumber;
	}

	public String getInterchangeControlNumber() {
		return interchangeControlNumber;
	}

	public void setInterchangeControlNumber(String interchangeControlNumber) {
		this.interchangeControlNumber = interchangeControlNumber;
	}

	public String getiSAAcknowledgmentRequested() {
		return iSAAcknowledgmentRequested;
	}

	public void setiSAAcknowledgmentRequested(String iSAAcknowledgmentRequested) {
		this.iSAAcknowledgmentRequested = iSAAcknowledgmentRequested;
	}

	public String getTestIndicator() {
		return testIndicator;
	}

	public void setTestIndicator(String testIndicator) {
		this.testIndicator = testIndicator;
	}

	public String getSubelementSeparator() {
		return subelementSeparator;
	}

	public void setSubelementSeparator(String subelementSeparator) {
		this.subelementSeparator = subelementSeparator;
	}
	
}
