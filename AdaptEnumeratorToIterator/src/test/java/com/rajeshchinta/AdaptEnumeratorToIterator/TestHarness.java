package com.rajeshchinta.AdaptEnumeratorToIterator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Enumeration;
import java.util.Vector;

import org.junit.Test;

public class TestHarness {
	
	@Test
	public void testEnumerationIteratorAdapter() {
		Enumeration<String> days = null;
		Vector<String> dayNames = new Vector<String>();
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
	    dayNames.add("Thursday");
	    dayNames.add("Friday");
	    dayNames.add("Saturday");
	    
	    days = dayNames.elements();
	    
		/*
		 * assertTrue(days.hasMoreElements()); assertNotNull(days.nextElement());
		 * 
		 * while(days.hasMoreElements()) { System.out.println(days.nextElement()); }
		 */
	    
	    EnumerationIteratorAdapter daysInWeek = new EnumerationIteratorAdapter(days);
	    
	    
	    assertTrue(daysInWeek.hasNext());
	    assertNotNull(daysInWeek.next());
	    
	    System.out.println("----------------------");
	    while(daysInWeek.hasNext()) {
	    	System.out.println(daysInWeek.next());
	    }
	    
	}
		
		
}
