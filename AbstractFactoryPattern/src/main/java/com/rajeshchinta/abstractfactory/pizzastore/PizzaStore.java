package com.rajeshchinta.abstractfactory.pizzastore;

import com.rajeshchinta.abstractfactory.pizza.Pizza;
import com.rajeshchinta.abstractfactory.pizza.PizzaType;

public abstract class PizzaStore {
	
	// This is the factory  method, Pizza store allows subclasses to 
	// define and implement this. So it is determined at run-time.
	protected abstract Pizza createPizza(PizzaType type);
	
	// The other methods in the abstract creator are written
	// with-out any knowledge of the actual instance of the product that gets created.
	public Pizza orderPizza(PizzaType type) {
		Pizza pizza = this.createPizza(type);
		pizza.prepareIngredients();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
