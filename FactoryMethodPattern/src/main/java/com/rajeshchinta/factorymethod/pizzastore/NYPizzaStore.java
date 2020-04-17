package com.rajeshchinta.factorymethod.pizzastore;

import com.rajeshchinta.factorymethod.pizza.NYStyleCheesePizza;
import com.rajeshchinta.factorymethod.pizza.NYStylePepperoniPizza;
import com.rajeshchinta.factorymethod.pizza.NYStyleVeggiePizza;
import com.rajeshchinta.factorymethod.pizza.Pizza;
import com.rajeshchinta.factorymethod.pizza.PizzaType;

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
