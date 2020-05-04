package com.rajeshchinta.compositepattern;

public abstract class MenuComponent {
	
	String getName() {
		throw new UnsupportedOperationException();
	}
	
	String getDescription() {
		throw new UnsupportedOperationException();
	}
	double getPrice() {
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	
	MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
	
	void addMenuComponent(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	void removeMenuComponent(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	void print() {
		throw new UnsupportedOperationException();
	}
}
