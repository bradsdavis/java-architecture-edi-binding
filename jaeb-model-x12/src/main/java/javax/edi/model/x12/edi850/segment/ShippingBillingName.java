package javax.edi.model.x12.edi850.segment;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag = "N1")
public class ShippingBillingName {

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
	private String identificationCodeQualifier; //'92' = assigne by buyer, '91' = assigned by USSO
	
	@Size(min = 2, max = 17)
	@EDIElement
	//@Conditional
	private String identificationCode; 
//	If N101 is ?BT?, Then USSCO Acct   Nbr goes here
//	If N101 is ?SF?, Then USSCO Facility code goes here

	@Size(min = 2, max = 2)
	private String entityRelationshipCode; 
	
	@Size(min = 2, max = 3)
	@EDIElement
	private String entityIdentifierCode2; // 

	public String getEntityIdentifierCode1() {
		return entityIdentifierCode1;
	}

	public void setEntityIdentifierCode1(String entityIdentifierCode1) {
		this.entityIdentifierCode1 = entityIdentifierCode1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentificationCodeQualifier() {
		return identificationCodeQualifier;
	}

	public void setIdentificationCodeQualifier(String identificationCodeQualifier) {
		this.identificationCodeQualifier = identificationCodeQualifier;
	}

	public String getIdentificationCode() {
		return identificationCode;
	}

	public void setIdentificationCode(String identificationCode) {
		this.identificationCode = identificationCode;
	}

	public String getEntityRelationshipCode() {
		return entityRelationshipCode;
	}

	public void setEntityRelationshipCode(String entityRelationshipCode) {
		this.entityRelationshipCode = entityRelationshipCode;
	}

	public String getEntityIdentifierCode2() {
		return entityIdentifierCode2;
	}

	public void setEntityIdentifierCode2(String entityIdentifierCode2) {
		this.entityIdentifierCode2 = entityIdentifierCode2;
	}
}
