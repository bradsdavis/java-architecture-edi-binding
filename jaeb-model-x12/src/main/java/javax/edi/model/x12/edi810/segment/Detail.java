package javax.edi.model.x12.edi810.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class Detail {

	@Size(min=1)
	@NotNull
	@EDICollectionType(InvoiceItemGroup.class)
	private Collection<InvoiceItemGroup> invoiceItems;
	
	public Collection<InvoiceItemGroup> getInvoiceItems() {
		return invoiceItems;
	}
	
	public void setInvoiceItems(Collection<InvoiceItemGroup> invoiceItems) {
		this.invoiceItems = invoiceItems;
	}
}
