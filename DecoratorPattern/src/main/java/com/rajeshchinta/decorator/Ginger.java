package com.rajeshchinta.decorator;

import com.rajeshchinta.component.Beverage;

public class Ginger extends CondimentDecorator{
	public Ginger(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() +"-"+ "Ginger";
	}

	@Override
	public double getCost() {
		return this.beverage.getCost() + 2;
	}

}
