package javax.edi.model.x12.edi856.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.DateTimeReference;
import javax.edi.model.x12.segment.GeographicLocation;
import javax.edi.model.x12.segment.HierarchicalLevel;
import javax.edi.model.x12.segment.Name;
import javax.edi.model.x12.segment.QuantityWeightCarrierDetails;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.edi.model.x12.segment.RoutingCarrierDetails;

@EDISegmentGroup
public class ShipmentLevelGroup {

	private HierarchicalLevel shipmentInformationLevel;
	private QuantityWeightCarrierDetails quantityWeightCarrierDetails;
	private RoutingCarrierDetails routingCarrierDetails;
	private ReferenceNumber referenceNumber1;
	private ReferenceNumber referenceNumber2;
	private DateTimeReference shipmentDateTime;
	
	private Name shipFromNameInformation;
	private GeographicLocation shipmentFromLocation;
	private Name shipToNameInformation;
	private GeographicLocation shipToLocation;
	private GeographicLocation shipToCityStateZip;
	
	@EDICollectionType(OrderInformationGroup.class)
	private Collection<OrderInformationGroup> orderInformationGroup;
	
	
	
	public HierarchicalLevel getShipmentInformationLevel() {
		return shipmentInformationLevel;
	}
	public void setShipmentInformationLevel(
			HierarchicalLevel shipmentInformationLevel) {
		this.shipmentInformationLevel = shipmentInformationLevel;
	}
	public QuantityWeightCarrierDetails getQuantityWeightCarrierDetails() {
		return quantityWeightCarrierDetails;
	}
	public void setQuantityWeightCarrierDetails(
			QuantityWeightCarrierDetails quantityWeightCarrierDetails) {
		this.quantityWeightCarrierDetails = quantityWeightCarrierDetails;
	}
	public RoutingCarrierDetails getRoutingCarrierDetails() {
		return routingCarrierDetails;
	}
	public void setRoutingCarrierDetails(RoutingCarrierDetails routingCarrierDetails) {
		this.routingCarrierDetails = routingCarrierDetails;
	}
	public ReferenceNumber getReferenceNumber1() {
		return referenceNumber1;
	}
	public void setReferenceNumber1(ReferenceNumber referenceNumber1) {
		this.referenceNumber1 = referenceNumber1;
	}
	public ReferenceNumber getReferenceNumber2() {
		return referenceNumber2;
	}
	public void setReferenceNumber2(ReferenceNumber referenceNumber2) {
		this.referenceNumber2 = referenceNumber2;
	}
	public DateTimeReference getShipmentDateTime() {
		return shipmentDateTime;
	}
	public void setShipmentDateTime(DateTimeReference shipmentDateTime) {
		this.shipmentDateTime = shipmentDateTime;
	}
	public Name getShipFromNameInformation() {
		return shipFromNameInformation;
	}
	public void setShipFromNameInformation(Name shipFromNameInformation) {
		this.shipFromNameInformation = shipFromNameInformation;
	}
	public GeographicLocation getShipmentFromLocation() {
		return shipmentFromLocation;
	}
	public void setShipmentFromLocation(GeographicLocation shipmentFromLocation) {
		this.shipmentFromLocation = shipmentFromLocation;
	}
	public Name getShipToNameInformation() {
		return shipToNameInformation;
	}
	public void setShipToNameInformation(Name shipToNameInformation) {
		this.shipToNameInformation = shipToNameInformation;
	}
	public GeographicLocation getShipToLocation() {
		return shipToLocation;
	}
	public void setShipToLocation(GeographicLocation shipToLocation) {
		this.shipToLocation = shipToLocation;
	}
	public GeographicLocation getShipToCityStateZip() {
		return shipToCityStateZip;
	}
	public void setShipToCityStateZip(GeographicLocation shipToCityStateZip) {
		this.shipToCityStateZip = shipToCityStateZip;
	}
	
	
}
