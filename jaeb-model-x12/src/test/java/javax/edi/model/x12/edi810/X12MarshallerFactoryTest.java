package javax.edi.model.x12.edi810;

import java.io.InputStreamReader;

import javax.edi.bind.EDIUnmarshaller;
import javax.edi.bind.util.ReflectiveToStringStyle;
import javax.edi.model.x12.X12MarshallerFactory;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class X12MarshallerFactoryTest {

	private static final Logger LOG = LoggerFactory.getLogger(X12MarshallerFactoryTest.class);
	
	
	
	public void testX12MarshallerFactory() throws Exception {
		InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("edi-test1.txt"));
		X12MarshallerFactory.EDIMarshaller(isr);
		
	}
	

	@Test
	public void testReadEDI810() throws Exception {
		InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("edi-test1.txt"));
		Invoice invoice = EDIUnmarshaller.unmarshal(Invoice.class, isr);
		
		LOG.debug(ReflectionToStringBuilder.toString(invoice, new ReflectiveToStringStyle()));
	}
}
