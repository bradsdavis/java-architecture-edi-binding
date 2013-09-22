package javax.edi.model.x12.edi850.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;

@EDISegment(tag="CTT")
public class TransactionSetTotals {

	@Size(min = 1, max = 6)
	@EDIElement
	private String numberOfLineItems; // Total number of line items (PO1 segments)

	@Size(min = 1, max = 10)
	@EDIElement
	private String hashTotal; // Number of items ordered (total of PO102 element(s))
	
	@Size(min = 1, max = 10)
	@EDIElement
	private String weight; // 
	
	@Size(min = 2, max = 2)
	@EDIElement
	//@Conditional
	private String weightUnitOfMeasure; // 
	
	@Size(min = 1, max = 8)
	@EDIElement
	private String volume; // 
	
	@Size(min = 2, max = 2)
	@EDIElement
	//@Conditional
	private String volumeUnitOfMeasure; // 
	
	@Size(min = 1, max = 80)
	@EDIElement
	private String description; //
	
}
