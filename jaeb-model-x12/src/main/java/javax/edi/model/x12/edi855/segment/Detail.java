package javax.edi.model.x12.edi855.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class Detail {

	@NotNull
	@Size(min=1)
	@EDICollectionType(ItemAcknowledgementGroup.class)
	private Collection<ItemAcknowledgementGroup> itemAcknowledgements;

	public Collection<ItemAcknowledgementGroup> getItemAcknowledgements() {
		return itemAcknowledgements;
	}

	public void setItemAcknowledgements(
			Collection<ItemAcknowledgementGroup> itemAcknowledgements) {
		this.itemAcknowledgements = itemAcknowledgements;
	}
}
