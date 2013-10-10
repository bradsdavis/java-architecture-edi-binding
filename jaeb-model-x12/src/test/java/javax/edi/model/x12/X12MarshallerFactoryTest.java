package javax.edi.model.x12;

import java.io.InputStreamReader;
import java.io.StringWriter;

import javax.edi.bind.EDIMarshaller;
import javax.edi.bind.EDIUnmarshaller;
import javax.edi.bind.util.ReflectiveToStringStyle;
import javax.edi.model.x12.X12MarshallerFactory;
import javax.edi.model.x12.edi810.Invoice;
import javax.edi.model.x12.edi832.PriceSalesCatalog;
import javax.edi.model.x12.edi846.InventoryInquery;
import javax.edi.model.x12.edi855.POAcknowledgement;
import javax.edi.model.x12.edi856.AdvanceShipmentNotice;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class X12MarshallerFactoryTest {

	private static final Logger LOG = LoggerFactory.getLogger(X12MarshallerFactoryTest.class);
	
	
	
	public void testX12MarshallerFactory() throws Exception {
		InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("x8104010.txt"));
		X12MarshallerFactory.EDIMarshaller(isr);
	}
	
	@Ignore
	@Test
	public void testReadEDI810() throws Exception {
		InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("x8104010.txt"));
		Invoice edi= EDIUnmarshaller.unmarshal(Invoice.class, isr);
		
		LOG.debug(ReflectionToStringBuilder.toString(edi , new ReflectiveToStringStyle()));
		
		StringWriter sw = new StringWriter();
		EDIMarshaller.marshal(edi, sw);
		
		LOG.debug("Marshalled: "+sw.toString());
	}

	@Ignore
	@Test
	public void testReadEDI832() throws Exception {
		InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("x8324010.txt"));
		PriceSalesCatalog edi= EDIUnmarshaller.unmarshal(PriceSalesCatalog.class, isr);
		
		LOG.debug(ReflectionToStringBuilder.toString(edi , new ReflectiveToStringStyle()));
		
		
		StringWriter sw = new StringWriter();
		EDIMarshaller.marshal(edi, sw);
		
		LOG.debug("Marshalled: "+sw.toString());
	}
	
	
	@Test
	public void testReadEDI846() throws Exception {
		InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("x8464010.txt"));
		InventoryInquery edi= EDIUnmarshaller.unmarshal(InventoryInquery.class, isr);
		
		LOG.debug(ReflectionToStringBuilder.toString(edi, new ReflectiveToStringStyle()));

		StringWriter sw = new StringWriter();
		EDIMarshaller.marshal(edi, sw);
		
		LOG.debug("Marshalled: "+sw.toString());
	}
	
	@Ignore
	@Test
	public void testReadEDI855() throws Exception {
		InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("x8554010.txt"));
		POAcknowledgement edi= EDIUnmarshaller.unmarshal(POAcknowledgement.class, isr);
		
		LOG.debug(ReflectionToStringBuilder.toString(edi, new ReflectiveToStringStyle()));

		StringWriter sw = new StringWriter();
		EDIMarshaller.marshal(edi, sw);
		
		LOG.debug("Marshalled: "+sw.toString());
	}
	


	@Ignore
	@Test
	public void testReadEDI856() throws Exception {
		InputStreamReader isr = new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("x8564010.txt"));
		AdvanceShipmentNotice edi = EDIUnmarshaller.unmarshal(AdvanceShipmentNotice.class, isr);
		
		LOG.debug(ReflectionToStringBuilder.toString(edi, new ReflectiveToStringStyle()));

		StringWriter sw = new StringWriter();
		EDIMarshaller.marshal(edi, sw);
		
		LOG.debug("Marshalled: "+sw.toString());
 	}
}
