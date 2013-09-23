 package javax.edi.model.x12.edi856.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Detail {
	
	@EDICollectionType(ShipmentLevelGroup.class)
	private Collection<ShipmentLevelGroup> shipmentLevelGroups;

	
	@EDICollectionType(PackageCartonGroup.class)
	private Collection<PackageCartonGroup> packageCartonGroup;

	public Collection<PackageCartonGroup> getPackageCartonGroup() {
		return packageCartonGroup;
	}

	public void setPackageCartonGroup(
			Collection<PackageCartonGroup> packageCartonGroup) {
		this.packageCartonGroup = packageCartonGroup;
	}

	public Collection<ShipmentLevelGroup> getShipmentLevelGroups() {
		return shipmentLevelGroups;
	}
	
	public void setShipmentLevelGroups(
			Collection<ShipmentLevelGroup> shipmentLevelGroups) {
		this.shipmentLevelGroups = shipmentLevelGroups;
	}

	@NotNull
	@EDICollectionType(ItemLevelInformationGroup.class)
	private Collection<ItemLevelInformationGroup> itemLevelInformationGroup; 

	public Collection<ItemLevelInformationGroup> getItemLevelInformationGroup() {
		return itemLevelInformationGroup;
	}
	
	public void setItemLevelInformationGroup(
			Collection<ItemLevelInformationGroup> itemLevelInformationGroup) {
		this.itemLevelInformationGroup = itemLevelInformationGroup;
	}
}
