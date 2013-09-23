package javax.edi.model.x12.segment;

import java.math.BigInteger;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="QTY")
public class Quantity {

	@EDIElement(fieldName="QTY01", dataElement="673")
	@NotNull
	@Size(min=2, max=2)
	private String quantityQualifier;

	@EDIElement(fieldName="QTY02", dataElement="380")
	@Min(0)
	private BigInteger quantity;

	public String getQuantityQualifier() {
		return quantityQualifier;
	}

	public void setQuantityQualifier(String quantityQualifier) {
		this.quantityQualifier = quantityQualifier;
	}

	public BigInteger getQuantity() {
		return quantity;
	}
	
	public void setQuantity(BigInteger quantity) {
		this.quantity = quantity;
	}
	
	
}
