package javax.edi.model.x12.edi810;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDIMessage;
import javax.edi.model.x12.edi810.segment.Detail;
import javax.edi.model.x12.edi810.segment.Header;
import javax.edi.model.x12.edi810.segment.Trailer;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;


@EDIMessage
public class Invoice {

	@NotNull
	private Header header;
	
	@EDICollectionType(Detail.class)
	@Min(1) @Max(200000)
	private Collection<Detail> detail;
	
	@NotNull
	private Trailer trailer;

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public Collection<Detail> getDetail() {
		return detail;
	}

	public void setDetail(Collection<Detail> detail) {
		this.detail = detail;
	}

	public Trailer getTrailer() {
		return trailer;
	}

	public void setTrailer(Trailer trailer) {
		this.trailer = trailer;
	}
	
}
