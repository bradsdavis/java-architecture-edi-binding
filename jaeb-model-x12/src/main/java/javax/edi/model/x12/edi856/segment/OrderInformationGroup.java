package javax.edi.model.x12.edi856.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.HierarchicalLevel;
import javax.edi.model.x12.segment.PurchaseOrderReference;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class OrderInformationGroup {

	@NotNull
	private HierarchicalLevel purchaseOrderReferenceHeader;
	private PurchaseOrderReference purchaseOrderReference;
	
	private Collection<PackageCartonGroup> packageCartonGroup;

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

	public Collection<PackageCartonGroup> getPackageCartonGroup() {
		return packageCartonGroup;
	}

	public void setPackageCartonGroup(
			Collection<PackageCartonGroup> packageCartonGroup) {
		this.packageCartonGroup = packageCartonGroup;
	}
	
	
}
