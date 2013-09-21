package javax.edi.bind.test;

import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.edi.bind.test.beans.ExampleMessage;
import javax.edi.bind.test.beans.ExampleSegmentGroup;
import javax.edi.bind.test.beans.Item;
import javax.edi.bind.test.beans.Price;

import org.junit.BeforeClass;

public abstract class EDITestBase {
	
	protected static ExampleMessage exampleMessage;
	
	@BeforeClass
	public static void createTestObject() 
	{
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
		
		exampleMessage = example;
	}
	
	private static ExampleSegmentGroup stubSegmentGroup() 
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
}
