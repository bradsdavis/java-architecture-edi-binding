package javax.edi.model.x12.edi810;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.edi810.segment.AdditionalItemData;
import javax.edi.model.x12.edi810.segment.BaselineItemData;
import javax.edi.model.x12.edi810.segment.Name;
import javax.edi.model.x12.edi810.segment.NoteSpecialInstructions;
import javax.edi.model.x12.edi810.segment.PricingInformation;
import javax.edi.model.x12.edi810.segment.ReferenceNumber;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class Detail {

	@EDICollectionType(BaselineItemData.class)
	@Size(min=0, max=200000)
	private Collection<BaselineItemData> baselineItemData;
	
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

	public Collection<BaselineItemData> getBaselineItemData() {
		return baselineItemData;
	}

	public void setBaselineItemData(Collection<BaselineItemData> baselineItemData) {
		this.baselineItemData = baselineItemData;
	}

	public Collection<NoteSpecialInstructions> getNoteSpecialInstructions() {
		return noteSpecialInstructions;
	}

	public void setNoteSpecialInstructions(
			Collection<NoteSpecialInstructions> noteSpecialInstructions) {
		this.noteSpecialInstructions = noteSpecialInstructions;
	}

	public Collection<AdditionalItemData> getAdditionalItemData() {
		return additionalItemData;
	}

	public void setAdditionalItemData(
			Collection<AdditionalItemData> additionalItemData) {
		this.additionalItemData = additionalItemData;
	}

	public Collection<PricingInformation> getPricingInformation() {
		return pricingInformation;
	}

	public void setPricingInformation(
			Collection<PricingInformation> pricingInformation) {
		this.pricingInformation = pricingInformation;
	}

	public Collection<Name> getName() {
		return name;
	}

	public void setName(Collection<Name> name) {
		this.name = name;
	}

	public Collection<ReferenceNumber> getReferenceNumbers() {
		return referenceNumbers;
	}

	public void setReferenceNumbers(Collection<ReferenceNumber> referenceNumbers) {
		this.referenceNumbers = referenceNumbers;
	}
}
