package javax.edi.model.x12.edi846;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.model.x12.edi846.segment.ItemIdentificationGroup;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Detail {

	@NotNull
	@Size(min=0, max=100000)
	@EDICollectionType(ItemIdentificationGroup.class)
	private Collection<ItemIdentificationGroup> itemIdentifications;
	
	public Collection<ItemIdentificationGroup> getItemIdentifications() {
		return itemIdentifications;
	}
	
	public void setItemIdentifications(
			Collection<ItemIdentificationGroup> itemIdentifications) {
		this.itemIdentifications = itemIdentifications;
	}
}
