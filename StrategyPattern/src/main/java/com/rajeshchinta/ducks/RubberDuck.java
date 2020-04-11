package com.rajeshchinta.ducks;

import com.rajeshchinta.ducksimulator.BehaviourControl;

public class RubberDuck extends Duck  {
	public RubberDuck() {
		System.out.println("I'm Rubber Duck!");
		flyBehaviour = BehaviourControl.GetFlyBehaviour(this);
		quackBehaviour = BehaviourControl.GetQuackBehaviour(this);
	} 
}
