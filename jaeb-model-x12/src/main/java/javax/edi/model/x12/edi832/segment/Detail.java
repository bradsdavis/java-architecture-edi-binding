package javax.edi.model.x12.edi832.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Detail {

	@NotNull
	@EDICollectionType(ItemPricingGroup.class)
	private Collection<ItemPricingGroup> itemPricingGroup;

	public Collection<ItemPricingGroup> getItemPricingGroup() {
		return itemPricingGroup;
	}

	public void setItemPricingGroup(Collection<ItemPricingGroup> itemPricingGroup) {
		this.itemPricingGroup = itemPricingGroup;
	}
	
	
	
}
