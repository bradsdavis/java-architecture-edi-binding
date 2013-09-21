package javax.edi.model.x12.edi810;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDIMessage;
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
	
}
