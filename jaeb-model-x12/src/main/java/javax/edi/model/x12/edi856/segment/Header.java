package javax.edi.model.x12.edi856.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.TransactionSetHeader;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Header {

	@NotNull
	private TransactionSetHeader transactionSetHeader;
	
	@NotNull
	private AdvanceShipmentNoticeBeginningSegment beginningSegment;

	private Collection<ShipmentLevelGroup> shipmentLevelGroups;

	
	public Collection<ShipmentLevelGroup> getShipmentLevelGroups() {
		return shipmentLevelGroups;
	}
	
	public void setShipmentLevelGroups(
			Collection<ShipmentLevelGroup> shipmentLevelGroups) {
		this.shipmentLevelGroups = shipmentLevelGroups;
	}
	
	public TransactionSetHeader getTransactionSetHeader() {
		return transactionSetHeader;
	}

	public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
		this.transactionSetHeader = transactionSetHeader;
	}

	public AdvanceShipmentNoticeBeginningSegment getBeginningSegment() {
		return beginningSegment;
	}

	public void setBeginningSegment(AdvanceShipmentNoticeBeginningSegment beginningSegment) {
		this.beginningSegment = beginningSegment;
	}
	
	
}
