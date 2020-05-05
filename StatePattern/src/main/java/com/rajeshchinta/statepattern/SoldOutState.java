package com.rajeshchinta.statepattern;

public class SoldOutState implements State {
	
	GumBallMachine gumBallMachine = null;

	public SoldOutState(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("The machine is in SoldOut state");

	}

	@Override
	public void ejectQuarter() {
		if(this.gumBallMachine.getState() instanceof HasQuarterState) {
			this.gumBallMachine.ejectQuarter();
		}

	}

	@Override
	public void turnCrank() {
		System.out.println("The machine is in SoldOut state");

	}

	@Override
	public void dispense() {
		System.out.println("The machine is in SoldOut state");

	}

}
