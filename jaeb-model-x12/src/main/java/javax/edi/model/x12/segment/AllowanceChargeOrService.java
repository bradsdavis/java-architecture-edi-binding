package javax.edi.model.x12.segment;

import java.math.BigDecimal;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="SAC")
public class AllowanceChargeOrService {

	@EDIElement(fieldName="SAC01", dataElement="248")
	@NotNull
	@Size(min=1, max=1)
	private String allowanceChargeIndicator;
	
	@EDIElement(fieldName="SAC02", dataElement="1300")
	@NotNull
	@Size(min=4, max=4)
	private String specialChargeOrAllowanceCode;
	
	@EDIElementFormat("####.##")
	@EDIElement(fieldName="SAC05", dataElement="610")
	private BigDecimal allowanceOrChargeTotalAmount;
	
	@EDIElement(fieldName="SAC12", dataElement="331")
	@Size(min=2, max=2)
	private String methodOfHandlingCode;

	public String getAllowanceChargeIndicator() {
		return allowanceChargeIndicator;
	}

	public void setAllowanceChargeIndicator(String allowanceChargeIndicator) {
		this.allowanceChargeIndicator = allowanceChargeIndicator;
	}

	public String getSpecialChargeOrAllowanceCode() {
		return specialChargeOrAllowanceCode;
	}

	public void setSpecialChargeOrAllowanceCode(String specialChargeOrAllowanceCode) {
		this.specialChargeOrAllowanceCode = specialChargeOrAllowanceCode;
	}

	public BigDecimal getAllowanceOrChargeTotalAmount() {
		return allowanceOrChargeTotalAmount;
	}

	public void setAllowanceOrChargeTotalAmount(
			BigDecimal allowanceOrChargeTotalAmount) {
		this.allowanceOrChargeTotalAmount = allowanceOrChargeTotalAmount;
	}

	public String getMethodOfHandlingCode() {
		return methodOfHandlingCode;
	}

	public void setMethodOfHandlingCode(String methodOfHandlingCode) {
		this.methodOfHandlingCode = methodOfHandlingCode;
	}


}
