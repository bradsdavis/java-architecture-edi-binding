 package javax.edi.model.x12.edi856.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Detail {
	
	@EDICollectionType(ShipmentLevelGroup.class)
	private Collection<ShipmentLevelGroup> shipmentLevelGroups;

	
	
	public Collection<ShipmentLevelGroup> getShipmentLevelGroups() {
		return shipmentLevelGroups;
	}
	
	public void setShipmentLevelGroups(
			Collection<ShipmentLevelGroup> shipmentLevelGroups) {
		this.shipmentLevelGroups = shipmentLevelGroups;
	}
}
