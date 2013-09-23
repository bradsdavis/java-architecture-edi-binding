package javax.edi.model.x12.segment;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag = "PER")
public class PersonContact {

	@NotNull
	@Size(min=2,max=2)
	@EDIElement(fieldName="PER01", dataElement="366")
	private String contactFunctionCode;
	
	@Size(min=1,max=40)
	@EDIElement(fieldName="PER02", dataElement="93", conditional=true)
	private String name;
	
	@Size(min=2,max=2)
	@EDIElement(fieldName="PER03", dataElement="356", conditional=true)
	private String communicationNumberQualifier1;
	
	@Size(min=7,max=25)
	@EDIElement(fieldName="PER04", dataElement="364", conditional=true)
	private String communicationNumber1;

	@EDIElement(fieldName="PER05", dataElement="365")
	@Size(min=2,max=2)
	private String communicationNumberQualifier2;
	
	@Size(min=7,max=25)
	@EDIElement(fieldName="PER06", dataElement="364")
	private String communicationNumber2;
	
	@Size(min=2,max=2)
	@EDIElement(fieldName="PER07", dataElement="365")
	private String communicationNumberQualifier3;
	
	@Size(min=7,max=25)
	@EDIElement(fieldName="PER08", dataElement="364")
	private String communicationNumber3;
	
	@Size(min=1,max=20)
	@EDIElement(fieldName="PER09", dataElement="443")
	private String contactInquiryReference;

	public String getContactFunctionCode() {
		return contactFunctionCode;
	}

	public void setContactFunctionCode(String contactFunctionCode) {
		this.contactFunctionCode = contactFunctionCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCommunicationNumberQualifier1() {
		return communicationNumberQualifier1;
	}

	public void setCommunicationNumberQualifier1(
			String communicationNumberQualifier1) {
		this.communicationNumberQualifier1 = communicationNumberQualifier1;
	}

	public String getCommunicationNumber1() {
		return communicationNumber1;
	}

	public void setCommunicationNumber1(String communicationNumber1) {
		this.communicationNumber1 = communicationNumber1;
	}

	public String getCommunicationNumberQualifier2() {
		return communicationNumberQualifier2;
	}

	public void setCommunicationNumberQualifier2(
			String communicationNumberQualifier2) {
		this.communicationNumberQualifier2 = communicationNumberQualifier2;
	}

	public String getCommunicationNumber2() {
		return communicationNumber2;
	}

	public void setCommunicationNumber2(String communicationNumber2) {
		this.communicationNumber2 = communicationNumber2;
	}

	public String getCommunicationNumberQualifier3() {
		return communicationNumberQualifier3;
	}

	public void setCommunicationNumberQualifier3(
			String communicationNumberQualifier3) {
		this.communicationNumberQualifier3 = communicationNumberQualifier3;
	}

	public String getCommunicationNumber3() {
		return communicationNumber3;
	}

	public void setCommunicationNumber3(String communicationNumber3) {
		this.communicationNumber3 = communicationNumber3;
	}

	public String getContactInquiryReference() {
		return contactInquiryReference;
	}

	public void setContactInquiryReference(String contactInquiryReference) {
		this.contactInquiryReference = contactInquiryReference;
	}
	
	
}
