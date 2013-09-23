package javax.edi.model.x12.edi832.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.ItemIdentification;
import javax.edi.model.x12.segment.ItemPhysicalDetail;
import javax.edi.model.x12.segment.Measurement;
import javax.edi.model.x12.segment.Name;
import javax.edi.model.x12.segment.PriceListReference;
import javax.edi.model.x12.segment.PricingInformation;
import javax.edi.model.x12.segment.ProductItemDescription;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.edi.model.x12.segment.SubLineItemDetail;
import javax.edi.model.x12.segment.YesNoQuestion;

@EDISegmentGroup
public class ItemPricingGroup {

	private ItemIdentification itemIdentification;
	private YesNoQuestion yesNoQuestion;
	private ProductItemDescription productItemDescrition;
	private Measurement measurement;
	
	//TODO: this doesn't match standard.
	private ItemPhysicalDetail itemPhysicalDetails;
	
	@EDICollectionType(PricingInformation.class)
	private Collection<PricingInformation> pricingInformation;
	
	private PriceListReference priceListReference;
	
	private ReferenceNumber referenceNumber;
	
	private Name name;
	private SubLineItemDetail subLineItemDetail;
	
	
	public ItemIdentification getItemIdentification() {
		return itemIdentification;
	}
	public void setItemIdentification(ItemIdentification itemIdentification) {
		this.itemIdentification = itemIdentification;
	}
	public YesNoQuestion getYesNoQuestion() {
		return yesNoQuestion;
	}
	public void setYesNoQuestion(YesNoQuestion yesNoQuestion) {
		this.yesNoQuestion = yesNoQuestion;
	}
	public ProductItemDescription getProductItemDescrition() {
		return productItemDescrition;
	}
	public void setProductItemDescrition(
			ProductItemDescription productItemDescrition) {
		this.productItemDescrition = productItemDescrition;
	}
	public Measurement getMeasurement() {
		return measurement;
	}
	public void setMeasurement(Measurement measurement) {
		this.measurement = measurement;
	}
	public Collection<PricingInformation> getPricingInformation() {
		return pricingInformation;
	}
	public void setPricingInformation(
			Collection<PricingInformation> pricingInformation) {
		this.pricingInformation = pricingInformation;
	}
	public PriceListReference getPriceListReference() {
		return priceListReference;
	}
	public void setPriceListReference(PriceListReference priceListReference) {
		this.priceListReference = priceListReference;
	}
	public ItemPhysicalDetail getItemPhysicalDetails() {
		return itemPhysicalDetails;
	}
	public void setItemPhysicalDetails(ItemPhysicalDetail itemPhysicalDetails) {
		this.itemPhysicalDetails = itemPhysicalDetails;
	}
	public ReferenceNumber getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(ReferenceNumber referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public SubLineItemDetail getSubLineItemDetail() {
		return subLineItemDetail;
	}
	public void setSubLineItemDetail(SubLineItemDetail subLineItemDetail) {
		this.subLineItemDetail = subLineItemDetail;
	}
	
	
}
