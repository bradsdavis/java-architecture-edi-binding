package javax.edi.model.x12.edi850.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class PurchaseOrderItem {

	@NotNull
	private BaselineItemData baselineItemData;
	
	private ItemDescription itemDescription;
	
	private ReferenceIdentification referenceIdentification;

	public BaselineItemData getBaselineItemData() {
		return baselineItemData;
	}

	public void setBaselineItemData(BaselineItemData baselineItemData) {
		this.baselineItemData = baselineItemData;
	}

	public ItemDescription getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(ItemDescription itemDescription) {
		this.itemDescription = itemDescription;
	}

	public ReferenceIdentification getReferenceIdentification() {
		return referenceIdentification;
	}

	public void setReferenceIdentification(
			ReferenceIdentification referenceIdentification) {
		this.referenceIdentification = referenceIdentification;
	}
}
