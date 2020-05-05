package com.rajeshchinta.statepattern;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class TestHarness {
	
	@Test
	public void testGumballMachineInitialStateIsNoQuarter() {
		GumBallMachine gumballMachine = new GumBallMachine(5);
		
		String errorMessage = "The Initial State of the GumBall Machine is Not NoQuarterState";
		assertTrue(errorMessage, gumballMachine.getState() instanceof NoQuarterState);
	}
	
	@Test
	public void testGumballMachineStateChangesToHasQuarterAfterInsertingQuarter() {
		GumBallMachine gumballMachine = new GumBallMachine(5);
		gumballMachine.insertQuarter();
		String errorMessage = "The State of the GumBall Machine is expected to be HasQuarterState but it's not";
		assertTrue(errorMessage, gumballMachine.getState() instanceof HasQuarterState);
	}
	
	@Test
	public void testGumballMachineStateChangesToNoQuarterAfterInsertingQuarterAndturningCrank() {
		GumBallMachine gumballMachine = new GumBallMachine(5);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		String errorMessage = "The State of the GumBall Machine is expected to be in NO_QUARTER but it's not";
		assertTrue(errorMessage, gumballMachine.getState() instanceof NoQuarterState);
	}
	
	@Test
	public void testGumballMachineStateChangesToSOLDOUTAfterInsertingQuarterAndturningCrankWhenItsOutOfBalls() {
		GumBallMachine gumballMachine = new GumBallMachine(0);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		String errorMessage = "The State of the GumBall Machine is expected to be in SOLD_OUT but it's not";
		assertTrue(errorMessage, gumballMachine.getState() instanceof SoldOutState);
	}
	
	@Test
	public void testGumballMachineStateRemainsInNoQuarterAfterTurningCrankwithoutFirstInsertingQuarter() {
		GumBallMachine gumballMachine = new GumBallMachine(4);
		gumballMachine.turnCrank();
		String errorMessage = "The State of the GumBall Machine is expected to be in NoQuarter but it's not";
		assertTrue(errorMessage, gumballMachine.getState() instanceof NoQuarterState);
	}
	
	@Test
	public void testGumballMachineStateChangesToNoQuarterAfterInsertingQuarterAndEjectingQuarter() {
		GumBallMachine gumballMachine = new GumBallMachine(4);
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		String errorMessage = "The State of the GumBall Machine is expected to be in NoQuarter but it's not";
		assertTrue(errorMessage, gumballMachine.getState() instanceof NoQuarterState);
	}
	
	@Test
	public void testGumballMachineWith2BallsToSoldOut() {
		GumBallMachine gumballMachine = new GumBallMachine(2);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		String errorMessage = "The State of the GumBall Machine is expected to be in NoQuarter but it's not";
		assertTrue(errorMessage, gumballMachine.getState() instanceof NoQuarterState);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		errorMessage = "The State of the GumBall Machine is expected to be in SOLDout but it's not";
		assertTrue(errorMessage, gumballMachine.getState() instanceof SoldOutState);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		errorMessage = "The State of the GumBall Machine is expected to be in SOLDout but it's not";
		assertTrue(errorMessage, gumballMachine.getState() instanceof SoldOutState);
	}
	
	@Test
	public void testGumballMachineWithNoQuarterStateOperateEjectQuarter() {
		GumBallMachine gumballMachine = new GumBallMachine(4);
		gumballMachine.ejectQuarter();
		String errorMessage = "The State of the GumBall Machine is expected to be in NoQuarter but it's not";
		assertTrue(errorMessage, gumballMachine.getState() instanceof NoQuarterState);
	}
	
	
}
