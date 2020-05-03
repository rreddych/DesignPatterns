package com.rajeshchinta.iteratorpatternimplicit;

import java.util.ArrayList;
import java.util.Iterator;

public class PanCakeHouseMenu implements Menu{
	
	ArrayList<MenuItem> menuItems;
	
	public PanCakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("Buttter scotch cake", "cold cake with butter scotch flavour", 40);
		addItem("Coconut biscuit", "Baked biscuit with coconut flavour", 50);
		addItem("Chicken puff", "Puffed Chicken", 30, false);
	}
	
	public Iterator<MenuItem> createIterator() {
		Iterator<MenuItem> panCakeHouseMenuIterator = new PanCakeHouseMenuIterator(this.menuItems);
		return panCakeHouseMenuIterator;
	}

	public void addItem(String name, String description, double price, boolean vegetarian) {
		MenuItem menuItem = new MenuItem(name, description, price, vegetarian);
		menuItems.add(menuItem);
	}
	
	public void addItem(String name, String description, double price) {
		MenuItem menuItem = new MenuItem(name, description, price);
		menuItems.add(menuItem);
	}
	
	public ArrayList<MenuItem> getMenuItems(){
		return this.menuItems;
	}

}
