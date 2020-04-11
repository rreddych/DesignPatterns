package com.rajeshchinta.behaviourimplementation;

import com.rajeshchinta.behaviourinterfaces.QuackBehaviour;
import com.rajeshchinta.ducksimulator.Constancts;

public class MuteQuack implements QuackBehaviour{

	@Override
	public String quack() {
		System.out.println(Constancts.NOTQUACKING);
		return Constancts.NOTQUACKING;
	}
}
