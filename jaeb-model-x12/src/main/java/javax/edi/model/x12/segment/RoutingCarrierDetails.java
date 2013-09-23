package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;

@EDISegment(tag="TD5")
public class RoutingCarrierDetails {

	@Size(min=1, max=2)
	@EDIElement(fieldName="TD501", dataElement="133")
	private String routingSequenceCode;
	
	@Size(min=1, max=2)
	@EDIElement(fieldName="TD502", dataElement="66")
	private String identificationCodeQualifier;
	
	@Size(min=2, max=80)
	@EDIElement(fieldName="TD503", dataElement="67")	
	private String identificationCode;
	
	@Size(min=1, max=2)
	@EDIElement(fieldName="TD504", dataElement="387")	
	private String transportationMethodTypeCode;
	
	@Size(min=1, max=35)
	@EDIElement(fieldName="TD505", dataElement="387")	
	private String routing;
	
	@Size(min = 2, max = 2)
	@EDIElement(fieldName="TD506",dataElement="368",conditional=true)
	private String shipmentOrderStatusCode; 

	public String getRoutingSequenceCode() {
		return routingSequenceCode;
	}

	public void setRoutingSequenceCode(String routingSequenceCode) {
		this.routingSequenceCode = routingSequenceCode;
	}

	public String getIdentificationCodeQualifier() {
		return identificationCodeQualifier;
	}

	public void setIdentificationCodeQualifier(String identificationCodeQualifier) {
		this.identificationCodeQualifier = identificationCodeQualifier;
	}

	public String getIdentificationCode() {
		return identificationCode;
	}

	public void setIdentificationCode(String identificationCode) {
		this.identificationCode = identificationCode;
	}

	public String getTransportationMethodTypeCode() {
		return transportationMethodTypeCode;
	}

	public void setTransportationMethodTypeCode(String transportationMethodTypeCode) {
		this.transportationMethodTypeCode = transportationMethodTypeCode;
	}

	public String getRouting() {
		return routing;
	}

	public void setRouting(String routing) {
		this.routing = routing;
	}

	public String getShipmentOrderStatusCode() {
		return shipmentOrderStatusCode;
	}

	public void setShipmentOrderStatusCode(String shipmentOrderStatusCode) {
		this.shipmentOrderStatusCode = shipmentOrderStatusCode;
	}
}
