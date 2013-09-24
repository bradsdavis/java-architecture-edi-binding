package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;

@EDISegment(tag="N4")
public class GeographicLocation {


	@EDIElement(fieldName="N401", dataElement="19")
	@Size(min=2, max=30)
	//@Size(min=2, max=25, groups={USSCO.class})
	private String cityName;
	
	@EDIElement(fieldName="N402", dataElement="156")
	@Size(min=2, max=2)
	private String stateOrProvinceCode;
	
	@EDIElement(fieldName="N403", dataElement="116")
	@Size(min=3, max=15)
	//@Size(min = 3, max = 10, groups={USSCO.class})
	private String postalCode;

	@EDIElement(fieldName="N404", dataElement="26")
	@Size(min=2, max=3)
	private String countryCode;

	@EDIElement(fieldName="N405",dataElement="309",conditional=true) //X?
	@Size(min = 1, max = 2)
	private String locationQualifier; 
	
	@EDIElement(fieldName="N406",dataElement="310",conditional=true)//X?
	@Size(min = 1, max = 25)
	private String locationIdentifier; 
	
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateOrProvinceCode() {
		return stateOrProvinceCode;
	}

	public void setStateOrProvinceCode(String stateOrProvinceCode) {
		this.stateOrProvinceCode = stateOrProvinceCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getLocationQualifier() {
		return locationQualifier;
	}

	public void setLocationQualifier(String locationQualifier) {
		this.locationQualifier = locationQualifier;
	}

	public String getLocationIdentifier() {
		return locationIdentifier;
	}

	public void setLocationIdentifier(String locationIdentifier) {
		this.locationIdentifier = locationIdentifier;
	}

}
