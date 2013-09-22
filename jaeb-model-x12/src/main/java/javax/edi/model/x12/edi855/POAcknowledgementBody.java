package javax.edi.model.x12.edi855;

import javax.edi.bind.annotations.EDISegmentGroup;

@EDISegmentGroup
public class POAcknowledgementBody {

	private Header header;
	private Detail detail;
	private Trailer footer;
}
