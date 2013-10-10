package javax.edi.model.x12.edi856.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.AdditionalNameInformation;
import javax.edi.model.x12.segment.AddressInformation;
import javax.edi.model.x12.segment.DateTimeReference;
import javax.edi.model.x12.segment.GeographicLocation;
import javax.edi.model.x12.segment.HierarchicalLevel;
import javax.edi.model.x12.segment.Name;
import javax.edi.model.x12.segment.QuantityWeightCarrierDetails;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.edi.model.x12.segment.RoutingCarrierDetails;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class ShipmentLevelGroup {

	private HierarchicalLevel shipmentInformationLevel;
	private QuantityWeightCarrierDetails quantityWeightCarrierDetails;
	private RoutingCarrierDetails routingCarrierDetails;
	
	@NotNull
	@Size(min=1)
	@EDICollectionType(ReferenceNumber.class)
	private Collection<ReferenceNumber> referenceNumbers;
	
	private DateTimeReference shipmentDateTime;
	
	private Name shipFromNameInformation;
	private GeographicLocation shipmentFromLocation;
	
	private Name shipToNameInformation;
	private AdditionalNameInformation shipToAdditionalName;
	private AddressInformation shipToAddress;
	private GeographicLocation shipToCityStateZip;
	
	@EDICollectionType(OrderInformationGroup.class)
	private Collection<OrderInformationGroup> orderInformationGroup;
	
	
	public Collection<OrderInformationGroup> getOrderInformationGroup() {
		return orderInformationGroup;
	}

	public void setOrderInformationGroup(
			Collection<OrderInformationGroup> orderInformationGroup) {
		this.orderInformationGroup = orderInformationGroup;
	}

	public AdditionalNameInformation getShipToAdditionalName() {
		return shipToAdditionalName;
	}
	
	public void setShipToAdditionalName(
			AdditionalNameInformation shipToAdditionalName) {
		this.shipToAdditionalName = shipToAdditionalName;
	}
	
	
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
	public Collection<ReferenceNumber> getReferenceNumbers() {
		return referenceNumbers;
	}
	public void setReferenceNumbers(Collection<ReferenceNumber> referenceNumbers) {
		this.referenceNumbers = referenceNumbers;
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

	public AddressInformation getShipToAddress() {
		return shipToAddress;
	}
	
	public void setShipToAddress(AddressInformation shipToAddress) {
		this.shipToAddress = shipToAddress;
	}
	
	public GeographicLocation getShipToCityStateZip() {
		return shipToCityStateZip;
	}
	public void setShipToCityStateZip(GeographicLocation shipToCityStateZip) {
		this.shipToCityStateZip = shipToCityStateZip;
	}
	
	
}
