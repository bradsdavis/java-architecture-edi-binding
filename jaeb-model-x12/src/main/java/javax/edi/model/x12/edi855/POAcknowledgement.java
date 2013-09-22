package javax.edi.model.x12.edi855;

import javax.edi.bind.annotations.EDIMessage;
import javax.edi.model.x12.segment.GroupEnvelope;
import javax.edi.model.x12.segment.GroupEnvelopeTrailer;
import javax.edi.model.x12.segment.InterchangeEnvelope;
import javax.edi.model.x12.segment.InterchangeEnvelopeTrailer;

@EDIMessage
public class POAcknowledgement {

	private InterchangeEnvelope interchangeEnvelopeHeader;
	private GroupEnvelope groupEnvelopeHeader;
	
	private POAcknowledgementBody body;
	
	private GroupEnvelopeTrailer groupEnvelopeTrailer;
	private InterchangeEnvelopeTrailer interchangeEnvelopeTrailer;
}
