package com.rajeshchinta.templatemethodpattern;

public class Coffee extends CaffeineBeverage{

	@Override
	protected void brew() {
		System.out.println("Brewing coffee grinds");
		
	}

	@Override
	protected void addCondiments() {
		System.out.println("Added Milk and Sugar");
	}

}
