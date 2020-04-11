package com.rajeshchinta.ducks;

import com.rajeshchinta.ducksimulator.BehaviourControl;

public class WoodenDuck extends Duck{
	public WoodenDuck() {
		System.out.println("I'm Wooden Duck!");
		flyBehaviour = BehaviourControl.GetFlyBehaviour(this);
		quackBehaviour = BehaviourControl.GetQuackBehaviour(this);
	}

}
