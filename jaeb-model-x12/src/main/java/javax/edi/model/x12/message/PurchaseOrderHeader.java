package javax.edi.model.x12.message;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.AdministrativeCommunicationsContact;
import javax.edi.model.x12.segment.BeginningSegment;
import javax.edi.model.x12.segment.Currency;
import javax.edi.model.x12.segment.ReferenceIdentification;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.edi.model.x12.segment.SpecifyingDeliveryCarrier;
import javax.edi.model.x12.segment.TransactionSetHeader;

@EDISegmentGroup
public class PurchaseOrderHeader {

	@NotNull
	private TransactionSetHeader transactionSetHeader;
	
	@NotNull
	private BeginningSegment beginningSegment;
	
	@Size(max=12)
	private List<ReferenceNumber> referenceNumbers;
	
	@Size(max=12)
	private List<SpecifyingDeliveryCarrier> specifyingDeliveryCarriers;

	@Size(max=1000)
	private List<ReferenceIdentification> referenceIdentification;

	private Currency currency;
		
	private AdministrativeCommunicationsContact administrationCommunicationsContact;

}
