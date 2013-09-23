package javax.edi.model.x12.edi850.segment;

import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag="TD5")
public class SpecifyingDeliveryCarrier {
	
	@Size(min = 1, max = 2)
	@EDIElement(fieldName="TD501",dataElement="133")
	private String routingSequenceCode; //
	
	@Size(min = 1, max = 2)
	@EDIElement(fieldName="TD502",dataElement="66",conditional=true)
	private String identificationCodeQualifier; // 
	
	@Size(min = 2, max = 80)
	@EDIElement(fieldName="TD503",dataElement="67",conditional=true)
	private String identificationCode; // Carrier Specific Billing ID for third party billing only.
	
	@Size(min = 1, max = 2)
	@EDIElement(fieldName="TD504",dataElement="91",conditional=true)
	private String transportationMethod; // 
	
	@Size(min = 1, max = 35)
	@EDIElement(fieldName="TD505",dataElement="387",conditional=true)
	private String routing; // Carrier Code used for third party billing only.  Use "UPS" for United Parcel Service and "FDX" for Federal Express.
	
	@Size(min = 2, max = 2)
	@EDIElement(fieldName="TD506",dataElement="368",conditional=true)
	private String shipmentOrderStatusCode; // 

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
