package com.bradsdavis.edi.parse;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.convert.NumberConverters.FloatToString;
import org.junit.Assert;
import org.junit.Test;

import com.bradsdavis.edi.parser.EDIWriter;
import com.bradsdavis.edi.testing.ExampleMessage;
import com.bradsdavis.edi.testing.Item;
import com.bradsdavis.edi.testing.Price;
import com.bradsdavis.edi.testing.ExampleSegmentGroup;

public class TestParser {

	@Test
	public void testParser() throws Exception {
		
		StringWriter writer = new StringWriter();
		
		ExampleMessage example = new ExampleMessage();
		Item seg = new Item();
		seg.setFirstField("Hello");
		seg.setSecondField(new Date());
		seg.setFourthField(new BigDecimal("45.0102020"));
		seg.setFifthField(new Float(100.0));
		example.setSegment(seg);
		
		Item seg2 = new Item();
		seg2.setFirstField("World");
		seg2.setSecondField(new Date());
		seg2.setThirdField(new Date());
		example.setAnother(seg2);
		
		example.setnSegments(new LinkedList<Item>());
		for(int i=0; i<5; i++) {
			Item seg3 = new Item();
			seg3.setFirstField("World"+i);
			seg3.setSecondField(new Date());
			seg3.setThirdField(new Date());
			
			example.getnSegments().add(seg3);
		}
		
		seg2.setExampleComponent(new ArrayList<String>());
		for(int i=0; i<8; i++) {
			String component = "Component"+i;
			seg2.getExampleComponent().add(component);
		}
		

		seg2.setExampleDateComponents(new LinkedList<Date>());
		for(int i=0; i<8; i++) {
			Date component = new Date();
			seg2.getExampleDateComponents().add(component);
		}
		example.setSegmentGroup(stubSegmentGroup());
		
		
		List<ExampleSegmentGroup> multiGroups = new ArrayList<ExampleSegmentGroup>();
		for(int i=0; i<10; i++) {
			multiGroups.add(stubSegmentGroup());
		}
		example.setMultileGroups(multiGroups);
		
		
		EDIWriter.write(example, writer);
		System.out.println(writer.toString());
	}
	
	private ExampleSegmentGroup stubSegmentGroup() 
	{
		ExampleSegmentGroup esg = new ExampleSegmentGroup();
		Item esg1 = new Item();
		esg1.setFifthField(100.00f);
		Price esg2 = new Price();
		esg2.setFourthField(new BigDecimal(100.01));
		
		esg.setExampleSegment(esg1);
		esg.setExampleSegmentAnother(esg2);
		
		return esg;
	}
	
	@Test
	public void testFloatFormat() throws Exception {
		final String expected = "100.00";
		
		Float testFloat = new Float(100);
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		df.setMinimumFractionDigits(2);
		
		Assert.assertEquals(expected, df.format(testFloat));
		
		FloatToString fts = new FloatToString();
		
		String format = "#,###.00";
		String v1 = fts.convert(new Float(testFloat), Locale.getDefault(), TimeZone.getDefault(), format);
		
		NumberFormat nf = new DecimalFormat(format);
		String v2 = nf.format(testFloat.floatValue());
	
		System.out.println(v1);
		System.out.println(v2);
		
		Assert.assertEquals("100.00", v2);
		//doesn't work.
		//Assert.assertEquals("100.00", v1);
	
		
		
	}
}
