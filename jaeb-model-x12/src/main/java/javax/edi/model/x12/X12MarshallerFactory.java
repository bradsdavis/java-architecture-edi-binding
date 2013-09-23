package javax.edi.model.x12;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import javax.edi.bind.util.SegmentIterator;
import javax.edi.model.x12.edi810.Invoice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class X12MarshallerFactory {

	private static final Logger LOG = LoggerFactory.getLogger(X12MarshallerFactory.class);
	
	static {
		Map<String, Class> clz = new HashMap<String, Class>();
		clz.put("INV", Invoice.class);
	}
	
	
	private X12MarshallerFactory() {
		//seal
	}
	
	
	public static Class EDIMarshaller(Reader reader) throws IOException {
		//read the header; for x12, segment delimiter should be at character 106. 
		int position = 0;
		int current = Character.UNASSIGNED;
		
		char[] buffer = new char[106];
		PushbackReader pushbackReader = new PushbackReader(reader, 106);
		try {
			while((current = pushbackReader.read()) != -1) {
				buffer[position] = (char)current;
				position++;
				
				if(position == 106) {
					break;
				}
			}
		} catch (IOException e) {
			throw new IOException("Exception reading from stream.", e);
		}
		
		if(current != Character.UNASSIGNED) {
			//read the 106th character to char
			//reset the reader.
			pushbackReader.unread(buffer);
			
			//now, use the Segment Reader to read the GS header.
			SegmentIterator sar = new SegmentIterator(pushbackReader, buffer[105], true);
			while(sar.hasNext()) {
				String segment = sar.next();
				LOG.debug("Segment: "+segment);
			}
		}
		
		return null;
		
		
		
	}
	
	
}
