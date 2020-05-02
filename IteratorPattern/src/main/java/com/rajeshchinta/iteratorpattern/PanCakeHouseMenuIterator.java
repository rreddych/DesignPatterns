package com.rajeshchinta.iteratorpattern;

import java.util.ArrayList;

public class PanCakeHouseMenuIterator implements Iterator{
	
	private ArrayList<MenuItem> menuItems = null;
	int currentIndex = 0;
	int SIZE = 0;
	
	public PanCakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
		this.menuItems = menuItems;
		this.SIZE = menuItems.size();
	}

	@Override
	public boolean hasNext() {
 		if(this.currentIndex < SIZE) {
			return true;
		}
		
		return false;
	}

	@Override
	public Object next() {
		int tempCurrentIndex = currentIndex;
		currentIndex++;
		return this.menuItems.get(tempCurrentIndex);
	}

}
