package javax.edi.model.x12.edi810.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@EDISegmentGroup
public class NameReferenceNumber {
	
	private Name name;
	
	@Min(0) @Max(12)
	private Collection<ReferenceNumber> referenceNumbers;

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Collection<ReferenceNumber> getReferenceNumbers() {
		return referenceNumbers;
	}

	public void setReferenceNumbers(Collection<ReferenceNumber> referenceNumbers) {
		this.referenceNumbers = referenceNumbers;
	}
}
