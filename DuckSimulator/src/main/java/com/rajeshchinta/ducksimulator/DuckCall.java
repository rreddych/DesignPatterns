package com.rajeshchinta.ducksimulator;

import com.rajeshchinta.behaviourimplementation.Quack;
import com.rajeshchinta.behaviourinterfaces.QuackBehaviour;

public class DuckCall {
	private QuackBehaviour quackBehaviour;
	public DuckCall() {
		System.out.println("I'm Duck call!");
		this.quackBehaviour = new Quack();
	}

	public String quack() {
		return quackBehaviour.quack();
	}
}
