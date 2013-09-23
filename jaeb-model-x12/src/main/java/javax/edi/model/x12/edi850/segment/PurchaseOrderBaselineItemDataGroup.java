package javax.edi.model.x12.edi850.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.model.x12.segment.POBaselineItemData;
import javax.edi.model.x12.segment.ProductItemDescription;
import javax.edi.model.x12.segment.ReferenceIdentification;
import javax.validation.constraints.Size;

public class PurchaseOrderBaselineItemDataGroup {

	private POBaselineItemData itemData;
	private ProductItemDescription additionalItemDescription;
	
	@EDICollectionType(ReferenceIdentification.class)
	@Size(max=1000)
	private Collection<ReferenceIdentification> referenceInformation;

	public POBaselineItemData getItemData() {
		return itemData;
	}

	public void setItemData(POBaselineItemData itemData) {
		this.itemData = itemData;
	}

	public ProductItemDescription getAdditionalItemDescription() {
		return additionalItemDescription;
	}

	public void setAdditionalItemDescription(
			ProductItemDescription additionalItemDescription) {
		this.additionalItemDescription = additionalItemDescription;
	}

	public Collection<ReferenceIdentification> getReferenceInformation() {
		return referenceInformation;
	}

	public void setReferenceInformation(
			Collection<ReferenceIdentification> referenceInformation) {
		this.referenceInformation = referenceInformation;
	}
	
	
}
