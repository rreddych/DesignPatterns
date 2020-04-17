package com.rajeshchinta.abstractfactory.pizzaingredients;

// This is the AbstractFactory Interface
public interface PizzaIngredientsFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
}
