package com.rajeshchinta.factorymethod.pizzastore;

import com.rajeshchinta.factorymethod.pizza.CheesePizza;
import com.rajeshchinta.factorymethod.pizza.PepperoniPizza;
import com.rajeshchinta.factorymethod.pizza.Pizza;
import com.rajeshchinta.factorymethod.pizza.PizzaType;
import com.rajeshchinta.factorymethod.pizza.VeggiePizza;

// Pattern Honorable mention in HeadFirst Design patterns book.
// This is not used here anyway
public class SimplePizzaFactory {
	
	public Pizza createPizza(PizzaType type) {
		switch (type) {
		case Cheese:
			return new CheesePizza();
		case Pepperoni:
			return new PepperoniPizza();
		case Veggie:
			return new VeggiePizza();
		}
		return null;
		
	}
}
