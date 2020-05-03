package com.rajeshchinta.iteratorpatternimplicit;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu{
	
	HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();
    int currentIndex = 0;
    int MAX_LENGTH = 3;
	
	public CafeMenu() throws Exception {
		addItem("Cold Coffee", "Cofee Served cold", 20, true);
		addItem("Hot Coffee", "Cofee Served hot", 20, true);
		addItem("Omlet", "Egg spread", 40, false);
	}

	public void addItem(String name, String description, double price, boolean vegetarian) throws Exception {
		MenuItem menuItem = new MenuItem(name, description, price, vegetarian);
		menuItems.put(menuItem.getName(), menuItem);
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return  this.menuItems.values().iterator();
	}

}
