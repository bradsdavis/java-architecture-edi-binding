package com.bradsdavis.edi.parse;

import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Test;

import com.bradsdavis.edi.parser.EDIReader;
import com.bradsdavis.edi.parser.EDIWriter;
import com.bradsdavis.edi.testing.ExampleMessage;

public class TestReader extends EDITestBase {

	@Test
	public void testReader() throws Exception {
		StringWriter sw = new StringWriter();
		EDIWriter.write(exampleMessage, sw);
		EDIReader.read(ExampleMessage.class, new StringReader(sw.toString()));
	}
}
