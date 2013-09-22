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
	private String communicationNumberQualifier;
	
	@Size(min=7,max=25)
	@EDIElement(fieldName="PER04", dataElement="364", conditional=true)
	private String communicationNumber;
	
	@Size(min=2,max=2)
	@EDIElement(conditional=true)
	private String communicationNumberQualifier2;
	
	@Size(min=7,max=25)
	@EDIElement(conditional=true)
	private String communicationNumber2;
	
	@Size(min=2,max=2)
	@EDIElement(conditional=true)
	private String communicationNumberQualifier3;
	
	@Size(min=7,max=25)
	@EDIElement(conditional=true)
	private String communicationNumber3;
	
	@Size(min=1,max=20)
	@EDIElement(conditional=true)
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
	public String getCommunicationNumberQualifier() {
		return communicationNumberQualifier;
	}
	public void setCommunicationNumberQualifier(String communicationNumberQualifier) {
		this.communicationNumberQualifier = communicationNumberQualifier;
	}
	public String getCommunicationNumber() {
		return communicationNumber;
	}
	public void setCommunicationNumber(String communicationNumber) {
		this.communicationNumber = communicationNumber;
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
}
