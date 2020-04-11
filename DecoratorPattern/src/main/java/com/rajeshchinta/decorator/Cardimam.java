package com.rajeshchinta.decorator;

import com.rajeshchinta.component.Beverage;

public class Cardimam extends CondimentDecorator{
	public Cardimam(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() +"-"+ "Cardimam";
	}
	
	@Override
	public double getCost() {
		return this.beverage.getCost() + 4;
	}

}
