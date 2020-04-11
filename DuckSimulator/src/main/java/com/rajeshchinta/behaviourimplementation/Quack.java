package com.rajeshchinta.behaviourimplementation;

import com.rajeshchinta.behaviourinterfaces.QuackBehaviour;
import com.rajeshchinta.ducksimulator.Constancts;

public class Quack  implements QuackBehaviour{

	@Override
	public String quack() {
		System.out.println(Constancts.QUACKING);
		return Constancts.QUACKING;
	}

}
