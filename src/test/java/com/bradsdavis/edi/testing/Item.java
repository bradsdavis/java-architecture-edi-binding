package com.bradsdavis.edi.testing;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import com.bradsdavis.edi.annotations.EDICollectionType;
import com.bradsdavis.edi.annotations.EDIComponent;
import com.bradsdavis.edi.annotations.EDISegment;
import com.bradsdavis.edi.annotations.elements.EDIElementFormat;

@EDISegment(tag="ITEM")
public class Item {

	private String firstField;
	
	@EDIElementFormat(format="yyyyMMdd")
	private Date secondField;
	
	@EDIElementFormat(format="MM-dd-yyyy")
	private Date thirdField;
	
	@EDIElementFormat(format="#,###.00")
	private BigDecimal fourthField;
	
	@EDIElementFormat(format="#,###.00")
	private Float fifthField;
	
	@EDIComponent(delimiter=":")
	@EDICollectionType(type=String.class)
	private Collection<String> exampleComponent;
	
	@EDIElementFormat(format="yyyyMMdd")
	@EDIComponent()
	@EDICollectionType(type=Date.class)
	private Collection<Date> exampleDateComponents;
	
	public Collection<Date> getExampleDateComponents() {
		return exampleDateComponents;
	}
	
	public void setExampleDateComponents(Collection<Date> exampleDateComponents) {
		this.exampleDateComponents = exampleDateComponents;
	}
	
	
	public Collection<String> getExampleComponent() {
		return exampleComponent;
	}
	
	public void setExampleComponent(Collection<String> exampleComponent) {
		this.exampleComponent = exampleComponent;
	}
	
	
	public Float getFifthField() {
		return fifthField;
	}
	
	public void setFifthField(Float fifthField) {
		this.fifthField = fifthField;
	}
	
	public BigDecimal getFourthField() {
		return fourthField;
	}
	
	public void setFourthField(BigDecimal fourthField) {
		this.fourthField = fourthField;
	}
	
	public String getFirstField() {
		return firstField;
	}
	
	public void setFirstField(String firstField) {
		this.firstField = firstField;
	}
	
	public Date getSecondField() {
		return secondField;
	}
	
	public void setSecondField(Date secondField) {
		this.secondField = secondField;
	}
	
	public Date getThirdField() {
		return thirdField;
	}
	
	public void setThirdField(Date thirdField) {
		this.thirdField = thirdField;
	}
}
