package javax.edi.model.x12.edi810.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;

@EDISegment(tag="CTT")
public class TransactionTotal {

	@EDIElement(fieldName="CTT01", dataElement="354")
	@NotNull
	private Integer numberOfLineItems;

	public Integer getNumberOfLineItems() {
		return numberOfLineItems;
	}

	public void setNumberOfLineItems(Integer numberOfLineItems) {
		this.numberOfLineItems = numberOfLineItems;
	}

}
