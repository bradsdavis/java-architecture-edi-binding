package com.bradsdavis.edi.parse;

import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bradsdavis.edi.parser.EDIReader;
import com.bradsdavis.edi.parser.EDIWriter;
import com.bradsdavis.edi.testing.ExampleMessage;

public class TestReader extends EDITestBase {
	private static final Logger LOG = LoggerFactory.getLogger(TestReader.class);
	
	@Test
	public void testReader() throws Exception {
		StringWriter sw = new StringWriter();
		EDIWriter.write(exampleMessage, sw);
		
		ExampleMessage message = EDIReader.read(ExampleMessage.class, new StringReader(sw.toString()));
		
		LOG.debug(exampleMessage.toString());
		LOG.debug(message.toString());
		
		StringWriter resultMain = new StringWriter();
		EDIWriter.write(exampleMessage, resultMain);
		
		StringWriter resultNew = new StringWriter();
		EDIWriter.write(exampleMessage, resultNew);
		
		LOG.debug(resultMain.toString());
		LOG.debug(resultNew.toString());
		
		Assert.assertTrue(resultMain.toString().equals(resultNew.toString()));
	}
}
