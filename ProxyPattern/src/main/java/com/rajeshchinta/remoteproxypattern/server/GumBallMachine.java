package com.rajeshchinta.remoteproxypattern.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumBallMachine extends UnicastRemoteObject implements GumBallMachineRemote{

	private static final long serialVersionUID = 1L;
	State noQuarterState = null;
	State hasQuarterState = null;
	State soldState = null;
	State soldOutState = null;
	State winnerState = null;
	State state = null;
	int ballCount = 0;
	String location = null;
	
	public GumBallMachine(int ballCount, String location) throws RemoteException {
		this.ballCount = ballCount;
		this.location = location;
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		soldOutState = new SoldOutState(this);
		winnerState = new WinnerState(this);
		if(this.ballCount > 0) {
			state = noQuarterState;
		}else {
			state = soldOutState;
		}
		
	}
	
	public int getBallCount() {
		return ballCount;
	}
	
	public void setBallCount(int ballCount) {
		this.ballCount = ballCount;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void decrementBallCountByOne() {
		this.ballCount--;
	}

	public State getState() {
		return state;
	}
	
	public void setState(State state) {
		this.state = state;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
	}

	public void dispense() {
		state.dispense();
	}

	public void ejectQuarter() {
		state.ejectQuarter();		
	}
	
	public void refill(int ballCount) {
		state.refill(ballCount);
	}
}
