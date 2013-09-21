package com.bradsdavis.edi.parse;

import java.io.StringWriter;

import javax.edi.bind.parser.EDIMarshaller;

import org.junit.Test;

public class TestWriter extends EDITestBase {

	@Test
	public void testParser() throws Exception {
		StringWriter sw = new StringWriter();
		EDIMarshaller.write(exampleMessage, sw);
		System.out.println(sw.toString());
	}
	
}
