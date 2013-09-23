package javax.edi.model.x12.edi855.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.LineItemAcknowledgement;
import javax.edi.model.x12.segment.POBaselineItemData;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Detail {

	@NotNull
	@EDICollectionType(POBaselineItemData.class)
	private Collection<POBaselineItemData> poBaselineItemData;
	
	private LineItemAcknowledgement lineItemAcknowledgement;

	public Collection<POBaselineItemData> getPoBaselineItemData() {
		return poBaselineItemData;
	}

	public void setPoBaselineItemData(
			Collection<POBaselineItemData> poBaselineItemData) {
		this.poBaselineItemData = poBaselineItemData;
	}

	public LineItemAcknowledgement getLineItemAcknowledgement() {
		return lineItemAcknowledgement;
	}

	public void setLineItemAcknowledgement(
			LineItemAcknowledgement lineItemAcknowledgement) {
		this.lineItemAcknowledgement = lineItemAcknowledgement;
	}
	
	
}
