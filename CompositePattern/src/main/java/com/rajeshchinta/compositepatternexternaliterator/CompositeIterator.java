package com.rajeshchinta.compositepatternexternaliterator;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent>{
	
	// We are using Stack data structure to keep track of all the nested iterators
	Stack<Iterator<MenuComponent>> stackOfIterators = new Stack<Iterator<MenuComponent>>();
	
	//private Iterator<MenuComponent> iterator = null;
	Iterator<MenuComponent> menuComponentIterator = null;
	
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		//this.iterator = iterator;
		stackOfIterators.push(iterator);
	}

	/*
	 * @Override public boolean hasNext() { Iterator<MenuComponent> iterator =
	 * stackOfIterators.peek(); if(iterator.hasNext()) { return true; }else {
	 * stackOfIterators.pop(); if(!stackOfIterators.empty()) { iterator =
	 * stackOfIterators.peek(); return hasNext(); } else { return false; } } }
	 */

	/*
	 * @Override public MenuComponent next() { Iterator<MenuComponent> iterator =
	 * stackOfIterators.peek(); MenuComponent menuComponent = iterator.next();
	 * if(menuComponent.createIterator().hasNext() == false) { return menuComponent;
	 * }else { stackOfIterators.push(menuComponent.createIterator()); return
	 * menuComponent; } }
	 */
	
	// The below methods hasNext, next and this compositeIterator will need a fix, revisit (refer to
	// headfirst code and headfirst book)
	public boolean hasNext() {
		if (stackOfIterators.empty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stackOfIterators.peek();
			if (!iterator.hasNext()) {
				stackOfIterators.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
	
	public MenuComponent next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stackOfIterators.peek();
			MenuComponent component = iterator.next();
			stackOfIterators.push(component.createIterator());
			return component;
		} else {
			return null;
		}
	}

}
