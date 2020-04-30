package com.rajeshchinta.templatemethodpattern;

import java.io.IOException;

import org.junit.Test;

public class TestHarness {

	@Test
	public void testCofeeWithOutHook() throws IOException {
		CaffeineBeverage beverage;
		beverage = new Coffee();
		beverage.prepareReciepe();
	}
	
	@Test
	public void testTeaWithHook() throws IOException {
		CaffeineBeverage beverage;
		beverage  = new Tea();
		beverage.prepareReciepe();
	}
}
