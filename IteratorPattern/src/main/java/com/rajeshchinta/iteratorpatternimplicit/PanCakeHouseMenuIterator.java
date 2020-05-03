package com.rajeshchinta.iteratorpatternimplicit;

import java.util.ArrayList;
import java.util.Iterator;

public class PanCakeHouseMenuIterator implements Iterator<MenuItem>{
	
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
	public MenuItem next() {
		int tempCurrentIndex = currentIndex;
		currentIndex++;
		return this.menuItems.get(tempCurrentIndex);
	}

}
