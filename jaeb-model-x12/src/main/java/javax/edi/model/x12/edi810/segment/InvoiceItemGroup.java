package javax.edi.model.x12.edi810.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.AdditionalItemData;
import javax.edi.model.x12.segment.BaselineItemData;
import javax.edi.model.x12.segment.Name;
import javax.edi.model.x12.segment.NoteSpecialInstructions;
import javax.edi.model.x12.segment.PricingInformation;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class InvoiceItemGroup {

	@NotNull
	private BaselineItemData baselineItemData;
	
	@EDICollectionType(NoteSpecialInstructions.class)
	@Size(min=0, max=100)
	private Collection<NoteSpecialInstructions> noteSpecialInstructions;
	
	@EDICollectionType(AdditionalItemData.class)
	@Size(min=0, max=5)
	private Collection<AdditionalItemData> additionalItemData;
	
	@EDICollectionType(PricingInformation.class)
	@Size(min=0, max=25)
	private Collection<PricingInformation> pricingInformation;
	
	
	@EDICollectionType(Name.class)
	@Size(min=0, max=200)
	private Collection<Name> name;
	
	@EDICollectionType(ReferenceNumber.class)
	@Size(min=0, max=12)
	private Collection<ReferenceNumber> referenceNumbers;

}
