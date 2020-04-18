package com.rajeshchinta.singletonmethod;

import org.junit.Test;

import com.rajeshchinta.singletonpattern.ChocolateBoiler;

public class TestHarness {
	
	@Test
	public void testChocolateBoiler() {
		ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
		chocolateBoiler.fill();
		chocolateBoiler.boil();
		chocolateBoiler.drain();
	}

}
