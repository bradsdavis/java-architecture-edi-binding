package javax.edi.model.x12.edi810.segment;

import java.util.Date;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.Size;


@EDISegment(tag="ITD")
public class TermsofSale {

	
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
	

}
