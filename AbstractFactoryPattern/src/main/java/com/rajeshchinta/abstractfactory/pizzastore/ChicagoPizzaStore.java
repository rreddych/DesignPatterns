package com.rajeshchinta.abstractfactory.pizzastore;

import com.rajeshchinta.abstractfactory.pizza.CheesePizza;
import com.rajeshchinta.abstractfactory.pizza.PepperoniPizza;
import com.rajeshchinta.abstractfactory.pizza.Pizza;
import com.rajeshchinta.abstractfactory.pizza.PizzaType;
import com.rajeshchinta.abstractfactory.pizza.VeggiePizza;
import com.rajeshchinta.abstractfactory.pizzaingredients.ChicagoPizzaIngredientsFactory;
import com.rajeshchinta.abstractfactory.pizzaingredients.PizzaIngredientsFactory;

public class ChicagoPizzaStore extends PizzaStore {
	public ChicagoPizzaStore() {
		this.ingredientsFactory = new ChicagoPizzaIngredientsFactory();
	}
	
	PizzaIngredientsFactory ingredientsFactory;

	@Override
	public Pizza createPizza(PizzaType type) {
		Pizza pizza = null;
		if (type == PizzaType.Cheese) {
			pizza = new CheesePizza(this.ingredientsFactory);
			pizza.setName("Chicago Style Cheese Pizza.");
			return pizza;
			}
		else if (type == PizzaType.Pepperoni) {
			pizza = new PepperoniPizza(this.ingredientsFactory);
			pizza.setName("Chicago Style Pepperoni Pizza.");
			return pizza;

		} else if (type == PizzaType.Veggie) {
			pizza = new VeggiePizza(this.ingredientsFactory);
			pizza.setName("Chicago Style Veggie Pizza.");
			return pizza;
		} else {
			return null;
		}
	}

}
