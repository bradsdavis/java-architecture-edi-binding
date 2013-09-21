package javax.edi.model.x12.edi850;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.edi850.segment.AdministrativeCommunicationsContact;
import javax.edi.model.x12.edi850.segment.BeginningSegment;
import javax.edi.model.x12.edi850.segment.Currency;
import javax.edi.model.x12.edi850.segment.ReferenceIdentification;
import javax.edi.model.x12.edi850.segment.ReferenceNumber;
import javax.edi.model.x12.edi850.segment.SpecifyingDeliveryCarrier;
import javax.edi.model.x12.edi850.segment.TransactionSetHeader;

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

	public List<ReferenceIdentification> getReferenceIdentification() {
		return referenceIdentification;
	}

	public void setReferenceIdentification(
			List<ReferenceIdentification> referenceIdentification) {
		this.referenceIdentification = referenceIdentification;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public AdministrativeCommunicationsContact getAdministrationCommunicationsContact() {
		return administrationCommunicationsContact;
	}

	public void setAdministrationCommunicationsContact(
			AdministrativeCommunicationsContact administrationCommunicationsContact) {
		this.administrationCommunicationsContact = administrationCommunicationsContact;
	}

	
	
}
