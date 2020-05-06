package com.rajeshchinta.statepattern;

public interface State {
	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
	void refill(int ballCount);
}
