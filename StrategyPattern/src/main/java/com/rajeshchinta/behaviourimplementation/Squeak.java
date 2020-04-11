package com.rajeshchinta.behaviourimplementation;

import com.rajeshchinta.behaviourinterfaces.QuackBehaviour;
import com.rajeshchinta.ducksimulator.Constancts;

public class Squeak implements QuackBehaviour{
	
	@Override
	public String quack() {
		System.out.println(Constancts.SQEAKING);
		return Constancts.SQEAKING;
	}

}
