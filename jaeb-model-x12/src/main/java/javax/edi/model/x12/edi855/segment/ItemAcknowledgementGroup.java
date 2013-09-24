package javax.edi.model.x12.edi855.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.LineItemAcknowledgement;
import javax.edi.model.x12.segment.POBaselineItemData;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class ItemAcknowledgementGroup {

	@NotNull
	private POBaselineItemData itemData;
	
	@NotNull
	@Size(min=0, max=25)
	@EDICollectionType(LineItemAcknowledgement.class)
	private Collection<LineItemAcknowledgement> itemAcknowledgements;
	
	public POBaselineItemData getItemData() {
		return itemData;
	}
	public void setItemData(POBaselineItemData itemData) {
		this.itemData = itemData;
	}

	public Collection<LineItemAcknowledgement> getItemAcknowledgements() {
		return itemAcknowledgements;
	}
	public void setItemAcknowledgements(
			Collection<LineItemAcknowledgement> itemAcknowledgements) {
		this.itemAcknowledgements = itemAcknowledgements;
	}
	
	
}
