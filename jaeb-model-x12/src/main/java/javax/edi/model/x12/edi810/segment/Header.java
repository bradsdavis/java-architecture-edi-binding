
package javax.edi.model.x12.edi810.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.Currency;
import javax.edi.model.x12.segment.FOBRelatedInstruction;
import javax.edi.model.x12.segment.GeographicLocation;
import javax.edi.model.x12.segment.Name;
import javax.edi.model.x12.segment.NoteSpecialInstructions;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.edi.model.x12.segment.TermsOfSale;
import javax.edi.model.x12.segment.TransactionSetHeader;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup()
public class Header {

	@NotNull
	private TransactionSetHeader transactionSetHeader;
	
	@NotNull
	private InvoiceBeginningSegment beginningSegmentforInvoice;
	
	//optional
	private Currency currency;

	@EDICollectionType(NoteSpecialInstructions.class)
	@Size(min=0, max=100)
	private Collection<NoteSpecialInstructions> noteSpecialInstructions;
	
	private ReferenceNumber referenceNumbers;
	
	@EDICollectionType(Name.class)
	@Size(min=0, max=200)
	private Collection<Name> names;
	
	private GeographicLocation destinationCountryCode;
	
	@EDICollectionType(TermsOfSale.class)
	@Size(max=5)
	private Collection<TermsOfSale> termsOfSale;
	
	private FOBRelatedInstruction fobRelatedInstructions;
	
	
	
	
	
	public TransactionSetHeader getTransactionSetHeader() {
		return transactionSetHeader;
	}
	public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
		this.transactionSetHeader = transactionSetHeader;
	}
	public InvoiceBeginningSegment getBeginningSegmentforInvoice() {
		return beginningSegmentforInvoice;
	}
	public void setBeginningSegmentforInvoice(
			InvoiceBeginningSegment beginningSegmentforInvoice) {
		this.beginningSegmentforInvoice = beginningSegmentforInvoice;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public Collection<NoteSpecialInstructions> getNoteSpecialInstructions() {
		return noteSpecialInstructions;
	}
	public void setNoteSpecialInstructions(
			Collection<NoteSpecialInstructions> noteSpecialInstructions) {
		this.noteSpecialInstructions = noteSpecialInstructions;
	}
	public ReferenceNumber getReferenceNumbers() {
		return referenceNumbers;
	}
	public void setReferenceNumbers(ReferenceNumber referenceNumbers) {
		this.referenceNumbers = referenceNumbers;
	}
	public Collection<Name> getNames() {
		return names;
	}
	public void setNames(Collection<Name> names) {
		this.names = names;
	}
	public GeographicLocation getDestinationCountryCode() {
		return destinationCountryCode;
	}
	public void setDestinationCountryCode(
			GeographicLocation destinationCountryCode) {
		this.destinationCountryCode = destinationCountryCode;
	}
	public Collection<TermsOfSale> getTermsOfSale() {
		return termsOfSale;
	}
	public void setTermsOfSale(Collection<TermsOfSale> termsOfSale) {
		this.termsOfSale = termsOfSale;
	}
	public FOBRelatedInstruction getFobRelatedInstructions() {
		return fobRelatedInstructions;
	}
	public void setFobRelatedInstructions(
			FOBRelatedInstruction fobRelatedInstructions) {
		this.fobRelatedInstructions = fobRelatedInstructions;
	}
	@Override
	public String toString() {
		return "Header [transactionSetHeader=" + transactionSetHeader
				+ ", beginningSegmentforInvoice=" + beginningSegmentforInvoice
				+ ", currency=" + currency + ", noteSpecialInstructions="
				+ noteSpecialInstructions + ", referenceNumbers="
				+ referenceNumbers + ", names=" + names
				+ ", destinationCountryCode=" + destinationCountryCode
				+ ", termsofSale=" + termsOfSale + ", fobRelatedInstructions="
				+ fobRelatedInstructions + "]";
	}
}
