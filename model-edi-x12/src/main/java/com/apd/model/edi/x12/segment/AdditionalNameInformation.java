package com.apd.model.edi.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="N2")
public class AdditionalNameInformation {
	
	@Size(min = 1, max = 35)
	@EDIElement
	private String name; // 
	
}
