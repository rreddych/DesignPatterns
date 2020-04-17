package com.rajeshchinta.factorymethod;

import org.junit.Test;

import com.rajeshchinta.abstractfactory.pizza.Pizza;
import com.rajeshchinta.abstractfactory.pizza.PizzaType;
import com.rajeshchinta.abstractfactory.pizzastore.ChicagoPizzaStore;
import com.rajeshchinta.abstractfactory.pizzastore.NYPizzaStore;
import com.rajeshchinta.abstractfactory.pizzastore.PizzaStore;

public class TestHarness {
	@Test
	public void testNYPizzaStoreOrder() {
		PizzaStore pizzaStore = new NYPizzaStore();
		Pizza pizza = pizzaStore.orderPizza(PizzaType.Cheese);
		System.out.println("Pizza details:- " + pizza);
		System.out.println();
	}
	
	@Test
	public void testChicagoPizzaStoreOrder() {
		PizzaStore pizzaStore = new ChicagoPizzaStore();
		Pizza pizza = pizzaStore.orderPizza(PizzaType.Pepperoni);
		System.out.println("Pizza details:- " + pizza);
		System.out.println();
	}
}
