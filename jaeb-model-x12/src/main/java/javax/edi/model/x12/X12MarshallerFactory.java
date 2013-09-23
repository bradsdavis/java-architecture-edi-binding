package javax.edi.model.x12;

import java.io.PushbackReader;

import javax.edi.bind.EDIMarshaller;

import org.apache.commons.io.IOUtils;

public class X12MarshallerFactory {

	private X12MarshallerFactory() {
		//seal
	}
	
	public static EDIMarshaller(Reader reader) {
		//have to use a pushback reader to be safe.

		PushbackReader pushbackReader = new PushbackReader(reader);
		IOUtils.read
		
	}
}
