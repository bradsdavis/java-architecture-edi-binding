package javax.edi.model.x12.edi997.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.ElementNoteInformation;
import javax.edi.model.x12.segment.SegmentNoteInformation;
import javax.edi.model.x12.segment.TransactionSetResponseHeader;
import javax.edi.model.x12.segment.TransactionSetResponseTrailer;

@EDISegmentGroup
public class Detail {

	private TransactionSetResponseHeader transactionSetResponseHeader;
	private SegmentNoteInformation segmentNoteInformation;
	private ElementNoteInformation elementNoteInformation;
	private TransactionSetResponseTrailer transactionSetResponseTrailer;
	
	public TransactionSetResponseHeader getTransactionSetResponseHeader() {
		return transactionSetResponseHeader;
	}
	public void setTransactionSetResponseHeader(
			TransactionSetResponseHeader transactionSetResponseHeader) {
		this.transactionSetResponseHeader = transactionSetResponseHeader;
	}
	public SegmentNoteInformation getSegmentNoteInformation() {
		return segmentNoteInformation;
	}
	public void setSegmentNoteInformation(
			SegmentNoteInformation segmentNoteInformation) {
		this.segmentNoteInformation = segmentNoteInformation;
	}
	public ElementNoteInformation getElementNoteInformation() {
		return elementNoteInformation;
	}
	public void setElementNoteInformation(
			ElementNoteInformation elementNoteInformation) {
		this.elementNoteInformation = elementNoteInformation;
	}
	public TransactionSetResponseTrailer getTransactionSetResponseTrailer() {
		return transactionSetResponseTrailer;
	}
	public void setTransactionSetResponseTrailer(
			TransactionSetResponseTrailer transactionSetResponseTrailer) {
		this.transactionSetResponseTrailer = transactionSetResponseTrailer;
	}
	
	
}
