package com.rajeshchinta.commandpattern.commandobjects;

//Conceptually, a functional interface has exactly one abstractmethod. 
// If your interface needs to have more than one abstract method, then this approach of 
// replacing command object classes with lambda expressions wouldn't work.
@FunctionalInterface
public interface Command {
	public void execute();
}