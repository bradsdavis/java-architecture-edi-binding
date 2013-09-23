package javax.edi.model.x12.segment;

import java.util.Date;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="DTM")
public class DateTimeReference {

	@EDIElement(fieldName="DTM01", dataElement="374")
	@NotNull
	@Size(min=0, max=3)
	private String dateTimeQualifier;
	
	@EDIElement(fieldName="DTM02", dataElement="373")
	@EDIElementFormat("yyyyMMdd")
	private Date date;
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getDateTimeQualifier() {
		return dateTimeQualifier;
	}
	
	public void setDateTimeQualifier(String dateTimeQualifier) {
		this.dateTimeQualifier = dateTimeQualifier;
	}
}
