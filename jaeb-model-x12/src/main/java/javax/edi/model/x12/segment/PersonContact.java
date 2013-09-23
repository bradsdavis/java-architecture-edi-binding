package javax.edi.model.x12.segment;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag = "PER")
public class PersonContact {

	@NotNull
	@Size(min=2,max=2)
	@EDIElement(fieldName="PER01", dataElement="366")
	private String contactFunctionCode;
	
	@Size(min=1,max=40)
	@EDIElement(fieldName="PER02", dataElement="93", conditional=true)
	private String name;
	
	@Size(min=2,max=2)
	@EDIElement(fieldName="PER03", dataElement="356", conditional=true)
	private String communicationNumberQualifier1;
	
	@Size(min=7,max=25)
	@EDIElement(fieldName="PER04", dataElement="364", conditional=true)
	private String communicationNumber1;

	@EDIElement(fieldName="PER05", dataElement="365")
	@Size(min=2,max=2)
	private String communicationNumberQualifier2;
	
	@Size(min=7,max=25)
	@EDIElement(fieldName="PER06", dataElement="364")
	private String communicationNumber2;
	
	@Size(min=2,max=2)
	@EDIElement(fieldName="PER07", dataElement="365")
	private String communicationNumberQualifier3;
	
	@Size(min=7,max=25)
	@EDIElement(fieldName="PER08", dataElement="364")
	private String communicationNumber3;
	
	@Size(min=1,max=20)
	@EDIElement(fieldName="PER09", dataElement="443")
	private String contactInquiryReference;
	
}
