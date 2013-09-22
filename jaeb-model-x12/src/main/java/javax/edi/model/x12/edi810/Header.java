package javax.edi.model.x12.edi810;

import java.util.Collection;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.edi810.segment.BeginningSegmentforInvoice;
import javax.edi.model.x12.edi810.segment.Currency;
import javax.edi.model.x12.edi810.segment.DestinationCountryCode;
import javax.edi.model.x12.edi810.segment.FOBRelatedInstruction;
import javax.edi.model.x12.edi810.segment.Name;
import javax.edi.model.x12.edi810.segment.NoteSpecialInstructions;
import javax.edi.model.x12.edi810.segment.ReferenceNumber;
import javax.edi.model.x12.edi810.segment.TermsofSale;
import javax.edi.model.x12.edi810.segment.TransactionSetHeader;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup()
public class Header {

	@NotNull
	private TransactionSetHeader transactionSetHeader;
	
	@NotNull
	private BeginningSegmentforInvoice beginningSegmentforInvoice;
	
	//optional
	private Currency currency;

	@Size(min=0, max=100)
	private Collection<NoteSpecialInstructions> noteSpecialInstructions;
	
	private ReferenceNumber referenceNumbers;
	
	@Size(min=0, max=200)
	private Collection<Name> names;
	
	private DestinationCountryCode destinationCountryCode;
	
	@Size(max=5)
	private Collection<TermsofSale> termsofSale;
	private FOBRelatedInstruction fobRelatedInstructions;
}
