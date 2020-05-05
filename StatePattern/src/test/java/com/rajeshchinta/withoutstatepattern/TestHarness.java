package com.rajeshchinta.withoutstatepattern;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestHarness {
	
	final String NO_QUARTER = "NoQuarterState";
	final String HAS_QUARTER = "HasQuarterState";
	final String SOLD = "Sold";
	final String SOLD_OUT = "SoldOut";
	
	@Test
	public void testGumballMachineInitialStateIsNoQuarter() {
		GumBallMachine gumballMachine = new GumBallMachine(5);
		
		String errorMessage = "The Initial State of the GumBall Machine is Not NoQuarterState";
		String expectedState = NO_QUARTER;
		assertExpectedState(gumballMachine, errorMessage, expectedState);
	}

	private void assertExpectedState(GumBallMachine gumballMachine, String errorMessage, String expectedState) {
		assertTrue(errorMessage, 
				gumballMachine.getState().equalsIgnoreCase(expectedState));
	}
	
	@Test
	public void testGumballMachineStateChangesToHasQuarterAfterInsertingQuarter() {
		GumBallMachine gumballMachine = new GumBallMachine(5);
		gumballMachine.insertQuarter();
		String errorMessage = "The State of the GumBall Machine is expected to be HasQuarterState but it's not";
		String expectedState = HAS_QUARTER;
		assertExpectedState(gumballMachine, errorMessage, expectedState);
	}
	
	@Test
	public void testGumballMachineStateChangesToNoQuarterAfterInsertingQuarterAndturningCrank() {
		GumBallMachine gumballMachine = new GumBallMachine(5);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		String errorMessage = "The State of the GumBall Machine is expected to be in NO_QUARTER but it's not";
		String expectedState = NO_QUARTER;
		assertExpectedState(gumballMachine, errorMessage, expectedState);
	}
	
	@Test
	public void testGumballMachineStateChangesToSOLDOUTAfterInsertingQuarterAndturningCrankWhenItsOutOfBalls() {
		GumBallMachine gumballMachine = new GumBallMachine(0);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		String errorMessage = "The State of the GumBall Machine is expected to be in SOLD_OUT but it's not";
		String expectedState = SOLD_OUT;
		assertExpectedState(gumballMachine, errorMessage, expectedState);
	}
	
	@Test
	public void testGumballMachineStateDoesntChangeToSoldAfterTurningCrankwithoutFirstInsertingQuarter() {
		GumBallMachine gumballMachine = new GumBallMachine(5);
		gumballMachine.turnCrank();
		String errorMessage = "The State of the GumBall Machine is expected to be in NO_QUARTER but it's not";
		String expectedState = NO_QUARTER;
		assertExpectedState(gumballMachine, errorMessage, expectedState);
	}
	
	@Test
	public void testGumballMachineStateChangesToNoQuarterAfterSuccessfullyDispensingGumball() {
		GumBallMachine gumballMachine = new GumBallMachine(5);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		String errorMessage = "The State of the GumBall Machine is expected to be in NO_QUARTER but it's not";
		String expectedState = NO_QUARTER;
		assertExpectedState(gumballMachine, errorMessage, expectedState);
	}
	
	@Test
	public void testGumballMachineStateChangesToNoQuarterAfterInsertingQuarterAndEjectingQuarter() {
		GumBallMachine gumballMachine = new GumBallMachine(5);
		gumballMachine.insertQuarter();
		gumballMachine.ejectQuarter();
		String errorMessage = "The State of the GumBall Machine is expected to be in NO_QUARTER but it's not";
		String expectedState = NO_QUARTER;
		assertExpectedState(gumballMachine, errorMessage, expectedState);
	}
	
	@Test
	public void testGumballMachineWith2BallsToSoldOut() {
		GumBallMachine gumballMachine = new GumBallMachine(2);
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		String errorMessage = "The State of the GumBall Machine is expected to be in SOLD_OUT but it's not";
		String expectedState = SOLD_OUT;
		assertExpectedState(gumballMachine, errorMessage, expectedState);
	}

}
