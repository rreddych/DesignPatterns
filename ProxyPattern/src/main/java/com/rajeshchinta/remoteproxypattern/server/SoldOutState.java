package com.rajeshchinta.remoteproxypattern.server;

public class SoldOutState implements State {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient GumBallMachine gumBallMachine = null;

	public SoldOutState(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("The machine is in SoldOut state, QuarterInsertion not accepted!");

	}

	@Override
	public void ejectQuarter() {
		if(this.gumBallMachine.getState() instanceof HasQuarterState) {
			this.gumBallMachine.ejectQuarter();
		}

	}

	@Override
	public void turnCrank() {
		System.out.println("The machine is in SoldOut state, TurnCrank not accepted!");

	}

	@Override
	public void dispense() {
		System.out.println("The machine is in SoldOut state");

	}

	@Override
	public void refill(int ballCount) {
		this.gumBallMachine.setBallCount(ballCount);
		this.gumBallMachine.setState(this.gumBallMachine.getNoQuarterState());	
	}
	
	public String toString() {
		return "In SoldOut state";
	}

}
