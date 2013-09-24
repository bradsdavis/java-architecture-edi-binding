package javax.edi.model.x12.edi850.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.AdditionalNameInformation;
import javax.edi.model.x12.segment.AddressInformation;
import javax.edi.model.x12.segment.GeographicLocation;
import javax.edi.model.x12.segment.Name;
import javax.edi.model.x12.segment.PersonContact;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class ShippingBillingGroup {

	@NotNull
	private Name name;
	
	private AdditionalNameInformation additionalNameInformation;
	
	private AddressInformation addressInformation;
	
	private GeographicLocation geographicLocation;
	
	@Size(max=3)
	@EDICollectionType(PersonContact.class)
	private Collection<PersonContact> personContacts;

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
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

	public Collection<PersonContact> getPersonContacts() {
		return personContacts;
	}

	public void setPersonContacts(
			Collection<PersonContact> personContacts) {
		this.personContacts = personContacts;
	}
}
