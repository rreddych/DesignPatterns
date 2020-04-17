package com.rajeshchinta.factorymethod.pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		this.name = "ChicagoStyleVeggiePizza";
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting " + name + " into squares");
	}

}
