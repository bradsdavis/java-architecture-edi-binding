package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="PID")
public class ProductItemDescription {

	@EDIElement(fieldName="PID01", dataElement="349")
	@NotNull
	@Size(min=1, max=1)
	private String itemDescriptionType;
	
	@EDIElement(fieldName="PID02",dataElement="750")
	@Size(min = 2, max = 3)
	private String productCharacteristicCode;
	
	@EDIElement(fieldName="PID03",dataElement="559",conditional=true)//X?
	@Size(min = 2, max = 2)
	private String agencyQualifierCode;
	
	@EDIElement(fieldName="PID04",dataElement="751",conditional=true)//X?
	@Size(min = 1, max = 12)
	private String productDescriptionCode;

	@EDIElement(fieldName="PID05", dataElement="352")
	@Size(min=1, max=80)
	private String description;
	
	@EDIElement(fieldName="PID06",dataElement="752")
	@Size(min = 2, max = 2)
	private String surfaceLayerPositionCode;
	
	@EDIElement(fieldName="PID07",dataElement="822")
	@Size(min = 1, max = 15)
	private String sourceSubQualifier;
	
	@EDIElement(fieldName="PID08",dataElement="1073")
	@Size(min = 1, max = 1)
	private String yesNoConditionOrResponseCode;
	
	@EDIElement(fieldName="PID09",dataElement="819")
	@Size(min = 2, max = 3)
	private String languageCode;

	public String getItemDescriptionType() {
		return itemDescriptionType;
	}

	public void setItemDescriptionType(String itemDescriptionType) {
		this.itemDescriptionType = itemDescriptionType;
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
