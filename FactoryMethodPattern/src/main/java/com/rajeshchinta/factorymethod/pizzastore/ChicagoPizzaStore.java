package com.rajeshchinta.factorymethod.pizzastore;

import com.rajeshchinta.factorymethod.pizza.ChicagoStyleCheesePizza;
import com.rajeshchinta.factorymethod.pizza.ChicagoStylePepperoniPizza;
import com.rajeshchinta.factorymethod.pizza.ChicagoStyleVeggiePizza;
import com.rajeshchinta.factorymethod.pizza.Pizza;
import com.rajeshchinta.factorymethod.pizza.PizzaType;

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
