package com.rajeshchinta.adapterpattern.duck;

public class MallarDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Mallar duck quacking");

	}

	@Override
	public void fly() {
		System.out.println("Mallar duck flying");
	}

}
