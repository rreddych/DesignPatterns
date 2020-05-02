package com.rajeshchinta.iteratorpattern;

public class MenuItem {
	
	private String name;
	private String description;
	private double price;
	private boolean vegetarian = true;
	
	public MenuItem(String name, String description, double price, boolean vegetarian) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.vegetarian = vegetarian;
	}
	
	public MenuItem(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}
	
	public String toString() {
		return "Name: "+ this.name + " Description: "+description + " Price: "+price+ " Vegetarian: "+ this.isVegetarian();
		
	}

}
