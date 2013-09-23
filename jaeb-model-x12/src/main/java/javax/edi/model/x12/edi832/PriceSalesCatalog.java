package javax.edi.model.x12.edi832;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDIMessage;
import javax.edi.model.x12.edi832.segment.PriceSalesCatalogBody;
import javax.edi.model.x12.segment.GroupEnvelopeHeader;
import javax.edi.model.x12.segment.GroupEnvelopeTrailer;
import javax.edi.model.x12.segment.InterchangeEnvelopeHeader;
import javax.edi.model.x12.segment.InterchangeEnvelopeTrailer;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDIMessage
public class PriceSalesCatalog {

	@NotNull
	private InterchangeEnvelopeHeader envelopeHeader;
	@NotNull
	private GroupEnvelopeHeader groupEnvelopeHeader;
	
	@NotNull
	@Size(min=1)
	@EDICollectionType(PriceSalesCatalogBody.class)
	private Collection<PriceSalesCatalogBody> body;
	
	@NotNull
	private GroupEnvelopeTrailer groupEnvelopeTrailer;
	@NotNull
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
	public Collection<PriceSalesCatalogBody> getBody() {
		return body;
	}
	public void setBody(Collection<PriceSalesCatalogBody> body) {
		this.body = body;
	}
	
	
}
