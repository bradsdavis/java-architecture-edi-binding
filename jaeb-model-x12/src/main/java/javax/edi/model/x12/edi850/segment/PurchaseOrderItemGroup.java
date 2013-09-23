package javax.edi.model.x12.edi850.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.POBaselineItemData;
import javax.edi.model.x12.segment.ProductItemDescription;
import javax.edi.model.x12.segment.ReferenceIdentification;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class PurchaseOrderItemGroup {

	@NotNull
	private POBaselineItemData baselineItemData;
	
	private ProductItemDescription itemDescription;
	
	private ReferenceIdentification referenceIdentification;

	public POBaselineItemData getBaselineItemData() {
		return baselineItemData;
	}

	public void setBaselineItemData(POBaselineItemData baselineItemData) {
		this.baselineItemData = baselineItemData;
	}

	public ProductItemDescription getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(ProductItemDescription itemDescription) {
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
