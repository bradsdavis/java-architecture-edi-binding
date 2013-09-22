package javax.edi.model.x12.edi850.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.PersonContact;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class ShippingBillingInformation {

	@Size(min=1)
	private ShipToBillToName shipToBillToName;

	@Size(min=1)
	private AdditionalNameInformation additionalNameInformation;

	@Size(min=1)
	private AddressInformation addressInformation;
	
	@Size(min=1)
	private GeographicLocation geographicLocation;
	
	@Size(min=3)
	private PersonContact administrativeCommunicationsContact;
}
