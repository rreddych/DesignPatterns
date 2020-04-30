package com.rajeshchinta.templatemethodinjavaarrays;

import java.util.Arrays;

import org.junit.Test;

public class TestHarness {
	
	@Test
	public void testDucksort() {
		
		Duck[] ducks = {
				new Duck("Mallar Duck", 1000),
				new Duck("Decoy Duck", 500),
				new Duck("Steel Duck", 2000),
				new Duck("Rubber Duck", 800)
				
		};
		
		this.display(ducks);
		//Arrays.sort implements a little variant of template method pattern nevertheless
		// the spirit of the template method is present
		Arrays.sort(ducks);
		System.out.println("-------------After Sort -------------");
		this.display(ducks);
		
	}
	
	private void display(Duck[] ducks) {
		for (Duck duck : ducks) {
			System.out.println(duck);
		}
	}

}
