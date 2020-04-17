package com.rajeshchinta.abstractfactory.pizza;

import com.rajeshchinta.abstractfactory.pizzaingredients.Cheese;
import com.rajeshchinta.abstractfactory.pizzaingredients.Dough;
import com.rajeshchinta.abstractfactory.pizzaingredients.Sauce;

public abstract class Pizza {
	
	String name;
	Dough dough;
	Sauce sauce;
	Cheese cheese;
	
	abstract public void prepareIngredients();
	
	public Pizza() {
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void bake() {
		System.out.println("Baking " + name);
	}

	public void cut() {
		System.out.println("Cutting " + name + " diagonally");
	}

	public void box() {
		System.out.println("Boxing " + name);
	}
	
	public String toString() {
		String resultString = "";
		resultString = "----- " + name + " -----";
		resultString = resultString + "\n";
		resultString = resultString + dough;
		resultString = resultString + "\n";
		resultString = resultString + sauce;
		resultString = resultString + "\n";
		resultString = resultString + cheese;
		return resultString;
	}

}
