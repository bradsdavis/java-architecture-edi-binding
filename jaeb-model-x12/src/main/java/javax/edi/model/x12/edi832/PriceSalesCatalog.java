package javax.edi.model.x12.edi832;

import javax.edi.bind.annotations.EDIMessage;
import javax.edi.model.x12.segment.GroupEnvelope;
import javax.edi.model.x12.segment.GroupEnvelopeTrailer;
import javax.edi.model.x12.segment.InterchangeEnvelope;
import javax.edi.model.x12.segment.InterchangeEnvelopeTrailer;

@EDIMessage
public class PriceSalesCatalog {

	private InterchangeEnvelope envelopeHeader;
	private GroupEnvelope groupEnvelopeHeader;
	
	private PriceSalesCatalogBody body;
	
	private GroupEnvelopeTrailer groupEnvelopeTrailer;
	private InterchangeEnvelopeTrailer envelopeTrailer;
	
	
	public InterchangeEnvelope getEnvelopeHeader() {
		return envelopeHeader;
	}
	public void setEnvelopeHeader(InterchangeEnvelope envelopeHeader) {
		this.envelopeHeader = envelopeHeader;
	}
	public GroupEnvelope getGroupEnvelopeHeader() {
		return groupEnvelopeHeader;
	}
	public void setGroupEnvelopeHeader(GroupEnvelope groupEnvelopeHeader) {
		this.groupEnvelopeHeader = groupEnvelopeHeader;
	}
	public PriceSalesCatalogBody getBody() {
		return body;
	}
	public void setBody(PriceSalesCatalogBody body) {
		this.body = body;
	}
	public GroupEnvelopeTrailer getGroupEnvelopeTrailer() {
		return groupEnvelopeTrailer;
	}
	public void setGroupEnvelopeTrailer(GroupEnvelopeTrailer groupEnvelopeTrailer) {
		this.groupEnvelopeTrailer = groupEnvelopeTrailer;
	}
	public InterchangeEnvelopeTrailer getEnvelopeTrailer() {
		return envelopeTrailer;
	}
	public void setEnvelopeTrailer(InterchangeEnvelopeTrailer envelopeTrailer) {
		this.envelopeTrailer = envelopeTrailer;
	}
	
	
}
