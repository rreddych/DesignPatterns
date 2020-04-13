package com.rajeshchinta.factorymethod;

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
