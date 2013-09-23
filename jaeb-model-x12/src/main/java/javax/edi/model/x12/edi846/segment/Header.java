package javax.edi.model.x12.edi846.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.Name;
import javax.edi.model.x12.segment.TransactionSetHeader;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup()
public class Header {

	@NotNull
	private TransactionSetHeader transactionSetHeader;
	
	@NotNull
	private InventoryInquiryBeginningSegment beginningSegment;
	
	
	@EDICollectionType(Name.class)
	@Size(min=0, max=2)
	private Collection<Name> name;

	public TransactionSetHeader getTransactionSetHeader() {
		return transactionSetHeader;
	}

	public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
		this.transactionSetHeader = transactionSetHeader;
	}

	public InventoryInquiryBeginningSegment getBeginningSegment() {
		return beginningSegment;
	}

	public void setBeginningSegment(
			InventoryInquiryBeginningSegment beginningSegment) {
		this.beginningSegment = beginningSegment;
	}

	public Collection<Name> getName() {
		return name;
	}

	public void setName(Collection<Name> name) {
		this.name = name;
	}
	
	
}
