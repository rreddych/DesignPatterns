package com.rajeshchinta.iteratorpattern;

import org.junit.Test;

public class TestHarness {
	
	@Test
	public void testDisplayAllMenu() throws Exception {
		Menu menu = (Menu) new DinerMenu();
		Iterator iterator = menu.createIterator();
		System.out.println("------Displaying Full Menu------------");
		display(iterator);
		
		menu = (Menu) new PanCakeHouseMenu();
		iterator = menu.createIterator();
		display(iterator);
		
	}

	public void display(Iterator iterator) {
		
		do{
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem);
		}while(iterator.hasNext());
	}
	
	@Test
	public void testDisplayAllVegetarian() throws Exception {
		Menu menu = (Menu) new DinerMenu();
		Iterator iterator = menu.createIterator();
		System.out.println("------Displaying Vegetarian Menu------------");
		displayVegetarian(iterator);
		
		menu = new PanCakeHouseMenu();
		iterator = menu.createIterator();
		displayVegetarian(iterator);
	}
	
	public void displayVegetarian(Iterator iterator) {
		
		do{
			MenuItem menuItem = (MenuItem)iterator.next();
			if (menuItem.isVegetarian()) {
				System.out.println(menuItem);
			}
		}while(iterator.hasNext());
	}

}
