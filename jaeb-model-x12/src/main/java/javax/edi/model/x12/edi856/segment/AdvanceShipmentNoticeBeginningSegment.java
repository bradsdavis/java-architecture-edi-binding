package javax.edi.model.x12.edi856.segment;

import java.util.Date;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.Size;

@EDISegment(tag="BSN")
public class AdvanceShipmentNoticeBeginningSegment {

	@Size(min=2, max=2)
	@EDIElement(fieldName="BSN01")
	private String transactionSetPurposeCode;

	@Size(min=2, max=30)
	@EDIElement(fieldName="BSN02")
	private String shipmentIdentification;

	@EDIElement(fieldName="BSN03")
	@EDIElementFormat("yyyyMMdd")
	private Date date;

	@Size(min=4, max=4)
	@EDIElementFormat("hhmm")
	private String time;

	@Size(min=4, max=4)
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
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getHierarchicalStructure() {
		return hierarchicalStructure;
	}

	public void setHierarchicalStructure(String hierarchicalStructure) {
		this.hierarchicalStructure = hierarchicalStructure;
	}
}
