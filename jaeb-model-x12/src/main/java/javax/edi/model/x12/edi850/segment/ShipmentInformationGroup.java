package javax.edi.model.x12.edi850.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.AdditionalNameInformation;
import javax.edi.model.x12.segment.GeographicLocation;
import javax.edi.model.x12.segment.Name;
import javax.edi.model.x12.segment.PersonContact;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class ShipmentInformationGroup {

	private Name shipToName;
	private AdditionalNameInformation additionalNameInformation;
	private AddressInformation addressInformation;
	private GeographicLocation geographicLocation;
	
	@Size(max=3)
	private Collection<PersonContact> administrativeContact;

	public Name getShipToName() {
		return shipToName;
	}

	public void setShipToName(Name shipToName) {
		this.shipToName = shipToName;
	}

	public AdditionalNameInformation getAdditionalNameInformation() {
		return additionalNameInformation;
	}

	public void setAdditionalNameInformation(
			AdditionalNameInformation additionalNameInformation) {
		this.additionalNameInformation = additionalNameInformation;
	}

	public AddressInformation getAddressInformation() {
		return addressInformation;
	}

	public void setAddressInformation(AddressInformation addressInformation) {
		this.addressInformation = addressInformation;
	}

	public GeographicLocation getGeographicLocation() {
		return geographicLocation;
	}

	public void setGeographicLocation(GeographicLocation geographicLocation) {
		this.geographicLocation = geographicLocation;
	}

	public Collection<PersonContact> getAdministrativeContact() {
		return administrativeContact;
	}

	public void setAdministrativeContact(
			Collection<PersonContact> administrativeContact) {
		this.administrativeContact = administrativeContact;
	}
	
	
}
