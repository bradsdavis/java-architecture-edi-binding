package javax.edi.model.x12.edi850;

import javax.edi.bind.annotations.EDIMessage;
import javax.edi.model.x12.GroupEnvelope;
import javax.edi.model.x12.GroupEnvelopeTrailer;
import javax.edi.model.x12.InterchangeEnvelope;
import javax.edi.model.x12.InterchangeEnvelopeTrailer;
import javax.validation.constraints.NotNull;

@EDIMessage(segmentDelimiter="~",componentDelimiter=">",elementDelimiter="*")
public class PurchaseOrder {

	@NotNull
	private InterchangeEnvelope interchangeEnvelope;
	
	@NotNull
	private GroupEnvelope groupEnvelope;
	
	@NotNull
	private Header header;
	
	@NotNull
	private Detail detail;
	
	@NotNull
	private Summary summary;
	
	@NotNull
	private GroupEnvelopeTrailer groupEnvelopeTrailer;
	
	@NotNull
	private InterchangeEnvelopeTrailer interchangeEnveloperTrailer;
	
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

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
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

	public GroupEnvelopeTrailer getGroupEnvelopeTrailer() {
		return groupEnvelopeTrailer;
	}

	public void setGroupEnvelopeTrailer(GroupEnvelopeTrailer groupEnvelopeTrailer) {
		this.groupEnvelopeTrailer = groupEnvelopeTrailer;
	}

	public InterchangeEnvelopeTrailer getInterchangeEnveloperTrailer() {
		return interchangeEnveloperTrailer;
	}

	public void setInterchangeEnveloperTrailer(
			InterchangeEnvelopeTrailer interchangeEnveloperTrailer) {
		this.interchangeEnveloperTrailer = interchangeEnveloperTrailer;
	}
}
