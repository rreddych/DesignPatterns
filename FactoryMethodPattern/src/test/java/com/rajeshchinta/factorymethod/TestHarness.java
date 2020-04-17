package com.rajeshchinta.factorymethod;

import org.junit.Test;

import com.rajeshchinta.factorymethod.pizza.PizzaType;
import com.rajeshchinta.factorymethod.pizzastore.ChicagoPizzaStore;
import com.rajeshchinta.factorymethod.pizzastore.NYPizzaStore;
import com.rajeshchinta.factorymethod.pizzastore.PizzaStore;

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
