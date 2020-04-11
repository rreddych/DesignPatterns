package com.rajeshchinta.behaviourimplementation;

import com.rajeshchinta.behaviourinterfaces.FlyBehaviour;
import com.rajeshchinta.ducksimulator.Constancts;

public class FlyNoWay implements FlyBehaviour {
	
	@Override
	public String fly() {
		System.out.println(Constancts.NOTFLYING);
		return Constancts.NOTFLYING;
	}

}
