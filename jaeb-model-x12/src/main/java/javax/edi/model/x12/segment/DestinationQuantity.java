package javax.edi.model.x12.segment;

import java.math.BigInteger;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="SDQ")
public class DestinationQuantity {
	
	@EDIElement(fieldName="SDQ01", dataElement="355")
	@NotNull
	@Size(min=2, max=2)
	private String unitofMeasureCode;
	
	@EDIElement(fieldName="SDQ02", dataElement="66")
	@Size(min=1, max=2)
	private String idCodeQualifier;
	
	@EDIElement(fieldName="SDQ03", dataElement="67")
	@NotNull
	@Size(min=2, max=17)
	private String idCode1;
	
	@EDIElement(fieldName="SDQ04", dataElement="380")
	@NotNull
	private BigInteger quantity1;
	
	@EDIElement(fieldName="SDQ05", dataElement="67")
	@Size(min=2, max=17)
	private String idCode2;
	
	@EDIElement(fieldName="SDQ06", dataElement="380")
	private BigInteger quantity2;
	
	@EDIElement(fieldName="SDQ07", dataElement="67")
	@NotNull
	@Size(min=2, max=17)
	private String idCode3;
	
	@EDIElement(fieldName="SDQ08", dataElement="380")
	@NotNull
	private BigInteger quantity3;
	
	@EDIElement(fieldName="SDQ09", dataElement="67")
	@Size(min=2, max=17)
	private String idCode4;
	
	@EDIElement(fieldName="SDQ10", dataElement="380")
	private BigInteger quantity4;
	
	@EDIElement(fieldName="SDQ11", dataElement="67")
	@NotNull
	@Size(min=2, max=17)
	private String idCode5;
	
	@EDIElement(fieldName="SDQ12", dataElement="380")
	@NotNull
	private BigInteger quantity5;
	
	@EDIElement(fieldName="SDQ13", dataElement="67")
	@Size(min=2, max=17)
	private String idCode6;
	
	@EDIElement(fieldName="SDQ14", dataElement="380")
	private BigInteger quantity6;
	
	@EDIElement(fieldName="SDQ15", dataElement="67")
	@NotNull
	@Size(min=2, max=17)
	private String idCode7;
	
	@EDIElement(fieldName="SDQ16", dataElement="380")
	@NotNull
	private BigInteger quantity7;
	
	@EDIElement(fieldName="SDQ17", dataElement="67")
	@Size(min=2, max=17)
	private String idCode8;
	
	@EDIElement(fieldName="SDQ18", dataElement="380")
	private BigInteger quantity8;
	
	@EDIElement(fieldName="SDQ19", dataElement="67")
	@NotNull
	@Size(min=2, max=17)
	private String idCode9;
	
	@EDIElement(fieldName="SDQ20", dataElement="380")
	@NotNull
	private BigInteger quantity9;
	
	@EDIElement(fieldName="SDQ21", dataElement="67")
	@Size(min=2, max=17)
	private String idCode10;
	
	@EDIElement(fieldName="SDQ22", dataElement="380")
	private BigInteger quantity10;

	public String getUnitofMeasureCode() {
		return unitofMeasureCode;
	}

	public void setUnitofMeasureCode(String unitofMeasureCode) {
		this.unitofMeasureCode = unitofMeasureCode;
	}

	public String getIdCodeQualifier() {
		return idCodeQualifier;
	}

	public void setIdCodeQualifier(String idCodeQualifier) {
		this.idCodeQualifier = idCodeQualifier;
	}

	public String getIdCode1() {
		return idCode1;
	}

	public void setIdCode1(String idCode1) {
		this.idCode1 = idCode1;
	}

	public BigInteger getQuantity1() {
		return quantity1;
	}

	public void setQuantity1(BigInteger quantity1) {
		this.quantity1 = quantity1;
	}

	public String getIdCode2() {
		return idCode2;
	}

	public void setIdCode2(String idCode2) {
		this.idCode2 = idCode2;
	}

	public BigInteger getQuantity2() {
		return quantity2;
	}

	public void setQuantity2(BigInteger quantity2) {
		this.quantity2 = quantity2;
	}

	public String getIdCode3() {
		return idCode3;
	}

	public void setIdCode3(String idCode3) {
		this.idCode3 = idCode3;
	}

	public BigInteger getQuantity3() {
		return quantity3;
	}

	public void setQuantity3(BigInteger quantity3) {
		this.quantity3 = quantity3;
	}

	public String getIdCode4() {
		return idCode4;
	}

	public void setIdCode4(String idCode4) {
		this.idCode4 = idCode4;
	}

	public BigInteger getQuantity4() {
		return quantity4;
	}

	public void setQuantity4(BigInteger quantity4) {
		this.quantity4 = quantity4;
	}

	public String getIdCode5() {
		return idCode5;
	}

	public void setIdCode5(String idCode5) {
		this.idCode5 = idCode5;
	}

	public BigInteger getQuantity5() {
		return quantity5;
	}

	public void setQuantity5(BigInteger quantity5) {
		this.quantity5 = quantity5;
	}

	public String getIdCode6() {
		return idCode6;
	}

	public void setIdCode6(String idCode6) {
		this.idCode6 = idCode6;
	}

	public BigInteger getQuantity6() {
		return quantity6;
	}

	public void setQuantity6(BigInteger quantity6) {
		this.quantity6 = quantity6;
	}

	public String getIdCode7() {
		return idCode7;
	}

	public void setIdCode7(String idCode7) {
		this.idCode7 = idCode7;
	}

	public BigInteger getQuantity7() {
		return quantity7;
	}

	public void setQuantity7(BigInteger quantity7) {
		this.quantity7 = quantity7;
	}

	public String getIdCode8() {
		return idCode8;
	}

	public void setIdCode8(String idCode8) {
		this.idCode8 = idCode8;
	}

	public BigInteger getQuantity8() {
		return quantity8;
	}

	public void setQuantity8(BigInteger quantity8) {
		this.quantity8 = quantity8;
	}

	public String getIdCode9() {
		return idCode9;
	}

	public void setIdCode9(String idCode9) {
		this.idCode9 = idCode9;
	}

	public BigInteger getQuantity9() {
		return quantity9;
	}

	public void setQuantity9(BigInteger quantity9) {
		this.quantity9 = quantity9;
	}

	public String getIdCode10() {
		return idCode10;
	}

	public void setIdCode10(String idCode10) {
		this.idCode10 = idCode10;
	}

	public BigInteger getQuantity10() {
		return quantity10;
	}

	public void setQuantity10(BigInteger quantity10) {
		this.quantity10 = quantity10;
	}

}
