package javax.edi.model.x12.edi810;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDIMessage;
import javax.edi.model.x12.edi810.segment.InvoiceBody;
import javax.edi.model.x12.segment.GroupEnvelopeHeader;
import javax.edi.model.x12.segment.GroupEnvelopeTrailer;
import javax.edi.model.x12.segment.InterchangeEnvelopeHeader;
import javax.edi.model.x12.segment.InterchangeEnvelopeTrailer;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@EDIMessage
public class Invoice {
	
	@NotNull
	private InterchangeEnvelopeHeader envelopeHeader;
	
	@NotNull
	private GroupEnvelopeHeader groupEnvelopeHeader;
	
	@NotNull
	@Size(min=1)
	@EDICollectionType(InvoiceBody.class)
	private Collection<InvoiceBody> body;
	
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
	public Collection<InvoiceBody> getBody() {
		return body;
	}
	public void setBody(Collection<InvoiceBody> body) {
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
	@Override
	public String toString() {
		return "Invoice [envelopeHeader=" + envelopeHeader
				+ ", groupEnvelopeHeader=" + groupEnvelopeHeader + ", body="
				+ body + ", groupEnvelopeTrailer=" + groupEnvelopeTrailer
				+ ", envelopeTrailer=" + envelopeTrailer + "]";
	}
	
}
