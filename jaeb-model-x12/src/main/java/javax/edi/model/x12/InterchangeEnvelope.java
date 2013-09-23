package javax.edi.model.x12;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag = "ISA")
public class InterchangeEnvelope {
	
	@NotNull
	@Size(min = 2,max = 2)
	@EDIElement(fieldName="ISA01",dataElement="I01")
	private String authorizationInformationQualifier; // '00' Additional Data Identification
	
	@NotNull
	@Size(min = 10,max = 10)
	@EDIElement(fieldName="ISA02",dataElement="I02")
	private String authorizationInformation; // Blank
	
	@NotNull 
	@Size(min = 2,max = 2)
	@EDIElement(fieldName="ISA03",dataElement="I03")
	private String securityInformationQualifier; // '00' Password
	
	@NotNull
	@Size(min = 10,max = 10)
	@EDIElement(fieldName="ISA04",dataElement="I04")
	private String securityInformation; // Blank
	
	@NotNull
	@Size(min = 2,max = 2)
	@EDIElement(fieldName="ISA05",dataElement="I05")
	private String interchangeIdQualifier; //Trading Partner ID Qualifier e.g. '01' = DUNS Number, '12' = Telephone number
	
	@NotNull
	@Size(min = 15,max = 15)
	@EDIElement(fieldName="ISA06",dataElement="I06")
	private String interchangeSenderId; // Your compoany's ID i.e. '123456789'
	
	@NotNull
	@Size(min = 2,max = 2)
	@EDIElement(fieldName="ISA07",dataElement="I05")
	private String interchangeIdQualifier2; // '01'
	
	@NotNull
	@Size(min = 15,max = 15)
	@EDIElement(fieldName="ISA08",dataElement="I07")
	private String interchangeReceiverId; // USSCO'S ID e.g. test = '007981038', production = to be provided
	
	@NotNull
	@Size(min = 6, max = 6)
	@EDIElement(fieldName="ISA09",dataElement="I08")
	private String interchangeDate; // YYMMDD format
	
	@NotNull
	@Size(min = 4, max = 4)
	@EDIElement(fieldName="ISA10",dataElement="I09")
	private String interchangeTime; // HHMM format
	
	@NotNull
	@Size(min = 1, max = 1)
	@EDIElement(fieldName="ISA11",dataElement="I10")
	private String interchangeControlId; // 'U' -ASC X12, TDCC & UCS
	
	@NotNull
	@Size(min = 5, max = 5)
	@EDIElement(fieldName="ISA12",dataElement="I11")
	private String interchangeVersionNumber; // '00401'
	
	@NotNull
	@Size(min = 9, max = 9)
	@EDIElement(fieldName="ISA13",dataElement="I12")
	private String interchangeControlNumber; // 
	
	@NotNull
	@Size(min = 1, max = 1)
	@EDIElement(fieldName="ISA14",dataElement="I13")
	private String acknowledgementRequested; // '1' Acknowledgement requested, '0' Acknowledgement NOT requested
	
	@NotNull
	@Size(min = 1, max = 1)
	@EDIElement(fieldName="ISA15",dataElement="I14")
	private String testIndicator; // 'T' Test, 'P' Production
	
	@NotNull
	@Size(min = 1, max = 1)
	@EDIElement(fieldName="ISA16",dataElement="I15")
	private String subelementSeparator; // '>'

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

	public String getInterchangeIdQualifier() {
		return interchangeIdQualifier;
	}

	public void setInterchangeIdQualifier(String interchangeIdQualifier) {
		this.interchangeIdQualifier = interchangeIdQualifier;
	}

	public String getInterchangeSenderId() {
		return interchangeSenderId;
	}

	public void setInterchangeSenderId(String interchangeSenderId) {
		this.interchangeSenderId = interchangeSenderId;
	}

	public String getInterchangeIdQualifier2() {
		return interchangeIdQualifier2;
	}

	public void setInterchangeIdQualifier2(String interchangeIdQualifier2) {
		this.interchangeIdQualifier2 = interchangeIdQualifier2;
	}

	public String getInterchangeReceiverId() {
		return interchangeReceiverId;
	}

	public void setInterchangeReceiverId(String interchangeReceiverId) {
		this.interchangeReceiverId = interchangeReceiverId;
	}

	public String getInterchangeDate() {
		return interchangeDate;
	}

	public void setInterchangeDate(String interchangeDate) {
		this.interchangeDate = interchangeDate;
	}

	public String getInterchangeTime() {
		return interchangeTime;
	}

	public void setInterchangeTime(String interchangeTime) {
		this.interchangeTime = interchangeTime;
	}

	public String getInterchangeControlId() {
		return interchangeControlId;
	}

	public void setInterchangeControlId(String interchangeControlId) {
		this.interchangeControlId = interchangeControlId;
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

	public String getAcknowledgementRequested() {
		return acknowledgementRequested;
	}

	public void setAcknowledgementRequested(String acknowledgementRequested) {
		this.acknowledgementRequested = acknowledgementRequested;
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
