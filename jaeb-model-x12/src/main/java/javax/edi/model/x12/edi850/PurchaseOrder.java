package javax.edi.model.x12.edi850;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.edi.bind.annotations.EDIMessage;
import javax.edi.model.x12.edi850.segment.PurchaseOrderDetail;
import javax.edi.model.x12.edi850.segment.GroupEnvelope;
import javax.edi.model.x12.edi850.segment.InterchangeEnvelope;
import javax.edi.model.x12.edi850.segment.PurchaseOrderSummary;

@EDIMessage(segmentDelimiter="~",componentDelimiter=">",elementDelimiter="*")
public class PurchaseOrder {

	@NotNull
	private InterchangeEnvelope interchangeEnvelope;
	
	@NotNull
	private GroupEnvelope groupEnvelope;
	
	@NotNull
	private PurchaseOrderHeader purchaseOrderHeader;
	
	@NotNull
	private PurchaseOrderDetail detail;
	
	@NotNull
	private PurchaseOrderSummary summary;
	
	public InterchangeEnvelope getInterchangeEnvelope() {
		return interchangeEnvelope;
	}

	public void setInterchangeEnvelope(InterchangeEnvelope interchangeEnvelope) {
		this.interchangeEnvelope = interchangeEnvelope;
	}

	public GroupEnvelope getGroupEnvelope() {
		return groupEnvelope;
	}

	public void setGroupEnvelope(GroupEnvelope groupEnvelope) {
		this.groupEnvelope = groupEnvelope;
	}

	public PurchaseOrderHeader getPurchaseOrderHeader() {
		return purchaseOrderHeader;
	}

	public void setPurchaseOrderHeader(PurchaseOrderHeader purchaseOrderHeader) {
		this.purchaseOrderHeader = purchaseOrderHeader;
	}

	public PurchaseOrderDetail getDetail() {
		return detail;
	}

	public void setDetail(PurchaseOrderDetail detail) {
		this.detail = detail;
	}

	public PurchaseOrderSummary getSummary() {
		return summary;
	}

	public void setSummary(PurchaseOrderSummary summary) {
		this.summary = summary;
	}
}
