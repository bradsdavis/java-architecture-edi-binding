package javax.edi.model.x12.edi832.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.Currency;
import javax.edi.model.x12.segment.DateTimeReference;
import javax.edi.model.x12.segment.Name;
import javax.edi.model.x12.segment.PersonContact;
import javax.edi.model.x12.segment.TransactionSetHeader;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Header {

	@NotNull
	private TransactionSetHeader transactionSetHeader;
	private PriceCatalogBeginningSegment beginningSegment;
	private PersonContact contact;
	private DateTimeReference dateTimeReference;
	private Currency currency;
	
	@EDICollectionType(Name.class)
	private Collection<Name> name;

	public TransactionSetHeader getTransactionSetHeader() {
		return transactionSetHeader;
	}

	public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
		this.transactionSetHeader = transactionSetHeader;
	}

	public PriceCatalogBeginningSegment getBeginningSegment() {
		return beginningSegment;
	}

	public void setBeginningSegment(PriceCatalogBeginningSegment beginningSegment) {
		this.beginningSegment = beginningSegment;
	}

	public PersonContact getContact() {
		return contact;
	}

	public void setContact(PersonContact contact) {
		this.contact = contact;
	}

	public DateTimeReference getDateTimeReference() {
		return dateTimeReference;
	}

	public void setDateTimeReference(DateTimeReference dateTimeReference) {
		this.dateTimeReference = dateTimeReference;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public Collection<Name> getName() {
		return name;
	}

	public void setName(Collection<Name> name) {
		this.name = name;
	}
	
	
	
}
