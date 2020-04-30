package com.rajeshchinta.templatemethodpattern;

public class CoffeeWithOutHook extends CaffeineBeverage{

	@Override
	protected void brew() {
		System.out.println("Brewing coffee grinds");
		
	}

	@Override
	protected void addCondiments() {
		System.out.println("Added Milk and Sugar");
	}

}
