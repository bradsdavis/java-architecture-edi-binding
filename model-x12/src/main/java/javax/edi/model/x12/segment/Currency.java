package javax.edi.model.x12.segment;

import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDISegment;

@EDISegment(tag="CUR")
public class Currency {

	@Size(min=2, max=2)
	private String entityIdentifierCode;
	private String currencyCode;
	public String getEntityIdentifierCode() {
		return entityIdentifierCode;
	}
	public void setEntityIdentifierCode(String entityIdentifierCode) {
		this.entityIdentifierCode = entityIdentifierCode;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	
}
