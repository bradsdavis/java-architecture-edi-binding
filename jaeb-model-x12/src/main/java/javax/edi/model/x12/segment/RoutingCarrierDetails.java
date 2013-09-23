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
	
	
	@EDIElement(fieldName="TD503", dataElement="67")
	@Size(min=2, max=80)
	private String identificationCode;
	
	@EDIElement(fieldName="TD504", dataElement="91")
	@Size(min=1, max=2)
	private String transportationMethod;
	
	
	@EDIElement(fieldName="TD505", dataElement="387")
	@Size(min=1, max=35)
	private String routing;
	
	
	@EDIElement(fieldName="TD506", dataElement="368")
	@Size(min=2, max=2)
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


	public String getTransportationMethod() {
		return transportationMethod;
	}


	public void setTransportationMethod(String transportationMethod) {
		this.transportationMethod = transportationMethod;
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
