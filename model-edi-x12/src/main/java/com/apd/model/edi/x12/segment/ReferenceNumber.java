package com.apd.model.edi.x12.segment;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag = "REF")
public class ReferenceNumber {
	
	@NotNull
	@Size(min = 2, max = 2)
	@EDIElement
	private String referenceIdentificationQualifier; // ''SS'=Detail ADOT indicator, ‘SU’=reg ADOT indicator‘RU’=routing info,‘PO’=consumer PO data,‘ZZ’=wrap & label indicator,‘11’=consolidated PO #
	
	@Size(min = 1, max = 35)
	@EDIElement
	//@Conditional
	private String referenceIdentification;
//	DTL ADOT indicator if REF01=SS
//			Route info if REF01=RU
//			Consumer PO info if REF01=PO
//			Wrap/Label indicator(‘WL’)
//			Consolidates PO info if REF01=11 
//			if REF01=SU or SS 
//			  ‘S’=use split ADOT processing,
//			  ‘N’=suppress ADOT processing,
//			  ‘Y’ or ‘ ‘=use basic ADOT,
//			  
	
	@Size(min = 1, max = 2)
	@EDIElement
	//@Conditional
	private String referenceDescription; 
//	Route tag info if REF01=RU
//			Consumer PO tag info if REF01=PO
//			Consolidated PO tag if REF01=11

}
