package javax.edi.model.x12.edi855.segment;

import javax.edi.bind.annotations.EDISegmentGroup;

@EDISegmentGroup
public class POAcknowledgementBody {

	private Header header;
	private Detail detail;
	private Trailer footer;
	
	public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public Detail getDetail() {
		return detail;
	}
	public void setDetail(Detail detail) {
		this.detail = detail;
	}
	public Trailer getFooter() {
		return footer;
	}
	public void setFooter(Trailer footer) {
		this.footer = footer;
	}
}
