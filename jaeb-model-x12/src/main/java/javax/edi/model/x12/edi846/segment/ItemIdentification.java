package javax.edi.model.x12.edi846.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="LIN")
public class ItemIdentification {

	
	@EDIElement(fieldName="LIN01", dataElement="350")
	@Size(min=1, max=20)
	private String assignedIdentificationNumber;
	
	@EDIElement(fieldName="LIN02", dataElement="235")
	@NotNull
	@Size(min=2, max=2)
	private String productServiceIDQualifier1;
	
	@EDIElement(fieldName="LIN03", dataElement="234")
	@NotNull
	@Size(min=1, max=15)
	private String productServiceID1;
	
	@EDIElement(fieldName="LIN04", dataElement="235")
	@Size(min=2, max=2)
	private String productServiceIDQualifier2;
	
	@EDIElement(fieldName="LIN05", dataElement="234")
	@Size(min=1, max=12)
	private String productServiceID2;
	
	@EDIElement(fieldName="LIN06", dataElement="235")
	@Size(min=2, max=2)
	private String productServiceIDQualifier3;
	
	@EDIElement(fieldName="LIN07", dataElement="234")
	@Size(min=1, max=15)
	private String productServiceID3;

	public String getAssignedIdentificationNumber() {
		return assignedIdentificationNumber;
	}

	public void setAssignedIdentificationNumber(String assignedIdentificationNumber) {
		this.assignedIdentificationNumber = assignedIdentificationNumber;
	}

	public String getProductServiceIDQualifier1() {
		return productServiceIDQualifier1;
	}

	public void setProductServiceIDQualifier1(String productServiceIDQualifier1) {
		this.productServiceIDQualifier1 = productServiceIDQualifier1;
	}

	public String getProductServiceID1() {
		return productServiceID1;
	}

	public void setProductServiceID1(String productServiceID1) {
		this.productServiceID1 = productServiceID1;
	}

	public String getProductServiceIDQualifier2() {
		return productServiceIDQualifier2;
	}

	public void setProductServiceIDQualifier2(String productServiceIDQualifier2) {
		this.productServiceIDQualifier2 = productServiceIDQualifier2;
	}

	public String getProductServiceID2() {
		return productServiceID2;
	}

	public void setProductServiceID2(String productServiceID2) {
		this.productServiceID2 = productServiceID2;
	}

	public String getProductServiceIDQualifier3() {
		return productServiceIDQualifier3;
	}

	public void setProductServiceIDQualifier3(String productServiceIDQualifier3) {
		this.productServiceIDQualifier3 = productServiceIDQualifier3;
	}

	public String getProductServiceID3() {
		return productServiceID3;
	}

	public void setProductServiceID3(String productServiceID3) {
		this.productServiceID3 = productServiceID3;
	}
	
	
}
