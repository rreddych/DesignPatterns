package com.rajeshchinta.abstractfactory.pizzaingredients;

public class ChicagoPizzaIngredientsFactory implements PizzaIngredientsFactory{

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

}
