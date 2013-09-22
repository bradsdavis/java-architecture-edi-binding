package javax.edi.model.x12.edi810.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@EDISegment(tag="CUR")
public class Currency {

	@EDIElement(fieldName="CUR01", dataElement="98")
	@NotNull
	@Size(min=2, max=3)
	private String entityIdentifierCode;
	
	@EDIElement(fieldName="CUR02", dataElement="100")
	@NotNull
	@Size(min=3, max=3)
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
