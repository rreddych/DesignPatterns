package com.rajeshchinta.compositepattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	
	ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	private String name;
	private String description;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public MenuComponent getChild(int i) {
		return this.menuComponents.get(i);
	}
	
	void addMenuComponent(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	
	void removeMenuComponent(MenuComponent menuComponent) {
		menuComponent.removeMenuComponent(menuComponent);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void print() {
		System.out.println("***********--------------------------***************");
		System.out.println("Name: "+ this.name + " Description: "+description);
		System.out.println("----------------------------------------------------");
		
		Iterator<MenuComponent> menuComponentsIterator = this.menuComponents.iterator();
		
		while(menuComponentsIterator.hasNext()) {
			MenuComponent menuComponent = menuComponentsIterator.next();
			menuComponent.print();// recursive call
		}
	}
}
