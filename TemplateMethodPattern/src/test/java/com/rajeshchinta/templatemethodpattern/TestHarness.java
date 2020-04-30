package com.rajeshchinta.templatemethodpattern;

import java.io.IOException;

import org.junit.Test;

public class TestHarness {

	@Test
	public void testCofeeAndTeaWithOutHook() throws IOException {
		CaffeineBeverage beverage;
		beverage = new CoffeeWithOutHook();
		beverage.prepareReciepe();
		System.out.println("------------------");
		beverage = new TeaWithOutHook();
		beverage.prepareReciepe();
	}
	
	@Test
	public void testCofeeAndTeaWithHooks() throws IOException {
		CaffeineBeverage beverage;
		beverage = new CoffeeWithHook();
		beverage.prepareReciepe();
		System.out.println("------------------");
		beverage = new TeaWithHook();
		beverage.prepareReciepe();
	}
}
