package javax.edi.model.x12.edi855;

import javax.edi.bind.annotations.EDIMessage;
import javax.edi.model.x12.segment.GroupEnvelopeHeader;
import javax.edi.model.x12.segment.GroupEnvelopeTrailer;
import javax.edi.model.x12.segment.InterchangeEnvelopeHeader;
import javax.edi.model.x12.segment.InterchangeEnvelopeTrailer;

@EDIMessage
public class POAcknowledgement {

	private InterchangeEnvelopeHeader interchangeEnvelopeHeader;
	private GroupEnvelopeHeader groupEnvelopeHeader;
	
	private POAcknowledgementBody body;
	
	private GroupEnvelopeTrailer groupEnvelopeTrailer;
	private InterchangeEnvelopeTrailer interchangeEnvelopeTrailer;
}
