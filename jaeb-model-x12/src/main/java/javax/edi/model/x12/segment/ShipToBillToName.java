package javax.edi.model.x12.segment;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag = "N1")
public class ShipToBillToName {

	@NotNull
	@Size(min = 2, max = 3)
	@EDIElement
	private String entityIdentifierCode1; // 'ST' = Ship To, 'BT' = Bill To, 'SF' = Ship from
	
	@Size(min = 1, max = 35)
	@EDIElement
	//@Conditional
	private String name; // Ship To Company - Name
	
	@Size(min = 1, max = 2)
	@EDIElement
	//@Conditional
	private String identificationCodeQualitifer; //'92' = assigne by buyer, '91' = assigned by USSO
	
	@Size(min = 2, max = 17)
	@EDIElement
	//@Conditional
	private String identificationCode; 
//	If N101 is ÔBTÕ, Then USSCO Acct   Nbr goes here
//	If N101 is ÔSFÕ, Then USSCO Facility code goes here

	@Size(min = 2, max = 2)
	private String entityRelationshipCode; 
	
	@Size(min = 2, max = 3)
	@EDIElement
	private String entityIdentifierCode2; // 
}
