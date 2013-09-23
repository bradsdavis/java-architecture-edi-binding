package javax.edi.model.x12.segment;

import java.util.Date;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="G36")
public class PriceListReference {

	@EDIElement(fieldName="G3601", dataElement="439")
	@NotNull
	@Size(min=1, max=3)
	private String priceListNumber;

	@Size(min=1, max=16)
	private String priceListIssueNumber;
	
	@EDIElement(fieldName="G3603", dataElement="373")
	private Date priceListDate;
	
}
