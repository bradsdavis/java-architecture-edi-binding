package javax.edi.bind.test.beans;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDIComponent;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;

@EDISegment(tag="ITEM")
public class Item {

	private String firstField;
	
	@EDIElementFormat("yyyyMMdd")
	private Date secondField;
	
	@EDIElementFormat("MM-dd-yyyy")
	private Date thirdField;
	
	@EDIElementFormat("#,###.00")
	private BigDecimal fourthField;
	
	@EDIElementFormat("#,###.00")
	private Float fifthField;
	
	@EDIComponent(delimiter=':')
	@EDICollectionType(String.class)
	private Collection<String> exampleComponent;
	
	@EDIElementFormat("yyyyMMdd")
	@EDIComponent()
	@EDICollectionType(Date.class)
	private Collection<Date> exampleDateComponents;
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Item [firstField=" + firstField + ", secondField=" + secondField + ", thirdField=" + thirdField + ", fourthField=" + fourthField + ", fifthField=" + fifthField + ", exampleComponent="
				+ exampleComponent + ", exampleDateComponents=" + exampleDateComponents + "]";
	}

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
