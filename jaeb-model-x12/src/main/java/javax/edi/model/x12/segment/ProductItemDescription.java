package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="PID")
public class ProductItemDescription {

	@EDIElement(fieldName="PID01", dataElement="349")
	@NotNull
	@Size(min=1, max=1)
	private String itemDescriptionType;

	@EDIElement(fieldName="PID05", dataElement="352")
	@Size(min=1, max=80)
	private String description;
}
