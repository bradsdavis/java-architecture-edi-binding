package javax.edi.model.x12.edi846.segment;

import javax.edi.bind.annotations.EDISegmentGroup;

@EDISegmentGroup
public class InventoryInqueryBody {

	private Header header;
	private Detail detail;
	private Trailer trailer;
	
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
	public Trailer getTrailer() {
		return trailer;
	}
	public void setTrailer(Trailer trailer) {
		this.trailer = trailer;
	}
	
	
}
