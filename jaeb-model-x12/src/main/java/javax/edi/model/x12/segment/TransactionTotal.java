package javax.edi.model.x12.segment;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.Size;

@EDISegment(tag="CTT")
public class TransactionTotal {

	@EDIElement(fieldName="CTT01", dataElement="354")
	private BigInteger numberOfLineItems;

	@EDIElement(fieldName="CTT02", dataElement="347")
	@Size(min=1, max=10)
	private BigInteger hashTotal;


	@EDIElement(fieldName="CTT03", dataElement="81")
	@Size(min=1, max=10)
	@EDIElementFormat("####.##")
	private BigDecimal weight;


	@EDIElement(fieldName="CTT04", dataElement="355")
	@Size(min=2, max=2)
	private String weightUnitOfMeasure;


	@EDIElement(fieldName="CTT05", dataElement="183")
	@Size(min=1, max=8)
	@EDIElementFormat("####.##")
	private BigDecimal volume;


	@EDIElement(fieldName="CTT06", dataElement="355")
	@Size(min=2, max=2)
	private String volumeUnitOfMeasure;


	@EDIElement(fieldName="CTT07", dataElement="352")
	@Size(min=1, max=80)
	private String description;


	public BigInteger getNumberOfLineItems() {
		return numberOfLineItems;
	}


	public void setNumberOfLineItems(BigInteger numberOfLineItems) {
		this.numberOfLineItems = numberOfLineItems;
	}


	public BigInteger getHashTotal() {
		return hashTotal;
	}


	public void setHashTotal(BigInteger hashTotal) {
		this.hashTotal = hashTotal;
	}


	public BigDecimal getWeight() {
		return weight;
	}


	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}


	public String getWeightUnitOfMeasure() {
		return weightUnitOfMeasure;
	}


	public void setWeightUnitOfMeasure(String weightUnitOfMeasure) {
		this.weightUnitOfMeasure = weightUnitOfMeasure;
	}


	public BigDecimal getVolume() {
		return volume;
	}


	public void setVolume(BigDecimal volume) {
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
