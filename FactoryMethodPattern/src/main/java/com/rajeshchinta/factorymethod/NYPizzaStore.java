package com.rajeshchinta.factorymethod;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaType type) {
		if(type == PizzaType.Cheese)
			return new NYStyleCheesePizza();
		else if(type == PizzaType.Pepperoni) {
			return new NYStylePepperoniPizza();
			
		}else if(type == PizzaType.Veggie) {
			return new NYStyleVeggiePizza();
		}else {
			return null;
		}
	}
}
