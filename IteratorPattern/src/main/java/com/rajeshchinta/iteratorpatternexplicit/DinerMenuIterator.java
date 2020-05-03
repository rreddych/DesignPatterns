package com.rajeshchinta.iteratorpatternexplicit;

public class DinerMenuIterator implements Iterator{
	
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
	public Object next() {
		int tempCurrentIndex = currentIndex;
		currentIndex++;
		return this.menuItems[tempCurrentIndex];
	}

}
