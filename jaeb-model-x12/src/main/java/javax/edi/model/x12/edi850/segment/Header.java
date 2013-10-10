package javax.edi.model.x12.edi850.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.ReferenceIdentification;
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
	
	@EDICollectionType(ReferenceNumber.class)
	@Size(max=12)
	private Collection<ReferenceNumber> referenceNumbers;
	
	@EDICollectionType(RoutingCarrierDetails.class)
	@Size(max=12)
	private Collection<RoutingCarrierDetails> routingCarrierDetails;

	@Size(max=1000)
	@EDICollectionType(ReferenceIdentification.class)
	private Collection<ReferenceIdentification> referenceIdentifications;

	@Size(max=200)
	@EDICollectionType(ShippingBillingGroup.class)
	private Collection<ShippingBillingGroup> shippingBillingGroups;
	
	public TransactionSetHeader getTransactionSetHeader() {
		return transactionSetHeader;
	}

	public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
		this.transactionSetHeader = transactionSetHeader;
	}

	public PurchaseOrderBeginningSegment getBeginningSegment() {
		return beginningSegment;
	}

	public void setBeginningSegment(PurchaseOrderBeginningSegment beginningSegment) {
		this.beginningSegment = beginningSegment;
	}

	public Collection<ReferenceNumber> getReferenceNumbers() {
		return referenceNumbers;
	}

	public void setReferenceNumbers(Collection<ReferenceNumber> referenceNumbers) {
		this.referenceNumbers = referenceNumbers;
	}

	public Collection<RoutingCarrierDetails> getRoutingCarrierDetails() {
		return routingCarrierDetails;
	}

	public void setRoutingCarrierDetails(
			Collection<RoutingCarrierDetails> routingCarrierDetails) {
		this.routingCarrierDetails = routingCarrierDetails;
	}

	public Collection<ReferenceIdentification> getReferenceIdentifications() {
		return referenceIdentifications;
	}

	public void setReferenceIdentifications(
			Collection<ReferenceIdentification> referenceIdentifications) {
		this.referenceIdentifications = referenceIdentifications;
	}

	public Collection<ShippingBillingGroup> getShippingBillingGroups() {
		return shippingBillingGroups;
	}

	public void setShippingBillingGroups(
			Collection<ShippingBillingGroup> shippingBillingGroups) {
		this.shippingBillingGroups = shippingBillingGroups;
	}
}
