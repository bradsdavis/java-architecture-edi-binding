package javax.edi.model.x12.edi850.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;

@EDISegment(tag="CTT")
public class TransactionSetTotals {

	@Size(min = 1, max = 6)
	@EDIElement(fieldName="CTT01",dataElement="354")
	private String numberOfLineItems; // Total number of line items (PO1 segments)

	@Size(min = 1, max = 10)
	@EDIElement(fieldName="CTT02",dataElement="347")
	private String hashTotal; // Number of items ordered (total of PO102 element(s))
	
	@Size(min = 1, max = 10)
	@EDIElement(fieldName="CTT03",dataElement="81")
	private String weight; // 
	
	@Size(min = 2, max = 2)
	@EDIElement(fieldName="CTT04",dataElement="355",conditional=true)
	private String weightUnitOfMeasure; // 
	
	@Size(min = 1, max = 8)
	@EDIElement(fieldName="CTT05",dataElement="183")
	private String volume; // 
	
	@Size(min = 2, max = 2)
	@EDIElement(fieldName="CTT06",dataElement="355",conditional=true)
	private String volumeUnitOfMeasure; // 
	
	@Size(min = 1, max = 80)
	@EDIElement(fieldName="CTT07",dataElement="352")
	private String description; //

	public String getNumberOfLineItems() {
		return numberOfLineItems;
	}

	public void setNumberOfLineItems(String numberOfLineItems) {
		this.numberOfLineItems = numberOfLineItems;
	}

	public String getHashTotal() {
		return hashTotal;
	}

	public void setHashTotal(String hashTotal) {
		this.hashTotal = hashTotal;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getWeightUnitOfMeasure() {
		return weightUnitOfMeasure;
	}

	public void setWeightUnitOfMeasure(String weightUnitOfMeasure) {
		this.weightUnitOfMeasure = weightUnitOfMeasure;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getVolumeUnitOfMeasure() {
		return volumeUnitOfMeasure;
	}

	public void setVolumeUnitOfMeasure(String volumeUnitOfMeasure) {
		this.volumeUnitOfMeasure = volumeUnitOfMeasure;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
