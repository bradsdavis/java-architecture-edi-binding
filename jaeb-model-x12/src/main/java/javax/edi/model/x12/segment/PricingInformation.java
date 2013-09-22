package javax.edi.model.x12.segment;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.Size;

@EDISegment(tag="CTP")
public class PricingInformation {
	
	@EDIElement(fieldName="CTP02", dataElement="236")
	@Size(min=3, max=3)
	private String priceIDCode;
	
	
	@EDIElement(fieldName="CTP03", dataElement="212")
	@EDIElementFormat("####.00")
	private BigDecimal unitPrice;
	
	@EDIElement(fieldName="CTP04", dataElement="380")
	private BigInteger quantity;
	
	@EDIElement(fieldName="CTP05", dataElement="355")
	@Size(min=2, max=2)
	private String unitOfMeasureCode;

	public String getPriceIDCode() {
		return priceIDCode;
	}

	public void setPriceIDCode(String priceIDCode) {
		this.priceIDCode = priceIDCode;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public BigInteger getQuantity() {
		return quantity;
	}

	public void setQuantity(BigInteger quantity) {
		this.quantity = quantity;
	}

	public String getUnitOfMeasureCode() {
		return unitOfMeasureCode;
	}

	public void setUnitOfMeasureCode(String unitOfMeasureCode) {
		this.unitOfMeasureCode = unitOfMeasureCode;
	}
	

}
