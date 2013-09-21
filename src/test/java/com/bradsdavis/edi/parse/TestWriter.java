package com.bradsdavis.edi.parse;

import java.io.StringWriter;

import org.junit.Test;

import com.bradsdavis.edi.parser.EDIWriter;

public class TestWriter extends EDITestBase {

	@Test
	public void testParser() throws Exception {
		StringWriter sw = new StringWriter();
		EDIWriter.write(exampleMessage, sw);
		System.out.println(sw.toString());
	}
	
}
