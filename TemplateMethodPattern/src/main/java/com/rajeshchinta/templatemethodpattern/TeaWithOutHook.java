package com.rajeshchinta.templatemethodpattern;

public class TeaWithOutHook extends CaffeineBeverage{
	
	@Override
	protected void brew() {
		System.out.println("Steeped Tea Bag");
	}

	@Override
	protected void addCondiments() {
		System.out.println("Added Lemon");
	}

}
