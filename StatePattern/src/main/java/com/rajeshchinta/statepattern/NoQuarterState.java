package com.rajeshchinta.statepattern;

public class NoQuarterState implements State {
	
	GumBallMachine gumBallMachine = null;
	
	public NoQuarterState(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Inserted Quarter");
		this.gumBallMachine.setState(this.gumBallMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("No quarter in the machine");
	}

	@Override
	public void turnCrank() {
		System.out.println("No Quarter in the machine, please place a quarter and turn the crank on");

	}

	@Override
	public void dispense() {
		System.out.println("No Quarter in the machine, please place a quarter and turn the crank on");
	}

	@Override
	public void refill(int ballCount) {
		// TODO Auto-generated method stub
		
	}

}
