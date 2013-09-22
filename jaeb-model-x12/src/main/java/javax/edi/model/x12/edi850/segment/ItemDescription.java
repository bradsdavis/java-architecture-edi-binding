package javax.edi.model.x12.edi850.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="PID")
public class ItemDescription {

	@EDIElement
	@NotNull
	@Size(min=1,max=1)
	private String itemDescType; // 'F'
	
	@Size(min = 2, max = 3)
	@EDIElement
	private String productCharacteristicCode; //
	
	@Size(min = 2, max = 2)
	@EDIElement
	//@Conditional(X?)
	private String agencyQualifierCode; //
	
	@Size(min = 1, max = 12)
	@EDIElement
	//@Conditional(X?)
	private String productDescriptionCode; // 
	
	@Size(min = 1, max = 80)
	@EDIElement
	//@Conditional(X?)
	private String description; // 
	
	@Size(min = 2, max = 2)
	@EDIElement
	private String surfaceLayerPositionCode; //
	
	@Size(min = 1, max = 15)
	@EDIElement
	private String sourceSubQualifier; // 
	
	@Size(min = 1, max = 1)
	@EDIElement
	private String yesNoConditionOrResponseCode; // 
	
	@Size(min = 2, max = 3)
	@EDIElement
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
