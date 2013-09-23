package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="AK3")
public class SegmentNoteInformation {
	
	@EDIElement(fieldName="AK301", dataElement="721")
	@NotNull
	@Size(min=2, max=3)
	private String segmentIDCode;
	
	
	@EDIElement(fieldName="AK302", dataElement="719")
	@NotNull
	@Size(min=1, max=6)
	private String segmentPositioninTransactionSet;


	public String getSegmentIDCode() {
		return segmentIDCode;
	}


	public void setSegmentIDCode(String segmentIDCode) {
		this.segmentIDCode = segmentIDCode;
	}


	public String getSegmentPositioninTransactionSet() {
		return segmentPositioninTransactionSet;
	}


	public void setSegmentPositioninTransactionSet(
			String segmentPositioninTransactionSet) {
		this.segmentPositioninTransactionSet = segmentPositioninTransactionSet;
	}

	
}
