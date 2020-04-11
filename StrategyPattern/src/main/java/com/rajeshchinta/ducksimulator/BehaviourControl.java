package com.rajeshchinta.ducksimulator;

import com.rajeshchinta.behaviourimplementation.FlyNoWay;
import com.rajeshchinta.behaviourimplementation.FlyWithWings;
import com.rajeshchinta.behaviourimplementation.MuteQuack;
import com.rajeshchinta.behaviourimplementation.Quack;
import com.rajeshchinta.behaviourimplementation.Squeak;
import com.rajeshchinta.behaviourinterfaces.FlyBehaviour;
import com.rajeshchinta.behaviourinterfaces.QuackBehaviour;
import com.rajeshchinta.ducks.DecoyDuck;
import com.rajeshchinta.ducks.Duck;
import com.rajeshchinta.ducks.MallarDuck;
import com.rajeshchinta.ducks.RedHeadDuck;
import com.rajeshchinta.ducks.RubberDuck;

public class BehaviourControl { 
	public static FlyBehaviour GetFlyBehaviour(Duck duck) {
		if ((duck instanceof MallarDuck) || (duck instanceof RedHeadDuck)) {
			return new FlyWithWings();
		}
		else {
			return new FlyNoWay();
		}
	}
	
	public static QuackBehaviour GetQuackBehaviour(Duck duck) {
		if((duck instanceof MallarDuck) || (duck instanceof RedHeadDuck)) {
			return new Quack();
		}
		else if(duck instanceof RubberDuck || duck instanceof DecoyDuck) {
			return new Squeak();
		}
		else{
			return new MuteQuack();
		}
	}

}
