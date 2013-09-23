package javax.edi.model.x12.edi846.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.DestinationQuantity;
import javax.edi.model.x12.segment.ItemIdentification;
import javax.edi.model.x12.segment.Quantity;

@EDISegmentGroup
public class ItemIdentificationGroup {

	private ItemIdentification itemIdentifications;
	private Quantity quantity;
	private DestinationQuantity sublineItemDetail;
	
	public ItemIdentification getItemIdentifications() {
		return itemIdentifications;
	}
	public void setItemIdentifications(ItemIdentification itemIdentifications) {
		this.itemIdentifications = itemIdentifications;
	}
	public Quantity getQuantity() {
		return quantity;
	}
	public void setQuantity(Quantity quantity) {
		this.quantity = quantity;
	}
	public DestinationQuantity getSublineItemDetail() {
		return sublineItemDetail;
	}
	public void setSublineItemDetail(DestinationQuantity sublineItemDetail) {
		this.sublineItemDetail = sublineItemDetail;
	}
	
	
}
