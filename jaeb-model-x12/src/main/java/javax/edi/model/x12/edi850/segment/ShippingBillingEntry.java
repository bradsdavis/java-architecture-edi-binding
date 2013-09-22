package javax.edi.model.x12.edi850.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class ShippingBillingEntry {

	@NotNull
	private ShippingBillingName shippingBillingName;
	
	private AdditionalNameInformation additionalNameInformation;
	
	private AddressInformation addressInformation;
	
	private GeographicLocation geographicLocation;
	
	@Size(max=3)
	private AdministrativeCommunicationsContact administrativeCommunicationsContact;

	public ShippingBillingName getShippingBillingName() {
		return shippingBillingName;
	}

	public void setShippingBillingName(ShippingBillingName shippingBillingName) {
		this.shippingBillingName = shippingBillingName;
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

	public AdministrativeCommunicationsContact getAdministrativeCommunicationsContact() {
		return administrativeCommunicationsContact;
	}

	public void setAdministrativeCommunicationsContact(
			AdministrativeCommunicationsContact administrativeCommunicationsContact) {
		this.administrativeCommunicationsContact = administrativeCommunicationsContact;
	}
}
