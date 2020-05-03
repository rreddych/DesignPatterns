package com.rajeshchinta.iteratorpatternexplicit;

public class DinerMenu implements Menu{
	
    MenuItem[] menuItems;
    int currentIndex = 0;
    int MAX_LENGTH = 3;
	
	public DinerMenu() throws Exception {
		menuItems = new MenuItem[3];
		
		addItem("South Indian Meals", "Meals served the south indian way", 60);
		addItem("North Indian Meals", "Meals served the north indian way", 60);
		addItem("Hyderabad Biriyani", "Biriyani served the hyderabad way", 100);
	}
	
	public Iterator createIterator() {
		Iterator dinerMenuIterator = new DinerMenuIterator(this.menuItems);
		return dinerMenuIterator;
	}

	public void addItem(String name, String description, double price) throws Exception {
		MenuItem menuItem = new MenuItem(name, description, price);
		if(currentIndex < MAX_LENGTH) {
			menuItems[currentIndex] = menuItem;
			currentIndex++;
		}
		else {
			throw new Exception("Max Menu size reached");
		}
		
	}

}
