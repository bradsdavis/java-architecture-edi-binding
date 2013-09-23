package javax.edi.model.x12.segment;

import java.util.Date;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag = "GS")
public class GroupEnvelopeHeader {
	
	@EDIElement(fieldName="GS01", dataElement="479")
	@NotNull
	@Size(min=2, max=2)
	private String functionalIDCode;

	@EDIElement(fieldName="GS02", dataElement="142")
	@NotNull
	@Size(min=2, max=15)
	private String applicationSendersCode;

	@EDIElement(fieldName="GS03", dataElement="124")
	@NotNull
	@Size(min=2, max=15)
	private String applicationReceiversCode;

	@EDIElement(fieldName="GS04", dataElement="373")
	@NotNull
	@EDIElementFormat("yyyyMMdd")
	private Date date;

	@EDIElement(fieldName="GS05", dataElement="337")
	@NotNull
	@Size(min=4, max=6)
	private String time;

	@EDIElement(fieldName="GS06", dataElement="28")
	@NotNull
	@Size(min=1, max=9)
	private String groupControlNumber;

	@EDIElement(fieldName="GS07", dataElement="455")
	@NotNull
	@Size(min=1, max=2)
	private String responsibleAgencyCode;

	@EDIElement(fieldName="GS08", dataElement="480")
	@NotNull
	@Size(min=1, max=12)
	private String versionReleaseIndustryIdentifierCode;

	public String getFunctionalIDCode() {
		return functionalIDCode;
	}

	public void setFunctionalIDCode(String functionalIDCode) {
		this.functionalIDCode = functionalIDCode;
	}

	public String getApplicationSendersCode() {
		return applicationSendersCode;
	}

	public void setApplicationSendersCode(String applicationSendersCode) {
		this.applicationSendersCode = applicationSendersCode;
	}

	public String getApplicationReceiversCode() {
		return applicationReceiversCode;
	}

	public void setApplicationReceiversCode(String applicationReceiversCode) {
		this.applicationReceiversCode = applicationReceiversCode;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
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

	public String getVersionReleaseIndustryIdentifierCode() {
		return versionReleaseIndustryIdentifierCode;
	}

	public void setVersionReleaseIndustryIdentifierCode(
			String versionReleaseIndustryIdentifierCode) {
		this.versionReleaseIndustryIdentifierCode = versionReleaseIndustryIdentifierCode;
	}

}
