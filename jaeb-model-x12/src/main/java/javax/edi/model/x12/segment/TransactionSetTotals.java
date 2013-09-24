package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="CTT")
public class TransactionSetTotals {

	@EDIElement(fieldName="CTT01", dataElement="354")
	@NotNull
	@Size(min=0,max=100000)
	private Integer numberofLineItems;
	
	@EDIElement(fieldName="CTT02",dataElement="347")
	@Size(min = 1, max = 10)
	private String hashTotal; // Number of items ordered (total of PO102 element(s))
	
	@EDIElement(fieldName="CTT03",dataElement="81")
	@Size(min = 1, max = 10)
	private String weight; 
	
	@EDIElement(fieldName="CTT04",dataElement="355",conditional=true)
	@Size(min = 2, max = 2)
	private String weightUnitOfMeasure;
	
	@EDIElement(fieldName="CTT05",dataElement="183")
	@Size(min = 1, max = 8)
	private String volume; 
	
	@EDIElement(fieldName="CTT06",dataElement="355",conditional=true)
	@Size(min = 2, max = 2)
	private String volumeUnitOfMeasure; 
	
	@EDIElement(fieldName="CTT07",dataElement="352")
	@Size(min = 1, max = 80)
	private String description;

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

	public Integer getNumberofLineItems() {
		return numberofLineItems;
	}
	
	public void setNumberofLineItems(Integer numberofLineItems) {
		this.numberofLineItems = numberofLineItems;
	}
}
