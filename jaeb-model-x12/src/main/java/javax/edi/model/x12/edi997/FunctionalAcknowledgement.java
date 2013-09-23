package javax.edi.model.x12.edi997;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.model.x12.edi997.segment.FunctionalAcknowledgementBody;
import javax.edi.model.x12.segment.GroupEnvelopeHeader;
import javax.edi.model.x12.segment.GroupEnvelopeTrailer;
import javax.edi.model.x12.segment.InterchangeEnvelopeHeader;
import javax.edi.model.x12.segment.InterchangeEnvelopeTrailer;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class FunctionalAcknowledgement {

	@NotNull
	private InterchangeEnvelopeHeader envelopeHeader;
	
	@NotNull
	private GroupEnvelopeHeader groupEnvelopeHeader;
	
	@Size(min=1)
	@EDICollectionType(FunctionalAcknowledgementBody.class)
	private Collection<FunctionalAcknowledgementBody> body;
	
	@NotNull
	private GroupEnvelopeTrailer groupEnvelopeTrailer;
	
	@NotNull
	private InterchangeEnvelopeTrailer envelopeTrailer;
	
	public Collection<FunctionalAcknowledgementBody> getBody() {
		return body;
	}
	public void setBody(Collection<FunctionalAcknowledgementBody> body) {
		this.body = body;
	}
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
	
	
}
