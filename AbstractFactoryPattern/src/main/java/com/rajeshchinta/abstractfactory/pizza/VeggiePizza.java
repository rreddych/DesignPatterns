package com.rajeshchinta.abstractfactory.pizza;

import com.rajeshchinta.abstractfactory.pizzaingredients.PizzaIngredientsFactory;

public class VeggiePizza extends Pizza {
	
	PizzaIngredientsFactory ingredientsFactory;
	
	public VeggiePizza(PizzaIngredientsFactory ingredientsFactory) {
		//this.name = "VeggiePizza";
		this.ingredientsFactory = ingredientsFactory;
	}

	@Override
	public void prepareIngredients() {
		System.out.println("Preparing Ingredients for " + this.name);
		this.dough = this.ingredientsFactory.createDough();
		this.cheese = this.ingredientsFactory.createCheese();
		this.sauce = this.ingredientsFactory.createSauce();
	}
}
