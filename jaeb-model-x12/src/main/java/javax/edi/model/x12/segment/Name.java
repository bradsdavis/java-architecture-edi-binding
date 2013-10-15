package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Transaction Segment Code: N1
 * Usage: Identify a party by type of organization, name and code.
 */
@EDISegment(tag="N1")
public class Name {

	@EDIElement(fieldName="N101", dataElement="98")
	@NotNull
	@Size(min=2, max=3)
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
	
	@EDIElement(fieldName="N105",dataElement="706")
	@Size(min = 2, max = 2)
	private String entityRelationshipCode; 
	
	@EDIElement(fieldName="N106",dataElement="98")
	@Size(min = 2, max = 3)
	private String entityIdentificationCode;

	public String getEntityIdentifierCode() {
		return entityIdentifierCode;
	}

	public void setEntityIdentifierCode(String entityIdentifierCode) {
		this.entityIdentifierCode = entityIdentifierCode;
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

	public String getEntityIdentificationCode() {
		return entityIdentificationCode;
	}

	public void setEntityIdentificationCode(String entityIdentificationCode) {
		this.entityIdentificationCode = entityIdentificationCode;
	}

}
