package javax.edi.model.x12.edi856.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.HierarchicalLevel;
import javax.edi.model.x12.segment.PurchaseOrderReference;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class OrderInformationGroup {

	@NotNull
	private HierarchicalLevel purchaseOrderReferenceHeader;
	private PurchaseOrderReference purchaseOrderReference;
	
	@NotNull
	@Size(min=1)
	@EDICollectionType(ReferenceNumber.class)
	private Collection<ReferenceNumber> referenceNumbers;
	

	@NotNull
	@EDICollectionType(ItemLevelInformationGroup.class)
	private Collection<ItemLevelInformationGroup> itemLevelInformationGroup; 

	public Collection<ItemLevelInformationGroup> getItemLevelInformationGroup() {
		return itemLevelInformationGroup;
	}
	
	public void setItemLevelInformationGroup(
			Collection<ItemLevelInformationGroup> itemLevelInformationGroup) {
		this.itemLevelInformationGroup = itemLevelInformationGroup;
	}
	
	@EDICollectionType(PackageCartonGroup.class)
	private Collection<PackageCartonGroup> packageCartonGroup;

	public Collection<PackageCartonGroup> getPackageCartonGroup() {
		return packageCartonGroup;
	}
	
	public void setPackageCartonGroup(
			Collection<PackageCartonGroup> packageCartonGroup) {
		this.packageCartonGroup = packageCartonGroup;
	}
	
	public HierarchicalLevel getPurchaseOrderReferenceHeader() {
		return purchaseOrderReferenceHeader;
	}

	public void setPurchaseOrderReferenceHeader(
			HierarchicalLevel purchaseOrderReferenceHeader) {
		this.purchaseOrderReferenceHeader = purchaseOrderReferenceHeader;
	}

	public PurchaseOrderReference getPurchaseOrderReference() {
		return purchaseOrderReference;
	}

	public void setPurchaseOrderReference(
			PurchaseOrderReference purchaseOrderReference) {
		this.purchaseOrderReference = purchaseOrderReference;
	}
	
}
