package javax.edi.model.x12.edi850.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Detail {

	@EDICollectionType(PurchaseOrderBaselineItemDataGroup.class)
	@NotNull
	private Collection<PurchaseOrderBaselineItemDataGroup> purchaseOrderBaselineItemDataGroup;

	public Collection<PurchaseOrderBaselineItemDataGroup> getPurchaseOrderBaselineItemDataGroup() {
		return purchaseOrderBaselineItemDataGroup;
	}

	public void setPurchaseOrderBaselineItemDataGroup(
			Collection<PurchaseOrderBaselineItemDataGroup> purchaseOrderBaselineItemDataGroup) {
		this.purchaseOrderBaselineItemDataGroup = purchaseOrderBaselineItemDataGroup;
	}
	
	
}
