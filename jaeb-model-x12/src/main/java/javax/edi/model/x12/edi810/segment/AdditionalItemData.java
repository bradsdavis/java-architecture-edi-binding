package javax.edi.model.x12.edi810.segment;

import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@EDISegment(tag="IT3")
public class AdditionalItemData {

	@Min(1) @Max(9)
	private String quantityDifference;
}
