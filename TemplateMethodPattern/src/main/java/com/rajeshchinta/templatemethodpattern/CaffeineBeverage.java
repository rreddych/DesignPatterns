package com.rajeshchinta.templatemethodpattern;

import java.io.IOException;

public abstract class CaffeineBeverage {
	
	// This is the template method
	//This method is the algorithm abstraction
	protected void prepareReciepe() throws IOException {
		this.boilWater();
		this.brew();
		this.pourInCup();
		// Hook: the subclass can hook it's decision of doesUserWantCondiments
		// but it's not mandatory, as the base class provides a default implementation
		if (this.userWantCondiments()) {
			this.addCondiments();
		}
	}
	
	protected boolean userWantCondiments() throws IOException {
		return true;
	}

	protected abstract void brew();
	protected abstract void addCondiments();
	
	protected void boilWater() {
		System.out.println("Boiling water!");
	}
	
	protected void pourInCup() {
		System.out.println("Pouring in Cup");
		
	}

}
