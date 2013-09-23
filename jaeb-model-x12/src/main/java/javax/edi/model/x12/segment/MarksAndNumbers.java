package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;

@EDISegment(tag="MAN")
public class MarksAndNumbers {

	@Size(min=1, max=2)
	@EDIElement(fieldName="MAN01", dataElement="88")
	private String marksAndNumbersQualifier;
	
	@Size(min=1, max=48)
	@EDIElement(fieldName="MAN02", dataElement="87")
	private String marksAndNumbers;

	public String getMarksAndNumbersQualifier() {
		return marksAndNumbersQualifier;
	}

	public void setMarksAndNumbersQualifier(String marksAndNumbersQualifier) {
		this.marksAndNumbersQualifier = marksAndNumbersQualifier;
	}

	public String getMarksAndNumbers() {
		return marksAndNumbers;
	}

	public void setMarksAndNumbers(String marksAndNumbers) {
		this.marksAndNumbers = marksAndNumbers;
	}
	
	

}
