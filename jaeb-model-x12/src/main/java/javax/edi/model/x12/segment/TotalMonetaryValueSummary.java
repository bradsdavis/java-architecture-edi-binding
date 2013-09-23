package javax.edi.model.x12.segment;

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

	public BigDecimal getTotalInvoiceAmount() {
		return totalInvoiceAmount;
	}

	public void setTotalInvoiceAmount(BigDecimal totalInvoiceAmount) {
		this.totalInvoiceAmount = totalInvoiceAmount;
	}

	public BigDecimal getAmountSubjectToDiscount() {
		return amountSubjectToDiscount;
	}

	public void setAmountSubjectToDiscount(BigDecimal amountSubjectToDiscount) {
		this.amountSubjectToDiscount = amountSubjectToDiscount;
	}

	public BigDecimal getDiscountedAmountDue() {
		return discountedAmountDue;
	}

	public void setDiscountedAmountDue(BigDecimal discountedAmountDue) {
		this.discountedAmountDue = discountedAmountDue;
	}

	public BigDecimal getTermsDiscountAmount() {
		return termsDiscountAmount;
	}

	public void setTermsDiscountAmount(BigDecimal termsDiscountAmount) {
		this.termsDiscountAmount = termsDiscountAmount;
	}

}
