package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDIHierarchicalIdentifier;
import javax.edi.bind.annotations.EDIHierarchicalParentReference;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="HL")
public class HierarchicalLevel {

	@EDIHierarchicalIdentifier
	@EDIElement(fieldName="HL01")
	@Size(min=1, max=12)
	@NotNull
	private String hierarchicalIDNumber;

	@EDIHierarchicalParentReference
	@EDIElement(fieldName="HL02")
	@Size(min=1, max=12)
	private String hierarchicalParentIDNumber;
	
	@EDIElement(fieldName="HL03")
	@Size(min=1, max=2)
	@NotNull
	private String hierarchicalLevelCode;

	@EDIElement(fieldName="HL04")
	@Size(min=1, max=1)
	private String hierarchicalChildCode;

		
	
	public String getHierarchicalIDNumber() {
		return hierarchicalIDNumber;
	}

	public void setHierarchicalIDNumber(String hierarchicalIDNumber) {
		this.hierarchicalIDNumber = hierarchicalIDNumber;
	}

	public String getHierarchicalParentIDNumber() {
		return hierarchicalParentIDNumber;
	}

	public void setHierarchicalParentIDNumber(String hierarchicalParentIDNumber) {
		this.hierarchicalParentIDNumber = hierarchicalParentIDNumber;
	}

	public String getHierarchicalLevelCode() {
		return hierarchicalLevelCode;
	}

	public void setHierarchicalLevelCode(String hierarchicalLevelCode) {
		this.hierarchicalLevelCode = hierarchicalLevelCode;
	}

	
}
