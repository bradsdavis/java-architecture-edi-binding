package javax.edi.model.x12.edi810;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.edi810.segment.AllowanceChargeOrService;
import javax.edi.model.x12.edi810.segment.TotalMonetaryValueSummary;
import javax.edi.model.x12.segment.TransactionSetTrailer;
import javax.edi.model.x12.segment.TransactionTotal;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class Trailer {

	@NotNull
	private TotalMonetaryValueSummary totalMonetaryValueSummary;
	
	@EDICollectionType(AllowanceChargeOrService.class)
	@Size(min=0, max=10)
	private Collection<AllowanceChargeOrService> allowanceChargeOrServices;
	
	@NotNull
	private TransactionTotal transactionTotals;
	
	@NotNull
	private TransactionSetTrailer transactionSetTrailer;

	public TotalMonetaryValueSummary getTotalMonetaryValueSummary() {
		return totalMonetaryValueSummary;
	}

	public void setTotalMonetaryValueSummary(
			TotalMonetaryValueSummary totalMonetaryValueSummary) {
		this.totalMonetaryValueSummary = totalMonetaryValueSummary;
	}

	public Collection<AllowanceChargeOrService> getAllowanceChargeOrServices() {
		return allowanceChargeOrServices;
	}

	public void setAllowanceChargeOrServices(
			Collection<AllowanceChargeOrService> allowanceChargeOrServices) {
		this.allowanceChargeOrServices = allowanceChargeOrServices;
	}

	public TransactionTotal getTransactionTotals() {
		return transactionTotals;
	}

	public void setTransactionTotals(TransactionTotal transactionTotals) {
		this.transactionTotals = transactionTotals;
	}

	public TransactionSetTrailer getTransactionSetTrailer() {
		return transactionSetTrailer;
	}

	public void setTransactionSetTrailer(TransactionSetTrailer transactionSetTrailer) {
		this.transactionSetTrailer = transactionSetTrailer;
	}
	
}
