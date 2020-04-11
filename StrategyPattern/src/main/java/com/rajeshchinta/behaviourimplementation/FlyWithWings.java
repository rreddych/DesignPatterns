package com.rajeshchinta.behaviourimplementation;

import com.rajeshchinta.behaviourinterfaces.FlyBehaviour;
import com.rajeshchinta.ducksimulator.Constancts;

// FlywithWings implements the FlyBehaviour
public class FlyWithWings implements FlyBehaviour{

	@Override
	public String fly() {
		System.out.println(Constancts.FLYING);
		return Constancts.FLYING;
	}
}
