package com.rajeshchinta.statepattern;

public class WinnerState implements State{
	
	GumBallMachine gumBallMachine = null;
	
	public WinnerState(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispense() {
		System.out.println("Congratulation! You are the winner of extra GumBall");
		System.out.println("Dispensing extra GumBall!!");
		this.gumBallMachine.decrementBallCountByOne();
		this.gumBallMachine.setState(this.gumBallMachine.getNoQuarterState());
	}

	@Override
	public void refill(int ballCount) {
		// TODO Auto-generated method stub
		
	}

}
