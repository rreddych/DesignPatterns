package com.rajeshchinta.ducks;

import com.rajeshchinta.ducksimulator.BehaviourControl;

public class MallarDuck extends Duck {
	public MallarDuck() {
		System.out.println("I'm Mallar Duck!");
		flyBehaviour = BehaviourControl.GetFlyBehaviour(this);
		quackBehaviour = BehaviourControl.GetQuackBehaviour(this);
	}
}
