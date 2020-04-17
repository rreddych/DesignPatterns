package com.rajeshchinta.abstractfactory.pizzastore;

import com.rajeshchinta.abstractfactory.pizza.CheesePizza;
import com.rajeshchinta.abstractfactory.pizza.PepperoniPizza;
import com.rajeshchinta.abstractfactory.pizza.Pizza;
import com.rajeshchinta.abstractfactory.pizza.PizzaType;
import com.rajeshchinta.abstractfactory.pizza.VeggiePizza;
import com.rajeshchinta.abstractfactory.pizzaingredients.NYPizzaIngredientsFactory;
import com.rajeshchinta.abstractfactory.pizzaingredients.PizzaIngredientsFactory;

public class NYPizzaStore extends PizzaStore {

	PizzaIngredientsFactory ingredientsFactory;

	public NYPizzaStore() {
		this.ingredientsFactory = new NYPizzaIngredientsFactory();
	}

	@Override
	public Pizza createPizza(PizzaType type) {
		Pizza pizza = null;
		if (type == PizzaType.Cheese) {
			pizza = new CheesePizza(this.ingredientsFactory);
			pizza.setName("NewYork Style Cheese Pizza.");
			return pizza;
			}
		else if (type == PizzaType.Pepperoni) {
			pizza = new PepperoniPizza(this.ingredientsFactory);
			pizza.setName("NewYork Style Pepperoni Pizza.");
			return pizza;

		} else if (type == PizzaType.Veggie) {
			pizza = new VeggiePizza(this.ingredientsFactory);
			pizza.setName("NewYork Style Veggie Pizza.");
			return pizza;
		} else {
			return null;
		}
	}
}
