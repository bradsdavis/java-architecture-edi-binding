package javax.edi.model.x12.edi850.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.edi.model.x12.segment.RoutingCarrierDetails;
import javax.edi.model.x12.segment.TransactionSetHeader;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class Header {

	@NotNull
	private TransactionSetHeader transactionSetHeader;
	
	@NotNull
	private PurchaseOrderBeginningSegment beginningSegment;
	
	@Size(max=12)
	private Collection<ReferenceNumber> referenceNumbers;
	
	@Size(max=12)
	private Collection<RoutingCarrierDetails> specifyingDeliveryCarrier;
	
	
}
