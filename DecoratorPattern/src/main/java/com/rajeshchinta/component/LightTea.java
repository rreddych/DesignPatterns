package com.rajeshchinta.component;

public class LightTea extends Beverage {
	
	public LightTea() {
		this.description = "LightTea";
	}

	@Override
	public double getCost() {
		return 10;
	}

}
