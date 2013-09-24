package javax.edi.model.x12.edi832.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="BCT")
public class PriceCatalogBeginningSegment {

	@NotNull
	@Size(min=2, max=2)
	@EDIElement(fieldName="", dataElement="")
	private String catalogPurposeCode;
	
	@Size(min=1, max=15)
	@EDIElement(fieldName="", dataElement="")
	private String catalogNumber1;
	
	@Size(min=1, max=15)
	@EDIElement(fieldName="", dataElement="")
	private String catalogVersionNumber1;
	
	@Size(min=1, max=6)
	@EDIElement(fieldName="", dataElement="")
	private String catalogRevisionNumber1;
	
	@Size(min=2, max=2)
	@EDIElement(fieldName="", dataElement="")
	private String unitOfMeasureCode;
	
	@Size(min=1, max=15)
	@EDIElement(fieldName="", dataElement="")
	private String catalogNumber2;
	
	@Size(min=1, max=15)
	@EDIElement(fieldName="", dataElement="")
	private String catalogVersionNumber2;
	
	@Size(min=1, max=6)
	@EDIElement(fieldName="", dataElement="")
	private String catalogRevisionNumber2;
	
	@Size(min=1, max=80)
	@EDIElement(fieldName="", dataElement="")
	private String description;
	
	@Size(min=2, max=2)
	@EDIElement(fieldName="", dataElement="")
	private String transactionSetPurposeCode;

	public String getCatalogPurposeCode() {
		return catalogPurposeCode;
	}

	public void setCatalogPurposeCode(String catalogPurposeCode) {
		this.catalogPurposeCode = catalogPurposeCode;
	}

	public String getCatalogNumber1() {
		return catalogNumber1;
	}

	public void setCatalogNumber1(String catalogNumber1) {
		this.catalogNumber1 = catalogNumber1;
	}

	public String getCatalogVersionNumber1() {
		return catalogVersionNumber1;
	}

	public void setCatalogVersionNumber1(String catalogVersionNumber1) {
		this.catalogVersionNumber1 = catalogVersionNumber1;
	}

	public String getCatalogRevisionNumber1() {
		return catalogRevisionNumber1;
	}

	public void setCatalogRevisionNumber1(String catalogRevisionNumber1) {
		this.catalogRevisionNumber1 = catalogRevisionNumber1;
	}

	public String getUnitOfMeasureCode() {
		return unitOfMeasureCode;
	}

	public void setUnitOfMeasureCode(String unitOfMeasureCode) {
		this.unitOfMeasureCode = unitOfMeasureCode;
	}

	public String getCatalogNumber2() {
		return catalogNumber2;
	}

	public void setCatalogNumber2(String catalogNumber2) {
		this.catalogNumber2 = catalogNumber2;
	}

	public String getCatalogVersionNumber2() {
		return catalogVersionNumber2;
	}

	public void setCatalogVersionNumber2(String catalogVersionNumber2) {
		this.catalogVersionNumber2 = catalogVersionNumber2;
	}

	public String getCatalogRevisionNumber2() {
		return catalogRevisionNumber2;
	}

	public void setCatalogRevisionNumber2(String catalogRevisionNumber2) {
		this.catalogRevisionNumber2 = catalogRevisionNumber2;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTransactionSetPurposeCode() {
		return transactionSetPurposeCode;
	}

	public void setTransactionSetPurposeCode(String transactionSetPurposeCode) {
		this.transactionSetPurposeCode = transactionSetPurposeCode;
	}
	
	
}
