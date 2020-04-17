package com.rajeshchinta.abstractfactory.pizzaingredients;

public class NYPizzaIngredientsFactory implements PizzaIngredientsFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

}
