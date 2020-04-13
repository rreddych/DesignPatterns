package com.rajeshchinta.factorymethod;

public abstract class PizzaStore {
	
	// This is the abstract factory  method, Pizza store allows subclasses to 
	// define and implement this. So it is determined at run-time.
	public abstract Pizza createPizza(PizzaType type);
	
	// The other methods in the abstract creator are written
	// with-out any knowledge of the actual instance of the product that gets created.
	public void orderPizza(PizzaType type) {
		Pizza pizza = this.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
}
