package javax.edi.model.x12.edi850;

import javax.edi.bind.annotations.EDIMessage;
import javax.edi.model.x12.edi850.segment.PurchaseOrderBody;
import javax.edi.model.x12.segment.GroupEnvelopeHeader;
import javax.edi.model.x12.segment.GroupEnvelopeTrailer;
import javax.edi.model.x12.segment.InterchangeEnvelopeHeader;
import javax.edi.model.x12.segment.InterchangeEnvelopeTrailer;

@EDIMessage(segmentDelimiter="~",componentDelimiter=">",elementDelimiter="*")
public class PurchaseOrder {

	private InterchangeEnvelopeHeader envelopeHeader;
	private GroupEnvelopeHeader groupEnvelopeHeader;
	private PurchaseOrderBody body;
	private GroupEnvelopeTrailer groupEnvelopeTrailer;
	private InterchangeEnvelopeTrailer envelopeTrailer;
	
	
	
	
}
