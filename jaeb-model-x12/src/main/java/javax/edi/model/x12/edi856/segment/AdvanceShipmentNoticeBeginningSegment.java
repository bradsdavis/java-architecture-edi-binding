package javax.edi.model.x12.edi856.segment;

import java.util.Date;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag="BSN")
public class AdvanceShipmentNoticeBeginningSegment {

	@EDIElement(fieldName="BSN01")
	private String transactionSetPurposeCode;

	@EDIElement(fieldName="BSN02")
	private String shipmentIdentification;

	@EDIElement(fieldName="BSN03")
	private Date date;

	@EDIElement(fieldName="BSN04")
	private Date time;

	@EDIElement(fieldName="BSN05")
	private String hierarchicalStructure;

	public String getTransactionSetPurposeCode() {
		return transactionSetPurposeCode;
	}

	public void setTransactionSetPurposeCode(String transactionSetPurposeCode) {
		this.transactionSetPurposeCode = transactionSetPurposeCode;
	}

	public String getShipmentIdentification() {
		return shipmentIdentification;
	}

	public void setShipmentIdentification(String shipmentIdentification) {
		this.shipmentIdentification = shipmentIdentification;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getHierarchicalStructure() {
		return hierarchicalStructure;
	}

	public void setHierarchicalStructure(String hierarchicalStructure) {
		this.hierarchicalStructure = hierarchicalStructure;
	}
}
