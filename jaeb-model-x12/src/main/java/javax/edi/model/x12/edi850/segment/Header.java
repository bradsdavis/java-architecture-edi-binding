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
	private Collection<RoutingCarrierDetails> specifyingDeliveryCarrier;
	
	@EDICollectionType(ReferenceIdentification.class)
	@Size(max=1000)
	private Collection<ReferenceIdentification> handlingLabelDealerInformation;

	@EDICollectionType(ShipmentInformationGroup.class)
	@Size(max=200)
	private Collection<ShipmentInformationGroup> shipmentInformationGroup;
	
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

	public Collection<RoutingCarrierDetails> getSpecifyingDeliveryCarrier() {
		return specifyingDeliveryCarrier;
	}

	public void setSpecifyingDeliveryCarrier(
			Collection<RoutingCarrierDetails> specifyingDeliveryCarrier) {
		this.specifyingDeliveryCarrier = specifyingDeliveryCarrier;
	}

	public Collection<ReferenceIdentification> getHandlingLabelDealerInformation() {
		return handlingLabelDealerInformation;
	}

	public void setHandlingLabelDealerInformation(
			Collection<ReferenceIdentification> handlingLabelDealerInformation) {
		this.handlingLabelDealerInformation = handlingLabelDealerInformation;
	}

	
}
