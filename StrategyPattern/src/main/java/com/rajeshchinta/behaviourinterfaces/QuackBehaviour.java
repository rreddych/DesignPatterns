package com.rajeshchinta.behaviourinterfaces;

//This is declared as in interface, inorder for the clients to be able to follow the 
//design priciple: Program to and interface not to an implementation,
//in other words, Program to the supertype not to the subclass.
public interface QuackBehaviour {
	// quack is the method all the classes that implements this interface needs to define for themselves.
	// So all the classes that implement this Interface, provide implementation for the quack() method
	// in their own way (algorithm). So all these different implentations can be called as a family of 
	// algorithms.
	public String quack();
}
