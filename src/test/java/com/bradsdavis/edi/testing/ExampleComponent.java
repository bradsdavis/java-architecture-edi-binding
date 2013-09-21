package com.bradsdavis.edi.testing;

import java.util.Collection;


public class ExampleComponent {

	private String fieldOne;
	private String fieldTwo;
	
	private Collection<String> fieldThree;
	
	public Collection<String> getFieldThree() {
		return fieldThree;
	}
	
	public void setFieldThree(Collection<String> fieldThree) {
		this.fieldThree = fieldThree;
	}
	
	public String getFieldOne() {
		return fieldOne;
	}
	
	public String getFieldTwo() {
		return fieldTwo;
	}
	
	public void setFieldOne(String fieldOne) {
		this.fieldOne = fieldOne;
	}
	
	public void setFieldTwo(String fieldTwo) {
		this.fieldTwo = fieldTwo;
	}
}
