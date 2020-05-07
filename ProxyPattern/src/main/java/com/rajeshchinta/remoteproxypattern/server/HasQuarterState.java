package com.rajeshchinta.remoteproxypattern.server;

public class HasQuarterState implements State {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient GumBallMachine gumBallMachine = null;
	
	public HasQuarterState(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Already Quarter in the machine");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Ejected the quarter");
		this.gumBallMachine.setState(this.gumBallMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
			System.out.println("Turned Crank");
			this.gumBallMachine.setState(this.gumBallMachine.getSoldState());
			this.gumBallMachine.dispense();
	}

	@Override
	public void dispense() {
			System.out.println("The machine is not in Sold state , hence cannot dispense ball");
	}

	@Override
	public void refill(int ballCount) {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return "Has a quarter";
	}

}
