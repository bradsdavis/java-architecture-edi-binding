package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="REF")
public class ReferenceNumber {

<<<<<<< HEAD
	@EDIElement(fieldName="REF01",dataElement="128")
	@NotNull
	@Size(min = 2, max = 2)
	private String referenceIdentificationQualifier; // ''SS'=Detail ADOT indicator, ?SU?=reg ADOT indicator?RU?=routing info,?PO?=consumer PO data,?ZZ?=wrap & label indicator,?11?=consolidated PO #
	
	@EDIElement(fieldName="REF02",dataElement="127",conditional=true)
	@Size(min = 1, max = 35)
	private String referenceIdentification;
//	DTL ADOT indicator if REF01=SS
//			Route info if REF01=RU
//			Consumer PO info if REF01=PO
//			Wrap/Label indicator(?WL?)
//			Consolidates PO info if REF01=11 
//			if REF01=SU or SS 
//			  ?S?=use split ADOT processing,
//			  ?N?=suppress ADOT processing,
//			  ?Y? or ? ?=use basic ADOT,
//			  
	
	
	@EDIElement(fieldName="REF03",dataElement="352",conditional=true)
	@Size(min = 1, max = 2)
	private String referenceDescription; 
//	Route tag info if REF01=RU
//			Consumer PO tag info if REF01=PO
//			Consolidated PO tag if REF01=11
=======

	@EDIElement(fieldName="REF01", dataElement="128")
	@NotNull
	@Size(min=2, max=3)
	private String referenceIdentificationQualifier;
	
	@EDIElement(fieldName="REF02", dataElement="127")
	@Size(min=1, max=35)
	private String referenceIdentification;
	
	@EDIElement(fieldName="REF03", dataElement="352")
	@Size(min=1, max=2)
	private String referenceDescription;
>>>>>>> 99f866fb9cba4b1da487a4298b85f074dad93976

	public String getReferenceIdentificationQualifier() {
		return referenceIdentificationQualifier;
	}

	public void setReferenceIdentificationQualifier(
			String referenceIdentificationQualifier) {
		this.referenceIdentificationQualifier = referenceIdentificationQualifier;
	}

	public String getReferenceIdentification() {
		return referenceIdentification;
	}

	public void setReferenceIdentification(String referenceIdentification) {
		this.referenceIdentification = referenceIdentification;
	}

	public String getReferenceDescription() {
		return referenceDescription;
	}

	public void setReferenceDescription(String referenceDescription) {
		this.referenceDescription = referenceDescription;
	}

	
	
}
