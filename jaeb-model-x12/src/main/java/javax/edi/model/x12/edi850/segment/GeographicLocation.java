package javax.edi.model.x12.edi850.segment;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag = "N4")
public class GeographicLocation {
	
	@NotNull
	@Size(min = 2, max = 25)
	@EDIElement
	private String cityName; // Name of city
	
	@NotNull
	@Size(min = 2, max = 2)
	@EDIElement
	private String stateProvince; // Name of state or province
	
	@Size(min = 3, max = 10)
	@EDIElement
	//@Conditional
	private String postalCode; // Postal zip code e.g. '60018')
	
	@Size(min = 2, max = 3)
	@EDIElement
	//@Conditional
	private String countyCode; // e.g. 'US'
	
	@Size(min = 1, max = 2)
	@EDIElement
	(conditional=true)
	private String locationQualifier; // 
	
	@Size(min = 1, max = 25)
	@EDIElement
	(conditional=true)
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

	public String getCountyCode() {
		return countyCode;
	}

	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
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
