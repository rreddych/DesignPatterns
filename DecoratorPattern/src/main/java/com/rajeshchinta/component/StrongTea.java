package com.rajeshchinta.component;

public class StrongTea extends Beverage{
	public StrongTea() {
		this.description = "StrongTea";
	}

	@Override
	public double getCost() {
		return 15;
	}

}
