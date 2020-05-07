package com.rajeshchinta.remoteproxypattern.server;

import java.util.Random;

public class SoldState implements State {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient GumBallMachine gumBallMachine = null;
	
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
		
			if(this.gumBallMachine.getBallCount() == 0) {
				this.gumBallMachine.setState(this.gumBallMachine.hasQuarterState);
				this.gumBallMachine.ejectQuarter();
				this.gumBallMachine.setState(this.gumBallMachine.getSoldOutState());
				System.out.println("Set state to SoldOut!");
				System.out.println("The machine is out of gumballs, please try again later.");
			}else {
				System.out.println("Dispensed gum ball");
				this.gumBallMachine.decrementBallCountByOne();
				// One in 10 users win 2 Gum balls, the below random number code is for that.
				Random random = new Random();
				int i = random.nextInt(10);
				if(i == 1) {
					this.gumBallMachine.setState(this.gumBallMachine.getWinnerState());
					this.gumBallMachine.dispense();
				}else {
					this.gumBallMachine.setState(this.gumBallMachine.getNoQuarterState());
				}
				
			}	
	}

	@Override
	public void refill(int ballCount) {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return "In Sold state";
	}

}
