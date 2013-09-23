package javax.edi.model.x12.edi850;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.ReferenceNumber;
import javax.edi.model.x12.edi850.segment.BeginningSegmentForPurchaseOrder;
import javax.edi.model.x12.edi850.segment.ReferenceIdentification;
import javax.edi.model.x12.edi850.segment.ShippingBillingEntry;
import javax.edi.model.x12.edi850.segment.SpecifyingDeliveryCarrier;
import javax.edi.model.x12.edi850.segment.TransactionSetHeader;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class Header {

	@NotNull
	private TransactionSetHeader transactionSetHeader;
	
	@NotNull
	private BeginningSegmentForPurchaseOrder beginningSegment;
	
	@Size(max=12)
	@EDICollectionType(ReferenceNumber.class)
	private Collection<ReferenceNumber> referenceNumbers;
	
	@Size(max=12)
	@EDICollectionType(SpecifyingDeliveryCarrier.class)
	private Collection<SpecifyingDeliveryCarrier> specifyingDeliveryCarriers;

	@Size(max=1000)
	@EDICollectionType(ReferenceIdentification.class)
	private Collection<ReferenceIdentification> referenceIdentifications;

	@Size(max=200)
	@EDICollectionType(ShippingBillingEntry.class)
	private Collection<ShippingBillingEntry> shippingBillingEntries;
	
	public TransactionSetHeader getTransactionSetHeader() {
		return transactionSetHeader;
	}

	public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
		this.transactionSetHeader = transactionSetHeader;
	}

	public BeginningSegmentForPurchaseOrder getBeginningSegment() {
		return beginningSegment;
	}

	public void setBeginningSegment(BeginningSegmentForPurchaseOrder beginningSegment) {
		this.beginningSegment = beginningSegment;
	}

	public Collection<ReferenceNumber> getReferenceNumbers() {
		return referenceNumbers;
	}

	public void setReferenceNumbers(Collection<ReferenceNumber> referenceNumbers) {
		this.referenceNumbers = referenceNumbers;
	}

	public Collection<SpecifyingDeliveryCarrier> getSpecifyingDeliveryCarriers() {
		return specifyingDeliveryCarriers;
	}

	public void setSpecifyingDeliveryCarriers(
			Collection<SpecifyingDeliveryCarrier> specifyingDeliveryCarriers) {
		this.specifyingDeliveryCarriers = specifyingDeliveryCarriers;
	}

	public Collection<ReferenceIdentification> getReferenceIdentifications() {
		return referenceIdentifications;
	}

	public void setReferenceIdentifications(
			Collection<ReferenceIdentification> referenceIdentifications) {
		this.referenceIdentifications = referenceIdentifications;
	}

	public Collection<ShippingBillingEntry> getShippingBillingEntries() {
		return shippingBillingEntries;
	}
	
	public void setShippingBillingEntries(
			Collection<ShippingBillingEntry> shippingBillingEntries) {
		this.shippingBillingEntries = shippingBillingEntries;
	}
}
