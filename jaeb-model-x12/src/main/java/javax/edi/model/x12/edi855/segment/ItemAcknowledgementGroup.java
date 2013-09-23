package javax.edi.model.x12.edi855.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.LineItemAcknowledgement;
import javax.edi.model.x12.segment.POBaselineItemData;

@EDISegmentGroup
public class ItemAcknowledgementGroup {

	private POBaselineItemData itemData;
	private LineItemAcknowledgement itemAcknowledgement;
	
	public POBaselineItemData getItemData() {
		return itemData;
	}
	public void setItemData(POBaselineItemData itemData) {
		this.itemData = itemData;
	}
	public LineItemAcknowledgement getItemAcknowledgement() {
		return itemAcknowledgement;
	}
	public void setItemAcknowledgement(LineItemAcknowledgement itemAcknowledgement) {
		this.itemAcknowledgement = itemAcknowledgement;
	}
	
	
}
