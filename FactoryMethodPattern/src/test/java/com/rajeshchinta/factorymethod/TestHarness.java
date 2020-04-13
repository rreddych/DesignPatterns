package com.rajeshchinta.factorymethod;

import org.junit.Test;

public class TestHarness {
	@Test
	public void testNYPizzaStoreOrder() {
		PizzaStore pizzaStore = new NYPizzaStore();
		pizzaStore.orderPizza(PizzaType.Pepperoni);
		System.out.println();
		System.out.println();
	}
	
	@Test
	public void testChicagoPizzaStoreOrder() {
		PizzaStore pizzaStore = new ChicagoPizzaStore();
		pizzaStore.orderPizza(PizzaType.Veggie);
		System.out.println();
		System.out.println();
	}
}
