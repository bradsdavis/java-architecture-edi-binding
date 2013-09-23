package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag="HL")
public class HierarchicalLevel {

	@EDIElement(fieldName="HL01")
	private String hierarchicalIDNumber;

	@EDIElement(fieldName="HL02")
	private String hierarchicalParentIDNumber;

	@EDIElement(fieldName="HL03")
	private String hierarchicalLevelCode;

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
