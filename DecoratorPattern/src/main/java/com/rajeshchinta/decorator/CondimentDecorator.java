package com.rajeshchinta.decorator;

import com.rajeshchinta.component.Beverage;

public abstract class CondimentDecorator extends Beverage{
	
	Beverage beverage;
	public abstract String getDescription();
}
