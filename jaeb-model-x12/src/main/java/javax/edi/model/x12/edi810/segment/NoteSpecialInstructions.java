package javax.edi.model.x12.edi810.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;


@EDISegment(tag="NTE")
public class NoteSpecialInstructions {

	@EDIElement(fieldName="NTE01", dataElement="363")
	@Size(min=3, max=3)
	private String noteReferenceCode;
	
	
	@EDIElement(fieldName="NTE02", dataElement="3")
	@Size(min=1, max=60)
	private String freeFormMessage;


	public String getNoteReferenceCode() {
		return noteReferenceCode;
	}


	public void setNoteReferenceCode(String noteReferenceCode) {
		this.noteReferenceCode = noteReferenceCode;
	}


	public String getFreeFormMessage() {
		return freeFormMessage;
	}


	public void setFreeFormMessage(String freeFormMessage) {
		this.freeFormMessage = freeFormMessage;
	}
	

}
