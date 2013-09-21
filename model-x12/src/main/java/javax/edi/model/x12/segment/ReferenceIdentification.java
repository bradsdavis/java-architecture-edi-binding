package javax.edi.model.x12.segment;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag="N9")
public class ReferenceIdentification {

	
	@NotNull
	@Size(min=2,max=3)
	@EDIElement
	private String referenceIdentificationQualifier; // 'L1' = Letters and Notes
	
	@Size(min=1,max=30)
	@EDIElement
	//@Conditional
	private String referenceIdentification; 
//	If N901 is �L1�, then N902 must be:
//		�SPH�=Spec Handling Instructions
//		    (max 2)
//		�LAB�=Label Instructions(max 6)
//		�ORI�=Dealer Information(max 6)

	@Size(min = 1, max = 40)
	@EDIElement
	//@Conditional
	private String freeFormMessage; // Used only if N901 is 'L1' and N902 is 'SPH', 'LAB' or 'ORI'
	
	@Size(min = 8, max = 8)
	@EDIElement
	private String date; // 
	
	@Size(min = 4, max = 8)
	@EDIElement
	private String time; //
	
	@Size(min = 2, max = 2)
	@EDIElement
	private String timeCode; //
	
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
	
}
