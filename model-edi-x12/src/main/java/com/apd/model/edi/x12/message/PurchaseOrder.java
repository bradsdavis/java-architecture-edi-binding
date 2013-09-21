package com.apd.model.edi.x12.message;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import javax.edi.bind.annotations.EDIMessage;

import com.apd.model.edi.x12.segment.Detail;
import com.apd.model.edi.x12.segment.GroupEnvelope;
import com.apd.model.edi.x12.segment.PurchaseOrderHeader;
import com.apd.model.edi.x12.segment.InterchangeEnvelope;
import com.apd.model.edi.x12.segment.Summary;

@EDIMessage(segmentDelimiter="~",componentDelimiter=">",elementDelimiter="*")
public class PurchaseOrder {

	@NotNull
	private InterchangeEnvelope interchangeEnvelope;
	
	@NotNull
	private GroupEnvelope groupEnvelope;
	
	@NotNull
	@Size(min = 1, max = 1)
	private PurchaseOrderHeader heading;
	
	@NotNull
	@Size(min = 1, max = 1)
	private Detail detail;
	
	@NotNull
	@Size(min = 1, max = 1)
	private Summary summary;
	
	
}
