package javax.edi.bind.test;

import java.io.StringWriter;

import javax.edi.bind.EDIMarshaller;

import org.junit.Test;

public class TestEDIMarshaller extends EDITestBase {

	@Test
	public void testParser() throws Exception {
		StringWriter sw = new StringWriter();
		EDIMarshaller.write(exampleMessage, sw);
		System.out.println(sw.toString());
	}
	
}
