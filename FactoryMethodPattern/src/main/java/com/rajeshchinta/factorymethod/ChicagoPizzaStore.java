package com.rajeshchinta.factorymethod;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(PizzaType type) {
		if(type == PizzaType.Cheese)
			return new ChicagoStyleCheesePizza();
		else if(type == PizzaType.Pepperoni) {
			return new ChicagoStylePepperoniPizza();
			
		}else if(type == PizzaType.Veggie) {
			return new ChicagoStyleVeggiePizza();
		}else {
			return null;
		}
	}

}
