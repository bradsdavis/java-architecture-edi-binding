package javax.edi.model.x12.edi850.segment;

import java.util.List;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class PurchaseOrderDetail {

	@NotNull
	@Size(max=100000)
	private List<PurchaseOrderItem> purchaseOrderItems;

	public List<PurchaseOrderItem> getPurchaseOrderItems() {
		return purchaseOrderItems;
	}

	public void setPurchaseOrderItems(List<PurchaseOrderItem> purchaseOrderItems) {
		this.purchaseOrderItems = purchaseOrderItems;
	}
}
