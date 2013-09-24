package javax.edi.model.x12.segment;

import java.util.Date;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="N9")
public class ReferenceIdentification {

	@EDIElement(fieldName="N901",dataElement="128")
	@NotNull
	@Size(min=2,max=3)
	private String referenceIdentificationQualifier; // 'L1' = Letters and Notes
	
	@EDIElement(fieldName="N902",dataElement="127",conditional=true)
	@Size(min=1,max=30)
	private String referenceIdentification; 
//	If N901 is ?L1?, then N902 must be:
//		?SPH?=Spec Handling Instructions
//		    (max 2)
//		?LAB?=Label Instructions(max 6)
//		?ORI?=Dealer Information(max 6)

	@EDIElement(fieldName="N903",dataElement="369",conditional=true)
	@Size(min = 1, max = 40)
	private String freeFormMessage; // Used only if N901 is 'L1' and N902 is 'SPH', 'LAB' or 'ORI'
	
	@EDIElement(fieldName="N904",dataElement="373")
	@EDIElementFormat("yyyyMMdd")
	@Size(min = 8, max = 8)
	private String date;
	
	@EDIElement(fieldName="N905",dataElement="337")
	@EDIElementFormat("HHMMSS")
	@Size(min = 4, max = 8)
	private String time;
	
	@Size(min = 2, max = 2)
	@EDIElement(fieldName="N906",dataElement="623")
	private String timeCode;

	public String getReferenceIdentificationQualifier() {
		return referenceIdentificationQualifier;
	}

	public void setReferenceIdentificationQualifier(
			String referenceIdentificationQualifier) {
		this.referenceIdentificationQualifier = referenceIdentificationQualifier;
	}

	public String getReferenceIdentification() {
		return referenceIdentification;
	}

	public void setReferenceIdentification(String referenceIdentification) {
		this.referenceIdentification = referenceIdentification;
	}

	public String getFreeFormMessage() {
		return freeFormMessage;
	}

	public void setFreeFormMessage(String freeFormMessage) {
		this.freeFormMessage = freeFormMessage;
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

	public String getTimeCode() {
		return timeCode;
	}

	public void setTimeCode(String timeCode) {
		this.timeCode = timeCode;
	}
}
