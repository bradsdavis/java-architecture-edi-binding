package javax.edi.bind.test;

import java.io.StringReader;
import java.io.StringWriter;

import javax.edi.bind.EDIMarshaller;
import javax.edi.bind.EDIUnmarshaller;
import javax.edi.bind.test.beans.ExampleMessage;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestEDIUnmarshaller extends EDITestBase {
	private static final Logger LOG = LoggerFactory.getLogger(TestEDIUnmarshaller.class);
	
	@Test
	public void testReader() throws Exception {
		StringWriter sw = new StringWriter();
		EDIMarshaller.marshal(exampleMessage, sw);
		
		ExampleMessage message = EDIUnmarshaller.unmarshal(ExampleMessage.class, new StringReader(sw.toString()));
		
		LOG.debug(exampleMessage.toString());
		LOG.debug(message.toString());
		
		StringWriter resultMain = new StringWriter();
		EDIMarshaller.marshal(exampleMessage, resultMain);
		
		StringWriter resultNew = new StringWriter();
		EDIMarshaller.marshal(exampleMessage, resultNew);
		
		LOG.debug(resultMain.toString());
		LOG.debug(resultNew.toString());
		
		Assert.assertTrue(resultMain.toString().equals(resultNew.toString()));
	}
}
