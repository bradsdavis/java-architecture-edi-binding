package javax.edi.model.x12.edi850.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.PersonContact;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class Shipping {

	private ShipToBillToName shipToBillToName;
	
	private AdditionalNameInformation additionalNameInformation;
	
	private AddressInformation addressInformation;
	
	private GeographicLocation geographicLocation;
	
	@Size(max=3)
	private PersonContact administrativeCommunicationsContact;
}