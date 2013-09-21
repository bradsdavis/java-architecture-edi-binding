package javax.edi.model.x12.edi810.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@EDISegment(tag="N1")
public class Name {

	@EDIElement(fieldName="N101", dataElement="98")
	@NotNull
	@Size(min=2, max=2)
	private String entityIdentifierCode;

	@EDIElement(fieldName="N102", dataElement="93")
	@Size(min=1, max=35)
	private String name;

	@EDIElement(fieldName="N103", dataElement="66")
	@Size(min=1, max=2)
	private String identificationCodeQualifier;

	@EDIElement(fieldName="N104", dataElement="67")
	@Size(min=2, max=17)
	private String identificationCode;

}
