package com.rajeshchinta.iteratorpatternimplicit;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem>{
	
	private MenuItem[] menuItems;
	int currentIndex = 0;
	
	public DinerMenuIterator(MenuItem[] menuItems) {
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if(this.currentIndex <= menuItems.length-1) {
			return true;
		}
		
		return false;
	}

	@Override
	public MenuItem next() {
		int tempCurrentIndex = currentIndex;
		currentIndex++;
		return this.menuItems[tempCurrentIndex];
	}

}
