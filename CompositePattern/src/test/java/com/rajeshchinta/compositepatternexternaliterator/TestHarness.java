package com.rajeshchinta.compositepatternexternaliterator;

import java.util.Iterator;

import org.junit.Test;

public class TestHarness {
	

	@Test
	public void testDisplayAllMenu() throws Exception {
		MenuComponent dinerMenu = new Menu("Diner Menu", "The Diners menu");
		MenuComponent panCakeHouseMenu = new Menu("PanCakeHouse Menu", "The PanCakeHouse Menu");
		MenuComponent dessertMenu = new Menu("Dessert Menu", "The Dessert Menu");
		MenuComponent allMenu = new Menu("All Menu", "The complete menu");
		allMenu.addMenuComponent(dinerMenu);
		allMenu.addMenuComponent(panCakeHouseMenu);
		
		// DessertMenu
		dessertMenu.addMenuComponent(new MenuItem("Chocolate Sundae", "IceCream chocolate Sundea", 100));
		dessertMenu.addMenuComponent(new MenuItem("Butterscotch Icecream", "IceCream butter scotch flavour", 60));
		dessertMenu.addMenuComponent(new MenuItem("Softy Ice cream", "Simple cone vanilla icecream", 30));
		
		//DinerMenu
		dinerMenu.addMenuComponent(new MenuItem("South Indian Meals", "Meals served the south indian way", 60));
		dinerMenu.addMenuComponent(new MenuItem("North Indian Meals", "Meals served the north indian way", 60));
		dinerMenu.addMenuComponent(new MenuItem("Hyderabad Biriyani", "Biriyani served the hyderabad way", 100));
		dinerMenu.addMenuComponent(dessertMenu);
		
		//PanCakeHouseMenu
		panCakeHouseMenu.addMenuComponent(new MenuItem("Buttter scotch cake", "cold cake with butter scotch flavour", 40));
		panCakeHouseMenu.addMenuComponent(new MenuItem("Coconut biscuit", "Baked biscuit with coconut flavour", 50));
		panCakeHouseMenu.addMenuComponent(new MenuItem("Chicken puff", "Puffed Chicken", 30));
		
		
		Iterator<MenuComponent> iterator = allMenu.createIterator();
		//CompositeIterator compositeIterator = new CompositeIterator(iterator);
		while(iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print(); // The way the composite iterator was coded using Stack, this print gets called only on MenuItem
			// not on Menu
		}
		
		
	
	}

}
