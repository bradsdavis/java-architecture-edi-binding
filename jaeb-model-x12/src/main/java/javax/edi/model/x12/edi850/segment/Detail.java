package javax.edi.model.x12.edi850.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class Detail {

	@NotNull
	@Size(max=100000)
	@EDICollectionType(PurchaseOrderItemGroup.class)
	private Collection<PurchaseOrderItemGroup> purchaseOrderItems;

	public Collection<PurchaseOrderItemGroup> getPurchaseOrderItems() {
		return purchaseOrderItems;
	}

	public void setPurchaseOrderItems(Collection<PurchaseOrderItemGroup> purchaseOrderItems) {
		this.purchaseOrderItems = purchaseOrderItems;
	}
}
