package javax.edi.model.x12.edi846.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@EDISegment(tag="CTT")
public class TransactionSetTotals {

	@EDIElement(fieldName="CTT01", dataElement="354")
	@NotNull
	@Min(0)
	private Integer numberofLineItems;

	public Integer getNumberofLineItems() {
		return numberofLineItems;
	}
	
	public void setNumberofLineItems(Integer numberofLineItems) {
		this.numberofLineItems = numberofLineItems;
	}
}
