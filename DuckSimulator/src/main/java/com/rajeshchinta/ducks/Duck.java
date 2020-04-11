package com.rajeshchinta.ducks;

import com.rajeshchinta.behaviourinterfaces.FlyBehaviour;
import com.rajeshchinta.behaviourinterfaces.QuackBehaviour;

public class Duck {
	// A Duck 'Has-A' flying behavior. This is composition.
	//(Design principle: Prefer composition over inheritance)
	// Also since the flying and quacking behaviors change across different ducks,
	// they are separated out into different sets of classes
	// Design principle: Identify parts of your application that changes and separate them from
	// those parts that do not change.
	protected FlyBehaviour flyBehaviour;
	// A Duck 'Has-A' quacking behavior. This is composition
	//(Design principle: Prefer composition over inheritance)
	protected QuackBehaviour quackBehaviour;
	
	protected void swim() {
		System.out.println("I'm swimming.");
	}
	
	protected void display() {
		System.out.println("I'm shown.");
	}
	
	public String fly() {
		return flyBehaviour.fly();
	}
	
	public String quack() {
		return quackBehaviour.quack();
	}
	
	public void playAll() {
		display();
		swim();
		fly();
		quack();
	}
	
	public void SetFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
	protected void SetQuackBehaviour(QuackBehaviour quackBehaviour) {
		this.quackBehaviour = quackBehaviour;
	}
}
