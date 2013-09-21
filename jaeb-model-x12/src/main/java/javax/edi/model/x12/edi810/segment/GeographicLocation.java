package javax.edi.model.x12.edi810.segment;

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
	//@Conditional(X?)
	private String locationQualifier; // 
	
	@Size(min = 1, max = 25)
	@EDIElement
	//@Conditional(X?)
	private String locationIdentifier; // 
}
