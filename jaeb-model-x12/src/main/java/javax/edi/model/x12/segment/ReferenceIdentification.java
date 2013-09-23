package javax.edi.model.x12.segment;

import java.util.Date;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="N9")
public class ReferenceIdentification {

	@EDIElement(fieldName="N901", dataElement="128")
	@NotNull
	@Size(min=2, max=3)
	private String referenceIdentifierQualifier;

	@EDIElement(fieldName="N902", dataElement="127")
	@Size(min=1, max=30)
	private String referenceIdentifier;


	@EDIElement(fieldName="N903", dataElement="369")
	@Size(min=1, max=40)
	private String freeFormMessage;


	@EDIElement(fieldName="N904", dataElement="373")
	@EDIElementFormat("yyyyMMdd")
	private Date date;


	@EDIElement(fieldName="N905", dataElement="337")
	@Size(min=4, max=8)
	private String time;


	@EDIElement(fieldName="N906", dataElement="623")
	@Size(min=2, max=2)
	private String timeCode;

}
