package javax.edi.model.x12;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.edi.bind.annotations.elements.EDIElementFormats;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag = "GS")
public class GroupEnvelope {

	@NotNull
	@Size(min = 2, max = 2)
	@EDIElement(fieldName="GS01",dataElement="479")
	private String functionalIdCode; // 'PO' (Purchase Order)
	
	@NotNull
	@Size(min = 2, max = 15)
	@EDIElement(fieldName="GS02",dataElement="142")
	private String applicationSenderCode; // Your company's ID
	
	@NotNull
	@Size(min = 2, max = 15)
	@EDIElement(fieldName="GS03",dataElement="124")
	private String applicationReceiverCode; // '007981038' for testing, production id provided later
	
	@NotNull
	@Size(min = 8, max = 8)
	@EDIElement(fieldName="GS04",dataElement="373")
	@EDIElementFormat("yyyyMMdd")
	private String date; // CCYYMMDD format
	
	@NotNull
	@Size(min = 4, max = 6)
	@EDIElement(fieldName="GS05",dataElement="337")
	@EDIElementFormats({@EDIElementFormat("HHMMSS"),@EDIElementFormat("HHMM")})
	private String time; // HHMM or HHMMSS format
	
	@NotNull
	@Size(min = 1, max = 9)
	@EDIElement(fieldName="GS06",dataElement="28")
	private String groupControlNumber; // An identifying number used to track this group envelope
	
	@NotNull
	@Size(min = 1, max = 2)
	@EDIElement(fieldName="GS07",dataElement="455")
	private String responsibleAgencyCode; // 'X' for X12 format from the Accredited Standards Committee
	
	@NotNull
	@Size(min = 1, max = 12)
	@EDIElement(fieldName="GS08",dataElement="480")
	private String versionReleaseIdentifierCode; // '004010'

	public String getFunctionalIdCode() {
		return functionalIdCode;
	}

	public void setFunctionalIdCode(String functionalIdCode) {
		this.functionalIdCode = functionalIdCode;
	}

	public String getApplicationSenderCode() {
		return applicationSenderCode;
	}

	public void setApplicationSenderCode(String applicationSenderCode) {
		this.applicationSenderCode = applicationSenderCode;
	}

	public String getApplicationReceiverCode() {
		return applicationReceiverCode;
	}

	public void setApplicationReceiverCode(String applicationReceiverCode) {
		this.applicationReceiverCode = applicationReceiverCode;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getGroupControlNumber() {
		return groupControlNumber;
	}

	public void setGroupControlNumber(String groupControlNumber) {
		this.groupControlNumber = groupControlNumber;
	}

	public String getResponsibleAgencyCode() {
		return responsibleAgencyCode;
	}

	public void setResponsibleAgencyCode(String responsibleAgencyCode) {
		this.responsibleAgencyCode = responsibleAgencyCode;
	}

	public String getVersionReleaseIdentifierCode() {
		return versionReleaseIdentifierCode;
	}

	public void setVersionReleaseIdentifierCode(String versionReleaseIdentifierCode) {
		this.versionReleaseIdentifierCode = versionReleaseIdentifierCode;
	}
}
