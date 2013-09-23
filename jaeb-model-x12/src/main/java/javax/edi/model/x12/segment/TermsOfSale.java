
package javax.edi.model.x12.segment;

import java.util.Date;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.Size;


@EDISegment(tag="ITD")
public class TermsOfSale {

	
	@EDIElement(fieldName="ITD01", dataElement="336")
	@Size(min=2, max=2)
	private String termsTypeCode;
	
	
	@EDIElement(fieldName="ITD02", dataElement="333")
	@Size(min=1, max=2)
	private String termsBasisDateCode;
	
	
	@EDIElement(fieldName="ITD03", dataElement="338")
	@Size(min=1, max=6)
	private String termsDiscountPercent;
	
	
	@EDIElement(fieldName="ITD04", dataElement="370")
	@EDIElementFormat("yyyyMMdd")
	private Date termsDiscountDueDate;
	
	
	@EDIElement(fieldName="ITD06", dataElement="446")
	@EDIElementFormat("yyyyMMdd")
	private Date termsNetDueDate;


	public String getTermsTypeCode() {
		return termsTypeCode;
	}


	public void setTermsTypeCode(String termsTypeCode) {
		this.termsTypeCode = termsTypeCode;
	}


	public String getTermsBasisDateCode() {
		return termsBasisDateCode;
	}


	public void setTermsBasisDateCode(String termsBasisDateCode) {
		this.termsBasisDateCode = termsBasisDateCode;
	}


	public String getTermsDiscountPercent() {
		return termsDiscountPercent;
	}


	public void setTermsDiscountPercent(String termsDiscountPercent) {
		this.termsDiscountPercent = termsDiscountPercent;
	}


	public Date getTermsDiscountDueDate() {
		return termsDiscountDueDate;
	}


	public void setTermsDiscountDueDate(Date termsDiscountDueDate) {
		this.termsDiscountDueDate = termsDiscountDueDate;
	}


	public Date getTermsNetDueDate() {
		return termsNetDueDate;
	}


	public void setTermsNetDueDate(Date termsNetDueDate) {
		this.termsNetDueDate = termsNetDueDate;
	}
	

}
