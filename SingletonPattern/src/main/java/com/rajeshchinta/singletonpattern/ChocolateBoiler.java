package com.rajeshchinta.singletonpattern;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	// One approach of making the singleton object thread safe is to instantiate 
	// the object eagerly at this point and just use the getInstance() to return that.
	// private static ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
	private static ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
	
	//This is a traditional implementation of SingletonPattern
	// by defining a private constructor, and a static public getInstance method.
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	// User synchronized keyword to make the getInstance thread safe, that means only
	// on thread can access the method at a time. This in one another alternative way to
	// earlier instantiation for maintaining thread safety.
	// public static synchronized ChocolateBoiler getInstance() 
	public static ChocolateBoiler getInstance() {
			return chocolateBoiler;
	}
	
	public void fill() {
		if(isEmpty() && !isBoiled()) {
			empty = false;
			boiled = false;
			// fill the boiler with chocolate,milk mixture
			System.out.println("Fill the boiler with chocolate,milk mixture");
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
			// Boil the milk + chocolate contents
			System.out.println("Boil the milk + chocolate contents");
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
			// drain the boiler
			System.out.println("Drain the boiler");
		}
	}
	
	public boolean isBoiled() {
		return boiled;
	}
	
	public boolean isEmpty() {
		return empty;
	}
}
