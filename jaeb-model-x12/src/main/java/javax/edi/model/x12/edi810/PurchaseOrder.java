package javax.edi.model.x12.edi810;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.edi.bind.annotations.EDIMessage;
import javax.edi.model.x12.edi810.segment.Detail;
import javax.edi.model.x12.edi810.segment.GroupEnvelope;
import javax.edi.model.x12.edi810.segment.InterchangeEnvelope;
import javax.edi.model.x12.edi810.segment.Summary;

@EDIMessage(segmentDelimiter="~",componentDelimiter=">",elementDelimiter="*")
public class PurchaseOrder {

	@NotNull
	private InterchangeEnvelope interchangeEnvelope;
	
	@NotNull
	private GroupEnvelope groupEnvelope;
	
	@NotNull
	@Size(min = 1, max = 1)
	private PurchaseOrderHeader heading;
	
	@NotNull
	@Size(min = 1, max = 1)
	private Detail detail;
	
	@NotNull
	@Size(min = 1, max = 1)
	private Summary summary;

	
	
	
	
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

	public PurchaseOrderHeader getHeading() {
		return heading;
	}

	public void setHeading(PurchaseOrderHeader heading) {
		this.heading = heading;
	}

	public Detail getDetail() {
		return detail;
	}

	public void setDetail(Detail detail) {
		this.detail = detail;
	}

	public Summary getSummary() {
		return summary;
	}

	public void setSummary(Summary summary) {
		this.summary = summary;
	}
	
	
	
}
