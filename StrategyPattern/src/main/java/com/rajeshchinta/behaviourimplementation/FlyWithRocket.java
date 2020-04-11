package com.rajeshchinta.behaviourimplementation;

import com.rajeshchinta.behaviourinterfaces.FlyBehaviour;

public class FlyWithRocket implements FlyBehaviour {

	@Override
	public String fly() {
		System.out.println("I am flying with rocket speed");
		return "I am flying with rocket speed";
	}

}
