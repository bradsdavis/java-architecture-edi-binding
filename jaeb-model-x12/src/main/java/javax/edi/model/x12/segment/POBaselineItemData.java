package javax.edi.model.x12.segment;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="PO1")
public class POBaselineItemData {
	
	@EDIElement(fieldName="PO101", dataElement="350")
	@Size(min=1, max=11)
	//@Size(min = 1, max = 20, groups={USSCO.class})
	private String assignedIdentifier; // Line number (USSCO system will truncate after 6 bytes).
	
	@EDIElement(fieldName="PO102", dataElement="330")
	@NotNull
	private BigInteger quantity;
	
	@EDIElement(fieldName="PO103", dataElement="355")
	@NotNull
	@Size(min=2, max=2)
	private String unitOfMeasure;
	
	@EDIElement(fieldName="PO104", dataElement="212")
	@EDIElementFormat("####.##")
	private BigDecimal unitPrice;
	
	@EDIElement(fieldName="PO105", dataElement="639")
	@Size(min=2, max=2)
	private String basisUnitPriceCode;
	
	@EDIElement(fieldName="PO106", dataElement="235")
	@Size(min=2, max=2)
	private String prodServiceIDQualifier1;
	
	@EDIElement(fieldName="PO107", dataElement="234", conditional=true)//X?
	@Size(min=1, max=30)
	//@Size(min = 1, max = 48, groups={USSCO.class})
	private String prodServID1; // Your Item number
	
	@EDIElement(fieldName="PO108", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQual2; // 'VN'=vendor's item number
	
	@EDIElement(fieldName="PO109", dataElement="234", conditional=true)//X?
	@Size(min=1, max=30)
	//@Size(min = 1, max = 48, groups={USSCO.class})
	private String prodServID2; // USSCOÕs item number

	@EDIElement(fieldName="PO110", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQual3;
	
	@EDIElement(fieldName="PO111", dataElement="234", conditional=true)//X?
	@Size(min=1, max=30)
	//@Size(min = 1, max = 48, groups={USSCO.class})
	private String prodServID3;
	
	@EDIElement(fieldName="PO112", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQual4;
	
	@EDIElement(fieldName="PO113", dataElement="234", conditional=true)//X?
	@Size(min=1, max=30)
	//@Size(min = 1, max = 48, groups={USSCO.class})
	private String prodServID4;
	
	@EDIElement(fieldName="PO114", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQual5;
	
	@EDIElement(fieldName="PO115", dataElement="234", conditional=true)//X?
	@Size(min=1, max=30)
	//@Size(min = 1, max = 48, groups={USSCO.class})
	private String prodServID5;
	
	@EDIElement(fieldName="PO116", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQual6;
	
	@EDIElement(fieldName="PO117", dataElement="234", conditional=true)//X?
	@Size(min=1, max=30)
	//@Size(min = 1, max = 48, groups={USSCO.class})
	private String prodServID6;
	
	@EDIElement(fieldName="PO118", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQual7;
	
	@EDIElement(fieldName="PO119", dataElement="234", conditional=true)//X?
	@Size(min=1, max=30)
	//@Size(min = 1, max = 48, groups={USSCO.class})
	private String prodServID7;
	
	@EDIElement(fieldName="PO120", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQual8;
	
	@EDIElement(fieldName="PO121", dataElement="234", conditional=true)//X?
	@Size(min=1, max=30)
	//@Size(min = 1, max = 48, groups={USSCO.class})
	private String prodServID8;
	
	@EDIElement(fieldName="PO122", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQual9;
	
	@EDIElement(fieldName="PO123", dataElement="234", conditional=true)//X?
	@Size(min=1, max=30)
	//@Size(min = 1, max = 48, groups={USSCO.class})
	private String prodServID9;
	
	@EDIElement(fieldName="PO124", dataElement="235")
	@Size(min=2, max=2)
	private String prodServIDQual10;
	
	@EDIElement(fieldName="PO125", dataElement="234", conditional=true)//X?
	@Size(min=1, max=30)
	//@Size(min = 1, max = 48, groups={USSCO.class})
	private String prodServID10;
	
	public String getAssignedIdentifier() {
		return assignedIdentifier;
	}

	public void setAssignedIdentifier(String assignedIdentifier) {
		this.assignedIdentifier = assignedIdentifier;
	}

	public BigInteger getQuantity() {
		return quantity;
	}


	public void setQuantity(BigInteger quantity) {
		this.quantity = quantity;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getBasisUnitPriceCode() {
		return basisUnitPriceCode;
	}

	public void setBasisUnitPriceCode(String basisUnitPriceCode) {
		this.basisUnitPriceCode = basisUnitPriceCode;
	}

	public String getProdServiceIDQualifier1() {
		return prodServiceIDQualifier1;
	}

	public void setProdServiceIDQualifier1(String prodServiceIDQualifier1) {
		this.prodServiceIDQualifier1 = prodServiceIDQualifier1;
	}

	public String getProdServID1() {
		return prodServID1;
	}

	public void setProdServID1(String prodServID1) {
		this.prodServID1 = prodServID1;
	}

	public String getProdServIDQual2() {
		return prodServIDQual2;
	}

	public void setProdServIDQual2(String prodServIDQual2) {
		this.prodServIDQual2 = prodServIDQual2;
	}

	public String getProdServID2() {
		return prodServID2;
	}

	public void setProdServID2(String prodServID2) {
		this.prodServID2 = prodServID2;
	}

	public String getProdServIDQual3() {
		return prodServIDQual3;
	}

	public void setProdServIDQual3(String prodServIDQual3) {
		this.prodServIDQual3 = prodServIDQual3;
	}

	public String getProdServID3() {
		return prodServID3;
	}

	public void setProdServID3(String prodServID3) {
		this.prodServID3 = prodServID3;
	}

	public String getProdServIDQual4() {
		return prodServIDQual4;
	}

	public void setProdServIDQual4(String prodServIDQual4) {
		this.prodServIDQual4 = prodServIDQual4;
	}

	public String getProdServID4() {
		return prodServID4;
	}

	public void setProdServID4(String prodServID4) {
		this.prodServID4 = prodServID4;
	}

	public String getProdServIDQual5() {
		return prodServIDQual5;
	}

	public void setProdServIDQual5(String prodServIDQual5) {
		this.prodServIDQual5 = prodServIDQual5;
	}

	public String getProdServID5() {
		return prodServID5;
	}

	public void setProdServID5(String prodServID5) {
		this.prodServID5 = prodServID5;
	}

	public String getProdServIDQual6() {
		return prodServIDQual6;
	}

	public void setProdServIDQual6(String prodServIDQual6) {
		this.prodServIDQual6 = prodServIDQual6;
	}

	public String getProdServID6() {
		return prodServID6;
	}

	public void setProdServID6(String prodServID6) {
		this.prodServID6 = prodServID6;
	}

	public String getProdServIDQual7() {
		return prodServIDQual7;
	}

	public void setProdServIDQual7(String prodServIDQual7) {
		this.prodServIDQual7 = prodServIDQual7;
	}

	public String getProdServID7() {
		return prodServID7;
	}

	public void setProdServID7(String prodServID7) {
		this.prodServID7 = prodServID7;
	}

	public String getProdServIDQual8() {
		return prodServIDQual8;
	}

	public void setProdServIDQual8(String prodServIDQual8) {
		this.prodServIDQual8 = prodServIDQual8;
	}

	public String getProdServID8() {
		return prodServID8;
	}

	public void setProdServID8(String prodServID8) {
		this.prodServID8 = prodServID8;
	}

	public String getProdServIDQual9() {
		return prodServIDQual9;
	}

	public void setProdServIDQual9(String prodServIDQual9) {
		this.prodServIDQual9 = prodServIDQual9;
	}

	public String getProdServID9() {
		return prodServID9;
	}

	public void setProdServID9(String prodServID9) {
		this.prodServID9 = prodServID9;
	}

	public String getProdServIDQual10() {
		return prodServIDQual10;
	}

	public void setProdServIDQual10(String prodServIDQual10) {
		this.prodServIDQual10 = prodServIDQual10;
	}

	public String getProdServID10() {
		return prodServID10;
	}

	public void setProdServID10(String prodServID10) {
		this.prodServID10 = prodServID10;
	}
}
