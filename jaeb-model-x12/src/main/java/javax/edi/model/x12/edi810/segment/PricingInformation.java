package javax.edi.model.x12.edi810.segment;

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
	

}
