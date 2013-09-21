package javax.edi.model.x12.edi810.segment;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;

@EDISegment(tag = "GS")
public class GroupEnvelope {

	@NotNull
	@Size(min = 2, max = 2)
	@EDIElement
	private String functionalIdCode; // 'PO' (Purchase Order)
	
	@NotNull
	@Size(min = 2, max = 15)
	@EDIElement
	private String applicationSenderCode; // Your company's ID
	
	@NotNull
	@Size(min = 2, max = 15)
	@EDIElement
	private String applicationReceiverCode; // '007981038' for testing, production id provided later
	
	@NotNull
	@Size(min = 8, max = 8)
	@EDIElementFormat(format="CCYYMMDD")
	private String date; // CCYYMMDD format
	
	@NotNull
	@Size(min = 4, max = 6)
	@EDIElement
	private String time; // HHMM or HHMMSS format
	
	@NotNull
	@Size(min = 1, max = 9)
	@EDIElement
	private String groupControlNumber; // An identifying number used to track this group envelope
	
	@NotNull
	@Size(min = 1, max = 2)
	@EDIElement
	private String responsibleAgencyCode; // 'X' for X12 format from the Accredited Standards Committee
	
	@NotNull
	@Size(min = 1, max = 12)
	@EDIElement
	private String versionReleaseIdentifierCode; // '004010'
}
