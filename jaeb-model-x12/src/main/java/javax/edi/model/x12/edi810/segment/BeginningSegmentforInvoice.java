package javax.edi.model.x12.edi810.segment;

import java.util.Date;

import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="BIG")
public class BeginningSegmentforInvoice {
	
	@EDIElementFormat("yyyyMMdd")
	@NotNull
	private Date invoiceDate;
	
	@NotNull
	@Size(min=1, max=7)
	private String invoiceNumber;
	
	@EDIElementFormat("yyyyMMdd")
	private Date purchaseOrderDate;
	
	@Size(min=1, max=22)
	private String purchaseOrderNumber;
	
	@Size(min=2, max=2)
	private String transactionTypeCode;
}
