package com.rajeshchinta.statepattern;

public class SoldState implements State {
	
	GumBallMachine gumBallMachine = null;
	
	public SoldState(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("The machine is not in NoQuarter state, so you cannot insert a quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("The machine is in Sold state, allow it to dispense ball");

	}

	@Override
	public void turnCrank() {
		System.out.println("The machine is in Sold state, allow it to dispense ball");

	}

	@Override
	public void dispense() {
			System.out.println("Dispensed gum ball");
			this.gumBallMachine.setState(this.gumBallMachine.getNoQuarterState());
			this.gumBallMachine.decrementBallCountByOne();
			if(this.gumBallMachine.getBallCount() == 0) {
				this.gumBallMachine.setState(this.gumBallMachine.getSoldOutState());
			}
	}

}
