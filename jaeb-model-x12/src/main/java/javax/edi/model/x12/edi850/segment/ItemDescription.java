package javax.edi.model.x12.edi850.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="PID")
public class ItemDescription {

	@EDIElement(fieldName="PID01",dataElement="349")
	@NotNull
	@Size(min=1,max=1)
	private String itemDescType; // 'F'
	
	@Size(min = 2, max = 3)
	@EDIElement(fieldName="PID02",dataElement="750")
	private String productCharacteristicCode; //
	
	@Size(min = 2, max = 2)
	@EDIElement(fieldName="PID03",dataElement="559",conditional=true)//X?
	private String agencyQualifierCode; //
	
	@Size(min = 1, max = 12)
	@EDIElement(fieldName="PID04",dataElement="751",conditional=true)//X?
	private String productDescriptionCode; // 
	
	@Size(min = 1, max = 80)
	@EDIElement(fieldName="PID05",dataElement="352",conditional=true)//X?
	private String description; // 
	
	@Size(min = 2, max = 2)
	@EDIElement(fieldName="PID06",dataElement="752")
	private String surfaceLayerPositionCode; //
	
	@Size(min = 1, max = 15)
	@EDIElement(fieldName="PID07",dataElement="822")
	private String sourceSubQualifier; // 
	
	@Size(min = 1, max = 1)
	@EDIElement(fieldName="PID08",dataElement="1073")
	private String yesNoConditionOrResponseCode; // 
	
	@Size(min = 2, max = 3)
	@EDIElement(fieldName="PID09",dataElement="819")
	private String languageCode; // 

	public String getItemDescType() {
		return itemDescType;
	}

	public void setItemDescType(String itemDescType) {
		this.itemDescType = itemDescType;
	}

	public String getProductCharacteristicCode() {
		return productCharacteristicCode;
	}

	public void setProductCharacteristicCode(String productCharacteristicCode) {
		this.productCharacteristicCode = productCharacteristicCode;
	}

	public String getAgencyQualifierCode() {
		return agencyQualifierCode;
	}

	public void setAgencyQualifierCode(String agencyQualifierCode) {
		this.agencyQualifierCode = agencyQualifierCode;
	}

	public String getProductDescriptionCode() {
		return productDescriptionCode;
	}

	public void setProductDescriptionCode(String productDescriptionCode) {
		this.productDescriptionCode = productDescriptionCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSurfaceLayerPositionCode() {
		return surfaceLayerPositionCode;
	}

	public void setSurfaceLayerPositionCode(String surfaceLayerPositionCode) {
		this.surfaceLayerPositionCode = surfaceLayerPositionCode;
	}

	public String getSourceSubQualifier() {
		return sourceSubQualifier;
	}

	public void setSourceSubQualifier(String sourceSubQualifier) {
		this.sourceSubQualifier = sourceSubQualifier;
	}

	public String getYesNoConditionOrResponseCode() {
		return yesNoConditionOrResponseCode;
	}

	public void setYesNoConditionOrResponseCode(String yesNoConditionOrResponseCode) {
		this.yesNoConditionOrResponseCode = yesNoConditionOrResponseCode;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
}
