package com.rajeshchinta.ducks;

import com.rajeshchinta.ducksimulator.BehaviourControl;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		System.out.println("I'm Decoy Duck!");
		flyBehaviour = BehaviourControl.GetFlyBehaviour(this);
		quackBehaviour = BehaviourControl.GetQuackBehaviour(this);
	}
}
