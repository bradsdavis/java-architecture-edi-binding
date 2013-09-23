package javax.edi.model.x12.edi846.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.DestinationQuantity;
import javax.edi.model.x12.segment.ItemIdentification;
import javax.edi.model.x12.segment.Quantity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class ItemIdentificationGroup {

	private ItemIdentification itemIdentifications;
	private Quantity quantity;
	
	@NotNull
	@Size(min=1)
	@EDICollectionType(DestinationQuantity.class)
	private Collection<DestinationQuantity> sublineItemDetail;
	
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
	
	public Collection<DestinationQuantity> getSublineItemDetail() {
		return sublineItemDetail;
	}
	
	public void setSublineItemDetail(
			Collection<DestinationQuantity> sublineItemDetail) {
		this.sublineItemDetail = sublineItemDetail;
	}
	
	
	
}
