package javax.edi.model.x12.edi856.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Detail {

	@NotNull
	private Collection<ItemLevelInformationGroup> itemLevelInformationGroup; 

	public Collection<ItemLevelInformationGroup> getItemLevelInformationGroup() {
		return itemLevelInformationGroup;
	}
	
	public void setItemLevelInformationGroup(
			Collection<ItemLevelInformationGroup> itemLevelInformationGroup) {
		this.itemLevelInformationGroup = itemLevelInformationGroup;
	}
}
