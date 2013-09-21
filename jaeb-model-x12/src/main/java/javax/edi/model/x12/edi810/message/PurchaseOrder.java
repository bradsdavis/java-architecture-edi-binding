package javax.edi.model.x12.edi810.message;

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
	
	
}
