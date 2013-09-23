package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;

@EDISegment(tag="YNQ")
public class YesNoQuestion {


	@EDIElement(fieldName="YNQ01", dataElement="1321")
	@Size(min=2, max=2)
	private String conditionIndicator;
	
	@EDIElement(fieldName="YNQ02", dataElement="1073")
	@Size(min=1, max=1)
	private String yesNoResponse;

	public String getConditionIndicator() {
		return conditionIndicator;
	}

	public void setConditionIndicator(String conditionIndicator) {
		this.conditionIndicator = conditionIndicator;
	}

	public String getYesNoResponse() {
		return yesNoResponse;
	}

	public void setYesNoResponse(String yesNoResponse) {
		this.yesNoResponse = yesNoResponse;
	}
}
