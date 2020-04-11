package com.rajeshchinta.ducks;

import com.rajeshchinta.ducksimulator.BehaviourControl;

public class RedHeadDuck extends Duck {
	public RedHeadDuck() {
		System.out.println("I'm RedHead Duck!");
		flyBehaviour = BehaviourControl.GetFlyBehaviour(this);
		quackBehaviour = BehaviourControl.GetQuackBehaviour(this);
	}
}
