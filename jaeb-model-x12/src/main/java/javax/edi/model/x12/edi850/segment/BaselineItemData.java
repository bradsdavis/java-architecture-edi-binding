package javax.edi.model.x12.edi850.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="PO1")
public class BaselineItemData {

	@Size(min = 1, max = 20)
	@EDIElement
	private String assignedIdentifier; // Line number (USSCO system will truncate after 6 bytes).
	
	@NotNull
	@Size(min = 1, max = 1)
	@EDIElement
	private String quantityOrdered; // e.g. '1', '2', '3', '20', etc.     
	
	@NotNull
	@Size(min = 2, max = 2)
	@EDIElement
	private String uomCode; // e.g. 'EA'=each,’DZ’=dozen, 'BX'=box,'CT'=carton

	@Size(min = 1, max = 17)
	@EDIElement
	//@Conditional(X?)
	private String unitPrice; // e.g. '1.00', '.34', '3.35', etc.  
	
	@Size(min = 2, max = 2)
	@EDIElement
	private String basisUnitPriceCode; // e.g. 'EA', 'BX', 'DZ', etc.
	
	@Size(min = 2, max = 2)
	@EDIElement
	private String productServiceIdQualifier; // 'BP'=buyer’s part number, 'IN'=buyer’s item number

	@Size(min = 1, max = 48)
	@EDIElement
	//@Conditional (X?)
	private String productServiceId; // Your Item number
	
	@Size(min = 2, max = 2)
	@EDIElement
	private String productServiceIdQualifier2; // 'VN'=vendor's item number
	
	@Size(min = 1, max = 48)
	@EDIElement
	//@Conditional (X?)
	private String productServiceId2; // USSCO’s item number
	
	@Size(min = 2, max = 2)
	@EDIElement
	private String productServiceIdQualifier3; // 
	
	@Size(min = 1, max = 48)
	@EDIElement
	//@Conditional (X?)
	private String productServiceId3; // 

	@Size(min = 2, max = 2)
	@EDIElement
	private String productServiceIdQualifier4; // 
	
	@Size(min = 1, max = 48)
	@EDIElement
	//@Conditional (X?)
	private String productServiceId4; // 
	
	@Size(min = 2, max = 2)
	@EDIElement
	private String productServiceIdQualifier5; // 
	
	@Size(min = 1, max = 48)
	@EDIElement
	//@Conditional (X?)
	private String productServiceId5; // 
	
	@Size(min = 2, max = 2)
	@EDIElement
	private String productServiceIdQualifier6; // 
	
	@Size(min = 1, max = 48)
	@EDIElement
	//@Conditional (X?)
	private String productServiceId6; // 
	
	@Size(min = 2, max = 2)
	@EDIElement
	private String productServiceIdQualifier7; // 
	
	@Size(min = 1, max = 48)
	@EDIElement
	//@Conditional (X?)
	private String productServiceId7; // 
	
	@Size(min = 2, max = 2)
	@EDIElement
	private String productServiceIdQualifier8; // 
	
	@Size(min = 1, max = 48)
	@EDIElement
	//@Conditional (X?)
	private String productServiceId8; // 
	
	@Size(min = 2, max = 2)
	@EDIElement
	private String productServiceIdQualifier9; // 
	
	@Size(min = 1, max = 48)
	@EDIElement
	//@Conditional (X?)
	private String productServiceId9; // 
	
	@Size(min = 2, max = 2)
	@EDIElement
	private String productServiceIdQualifier10; // 
	
	@Size(min = 1, max = 48)
	@EDIElement
	//@Conditional (X?)
	private String productServiceId10; // 

	public String getAssignedIdentifier() {
		return assignedIdentifier;
	}

	public void setAssignedIdentifier(String assignedIdentifier) {
		this.assignedIdentifier = assignedIdentifier;
	}

	public String getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(String quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public String getUomCode() {
		return uomCode;
	}

	public void setUomCode(String uomCode) {
		this.uomCode = uomCode;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getBasisUnitPriceCode() {
		return basisUnitPriceCode;
	}

	public void setBasisUnitPriceCode(String basisUnitPriceCode) {
		this.basisUnitPriceCode = basisUnitPriceCode;
	}

	public String getProductServiceIdQualifier() {
		return productServiceIdQualifier;
	}

	public void setProductServiceIdQualifier(String productServiceIdQualifier) {
		this.productServiceIdQualifier = productServiceIdQualifier;
	}

	public String getProductServiceId() {
		return productServiceId;
	}

	public void setProductServiceId(String productServiceId) {
		this.productServiceId = productServiceId;
	}

	public String getProductServiceIdQualifier2() {
		return productServiceIdQualifier2;
	}

	public void setProductServiceIdQualifier2(String productServiceIdQualifier2) {
		this.productServiceIdQualifier2 = productServiceIdQualifier2;
	}

	public String getProductServiceId2() {
		return productServiceId2;
	}

	public void setProductServiceId2(String productServiceId2) {
		this.productServiceId2 = productServiceId2;
	}

	public String getProductServiceIdQualifier3() {
		return productServiceIdQualifier3;
	}

	public void setProductServiceIdQualifier3(String productServiceIdQualifier3) {
		this.productServiceIdQualifier3 = productServiceIdQualifier3;
	}

	public String getProductServiceId3() {
		return productServiceId3;
	}

	public void setProductServiceId3(String productServiceId3) {
		this.productServiceId3 = productServiceId3;
	}

	public String getProductServiceIdQualifier4() {
		return productServiceIdQualifier4;
	}

	public void setProductServiceIdQualifier4(String productServiceIdQualifier4) {
		this.productServiceIdQualifier4 = productServiceIdQualifier4;
	}

	public String getProductServiceId4() {
		return productServiceId4;
	}

	public void setProductServiceId4(String productServiceId4) {
		this.productServiceId4 = productServiceId4;
	}

	public String getProductServiceIdQualifier5() {
		return productServiceIdQualifier5;
	}

	public void setProductServiceIdQualifier5(String productServiceIdQualifier5) {
		this.productServiceIdQualifier5 = productServiceIdQualifier5;
	}

	public String getProductServiceId5() {
		return productServiceId5;
	}

	public void setProductServiceId5(String productServiceId5) {
		this.productServiceId5 = productServiceId5;
	}

	public String getProductServiceIdQualifier6() {
		return productServiceIdQualifier6;
	}

	public void setProductServiceIdQualifier6(String productServiceIdQualifier6) {
		this.productServiceIdQualifier6 = productServiceIdQualifier6;
	}

	public String getProductServiceId6() {
		return productServiceId6;
	}

	public void setProductServiceId6(String productServiceId6) {
		this.productServiceId6 = productServiceId6;
	}

	public String getProductServiceIdQualifier7() {
		return productServiceIdQualifier7;
	}

	public void setProductServiceIdQualifier7(String productServiceIdQualifier7) {
		this.productServiceIdQualifier7 = productServiceIdQualifier7;
	}

	public String getProductServiceId7() {
		return productServiceId7;
	}

	public void setProductServiceId7(String productServiceId7) {
		this.productServiceId7 = productServiceId7;
	}

	public String getProductServiceIdQualifier8() {
		return productServiceIdQualifier8;
	}

	public void setProductServiceIdQualifier8(String productServiceIdQualifier8) {
		this.productServiceIdQualifier8 = productServiceIdQualifier8;
	}

	public String getProductServiceId8() {
		return productServiceId8;
	}

	public void setProductServiceId8(String productServiceId8) {
		this.productServiceId8 = productServiceId8;
	}

	public String getProductServiceIdQualifier9() {
		return productServiceIdQualifier9;
	}

	public void setProductServiceIdQualifier9(String productServiceIdQualifier9) {
		this.productServiceIdQualifier9 = productServiceIdQualifier9;
	}

	public String getProductServiceId9() {
		return productServiceId9;
	}

	public void setProductServiceId9(String productServiceId9) {
		this.productServiceId9 = productServiceId9;
	}

	public String getProductServiceIdQualifier10() {
		return productServiceIdQualifier10;
	}

	public void setProductServiceIdQualifier10(String productServiceIdQualifier10) {
		this.productServiceIdQualifier10 = productServiceIdQualifier10;
	}

	public String getProductServiceId10() {
		return productServiceId10;
	}

	public void setProductServiceId10(String productServiceId10) {
		this.productServiceId10 = productServiceId10;
	}
}
