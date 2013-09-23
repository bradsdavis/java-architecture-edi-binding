package javax.edi.model.x12.edi856.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.HierarchicalLevel;
import javax.edi.model.x12.segment.ItemIdentification;
import javax.edi.model.x12.segment.ShipmentItemDetail;

@EDISegmentGroup
public class ItemLevelInformationGroup {

	private HierarchicalLevel itemLevel;
	private ItemIdentification itemIdentification;
	private ShipmentItemDetail shipmentItemDetail;
	
	public HierarchicalLevel getItemLevel() {
		return itemLevel;
	}
	
	public void setItemLevel(HierarchicalLevel itemLevel) {
		this.itemLevel = itemLevel;
	}
	
	public ItemIdentification getItemIdentification() {
		return itemIdentification;
	}
	public void setItemIdentification(ItemIdentification itemIdentification) {
		this.itemIdentification = itemIdentification;
	}
	public ShipmentItemDetail getShipmentItemDetail() {
		return shipmentItemDetail;
	}
	public void setShipmentItemDetail(ShipmentItemDetail shipmentItemDetail) {
		this.shipmentItemDetail = shipmentItemDetail;
	}
	
	
}
