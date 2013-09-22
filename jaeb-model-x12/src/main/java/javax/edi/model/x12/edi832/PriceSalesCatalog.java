package javax.edi.model.x12.edi832;

import javax.edi.bind.annotations.EDIMessage;
import javax.edi.model.x12.segment.GroupEnvelopeHeader;
import javax.edi.model.x12.segment.GroupEnvelopeTrailer;
import javax.edi.model.x12.segment.InterchangeEnvelopeHeader;
import javax.edi.model.x12.segment.InterchangeEnvelopeTrailer;

@EDIMessage
public class PriceSalesCatalog {

	private InterchangeEnvelopeHeader envelopeHeader;
	private GroupEnvelopeHeader groupEnvelopeHeader;
	
	private PriceSalesCatalogBody body;
	
	private GroupEnvelopeTrailer groupEnvelopeTrailer;
	private InterchangeEnvelopeTrailer envelopeTrailer;
	
	public InterchangeEnvelopeHeader getEnvelopeHeader() {
		return envelopeHeader;
	}
	public void setEnvelopeHeader(InterchangeEnvelopeHeader envelopeHeader) {
		this.envelopeHeader = envelopeHeader;
	}
	public GroupEnvelopeHeader getGroupEnvelopeHeader() {
		return groupEnvelopeHeader;
	}
	public void setGroupEnvelopeHeader(GroupEnvelopeHeader groupEnvelopeHeader) {
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
