package javax.edi.model.x12.edi810.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="IT1")
public class BaselineItemData {

	@EDIElement(fieldName="IT101", dataElement="350")
	@Size(min=1, max=11)
	private String assignedIdentificationNumber;

	@EDIElement(fieldName="IT102", dataElement="358")
	@NotNull
	@Size(min=1, max=10)
	private String quantityInvoiced;

	@EDIElement(fieldName="IT103", dataElement="355")
	@NotNull
	@Size(min=2, max=2)
	private String unitOfMeasureCode;

	@EDIElement(fieldName="IT104", dataElement="212")
	@NotNull
	@Size(min=1, max=14)
	private String unitPrice;

	@EDIElement(fieldName="IT105", dataElement="639")
	@Size(min=2, max=2)
	private String basisUnitPriceCode;

	@EDIElement(fieldName="IT106", dataElement="235")
	@Size(min=2, max=2)
	private String productServiceIDQualifier1;

	@EDIElement(fieldName="IT107", dataElement="234")
	@Size(min=1, max=30)
	private String productServiceID1;

	@EDIElement(fieldName="IT108", dataElement="235")
	@Size(min=2, max=2)
	private String productServiceIDQualifier2;

	@EDIElement(fieldName="IT109", dataElement="234")
	@Size(min=1, max=30)
	private String productServiceID2;

	@EDIElement(fieldName="IT110", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQualifier3;

	@EDIElement(fieldName="IT111", dataElement="234")
	@Size(min=1, max=30)
	private String productServiceID3;

}
