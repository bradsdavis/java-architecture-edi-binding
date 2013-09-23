package javax.edi.model.x12.edi850.segment;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag = "N4")
public class GeographicLocation {
	
	@NotNull
	@Size(min = 2, max = 25)
	@EDIElement(fieldName="N401",dataElement="19")
	private String cityName; // Name of city
	
	@NotNull
	@Size(min = 2, max = 2)
	@EDIElement(fieldName="N402",dataElement="156")
	private String stateProvince; // Name of state or province
	
	@Size(min = 3, max = 10)
	@EDIElement(fieldName="N403",dataElement="116")
	private String postalCode; // Postal zip code e.g. '60018')
	
	@Size(min = 2, max = 3)
	@EDIElement(fieldName="N404",dataElement="26")
	private String countryCode; // e.g. 'US'
	
	@Size(min = 1, max = 2)
	@EDIElement(fieldName="N405",dataElement="309",conditional=true) //X?
	private String locationQualifier; // 
	
	@Size(min = 1, max = 25)
	@EDIElement(fieldName="N406",dataElement="310",conditional=true)//X?
	private String locationIdentifier; // 

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
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
