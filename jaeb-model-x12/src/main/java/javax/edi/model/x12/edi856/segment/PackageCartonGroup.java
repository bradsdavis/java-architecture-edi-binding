package javax.edi.model.x12.edi856.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.HierarchicalLevel;
import javax.edi.model.x12.segment.MarksAndNumbers;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class PackageCartonGroup {

	@NotNull
	private HierarchicalLevel packageCartonHeader;
	private MarksAndNumbers cartonSSCCCode;
	private MarksAndNumbers carrierTrackingNumber;

	public HierarchicalLevel getPackageCartonHeader() {
		return packageCartonHeader;
	}
	public void setPackageCartonHeader(HierarchicalLevel packageCartonHeader) {
		this.packageCartonHeader = packageCartonHeader;
	}
	public MarksAndNumbers getCartonSSCCCode() {
		return cartonSSCCCode;
	}
	public void setCartonSSCCCode(MarksAndNumbers cartonSSCCCode) {
		this.cartonSSCCCode = cartonSSCCCode;
	}
	public MarksAndNumbers getCarrierTrackingNumber() {
		return carrierTrackingNumber;
	}
	public void setCarrierTrackingNumber(MarksAndNumbers carrierTrackingNumber) {
		this.carrierTrackingNumber = carrierTrackingNumber;
	}
	
	
}
