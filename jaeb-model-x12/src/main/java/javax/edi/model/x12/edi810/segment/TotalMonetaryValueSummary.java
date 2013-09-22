package javax.edi.model.x12.edi810.segment;

import java.math.BigDecimal;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;


@EDISegment(tag="TDS")
public class TotalMonetaryValueSummary {

	@EDIElement(fieldName="TDS01", dataElement="361")
	@NotNull
	@EDIElementFormat("####.##")
	private BigDecimal totalInvoiceAmount;
	
	@EDIElement(fieldName="TDS02", dataElement="390")
	@EDIElementFormat("####.##")
	private BigDecimal amountSubjectToDiscount;
	
	@EDIElement(fieldName="TDS03", dataElement="391")
	@EDIElementFormat("####.##")
	private BigDecimal discountedAmountDue;
	
	@EDIElement(fieldName="TDS04", dataElement="362")
	@EDIElementFormat("####.##")
	private BigDecimal termsDiscountAmount;

}
