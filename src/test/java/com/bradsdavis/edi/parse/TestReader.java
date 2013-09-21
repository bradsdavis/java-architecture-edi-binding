package com.bradsdavis.edi.parse;

import java.io.StringReader;
import java.io.StringWriter;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
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
		
		LOG.debug("Result: ");
		LOG.debug(ReflectionToStringBuilder.toString(message));
	}
}
