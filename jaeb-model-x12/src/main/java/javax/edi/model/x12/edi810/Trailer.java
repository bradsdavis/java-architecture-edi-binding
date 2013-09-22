package javax.edi.model.x12.edi810;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.edi810.segment.AllowanceChargeOrService;
import javax.edi.model.x12.edi810.segment.TotalMonetaryValueSummary;
import javax.edi.model.x12.edi810.segment.TransactionSetTrailer;
import javax.edi.model.x12.edi810.segment.TransactionTotal;
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
	
}
