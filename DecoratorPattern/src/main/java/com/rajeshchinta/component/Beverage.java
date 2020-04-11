package com.rajeshchinta.component;

public abstract class Beverage {
	protected String description = "Unknown";

	public String getDescription() {
		return description;
	}
	
	public abstract double getCost();

}
