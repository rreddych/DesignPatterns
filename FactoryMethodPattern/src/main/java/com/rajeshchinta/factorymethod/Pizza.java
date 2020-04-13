package com.rajeshchinta.factorymethod;

public abstract class Pizza {
	
	
	String name;
	
	public Pizza() {
	}

	
	public String getName() {
		return name;
	}

	public void prepare() {
		System.out.println("Preparing " + name);
	}

	public void bake() {
		System.out.println("Baking " + name);
	}

	public void cut() {
		System.out.println("Cutting " + name + " diagonally");
	}

	public void box() {
		System.out.println("Boxing " + name);
	}

}
