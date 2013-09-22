package javax.edi.model.x12.edi846;

import java.util.Collection;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.TransactionSetHeader;
import javax.edi.model.x12.edi810.segment.Name;
import javax.edi.model.x12.edi846.segment.BeginningSegmentForInventoryInquiry;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup()
public class Header {

	@NotNull
	private TransactionSetHeader transactionSetHeader;
	
	@NotNull
	private BeginningSegmentForInventoryInquiry beginningSegment;
	
	@Size(min=0, max=2)
	private Collection<Name> name;

	public TransactionSetHeader getTransactionSetHeader() {
		return transactionSetHeader;
	}

	public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
		this.transactionSetHeader = transactionSetHeader;
	}

	public BeginningSegmentForInventoryInquiry getBeginningSegment() {
		return beginningSegment;
	}

	public void setBeginningSegment(
			BeginningSegmentForInventoryInquiry beginningSegment) {
		this.beginningSegment = beginningSegment;
	}

	public Collection<Name> getName() {
		return name;
	}

	public void setName(Collection<Name> name) {
		this.name = name;
	}
	
	
}
