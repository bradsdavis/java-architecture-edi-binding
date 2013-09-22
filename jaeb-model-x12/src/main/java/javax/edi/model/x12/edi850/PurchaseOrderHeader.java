package javax.edi.model.x12.edi850;

import java.util.List;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.edi850.segment.BeginningSegment;
import javax.edi.model.x12.edi850.segment.PurchaseOrderItem;
import javax.edi.model.x12.edi850.segment.ReferenceIdentification;
import javax.edi.model.x12.edi850.segment.ReferenceNumber;
import javax.edi.model.x12.edi850.segment.ShippingBillingEntry;
import javax.edi.model.x12.edi850.segment.SpecifyingDeliveryCarrier;
import javax.edi.model.x12.edi850.segment.TransactionSetHeader;
import javax.edi.model.x12.edi850.segment.TransactionSetTotals;
import javax.edi.model.x12.edi850.segment.TransactionSetTrailer;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
	private List<ReferenceIdentification> referenceIdentifications;

	@Size(max=200)
	private List<ShippingBillingEntry> shippingBillingEntries;
	
	public TransactionSetHeader getTransactionSetHeader() {
		return transactionSetHeader;
	}

	public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
		this.transactionSetHeader = transactionSetHeader;
	}

	public BeginningSegment getBeginningSegment() {
		return beginningSegment;
	}

	public void setBeginningSegment(BeginningSegment beginningSegment) {
		this.beginningSegment = beginningSegment;
	}

	public List<ReferenceNumber> getReferenceNumbers() {
		return referenceNumbers;
	}

	public void setReferenceNumbers(List<ReferenceNumber> referenceNumbers) {
		this.referenceNumbers = referenceNumbers;
	}

	public List<SpecifyingDeliveryCarrier> getSpecifyingDeliveryCarriers() {
		return specifyingDeliveryCarriers;
	}

	public void setSpecifyingDeliveryCarriers(
			List<SpecifyingDeliveryCarrier> specifyingDeliveryCarriers) {
		this.specifyingDeliveryCarriers = specifyingDeliveryCarriers;
	}

	public List<ReferenceIdentification> getReferenceIdentifications() {
		return referenceIdentifications;
	}

	public void setReferenceIdentifications(
			List<ReferenceIdentification> referenceIdentifications) {
		this.referenceIdentifications = referenceIdentifications;
	}

	public List<ShippingBillingEntry> getShippingBillingEntries() {
		return shippingBillingEntries;
	}
	
	public void setShippingBillingEntries(
			List<ShippingBillingEntry> shippingBillingEntries) {
		this.shippingBillingEntries = shippingBillingEntries;
	}

	
}
