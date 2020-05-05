package com.rajeshchinta.withoutstatepattern;

public class GumBallMachine {

	final String NO_QUARTER = "NoQuarterState";
	final String HAS_QUARTER = "HasQuarterState";
	final String SOLD = "Sold";
	final String SOLD_OUT = "SoldOut";

	public GumBallMachine(int ballCount) {
		this.ballCount = ballCount;
	}

	String state = "NoQuarterState";
	int ballCount = 0;

	public int getBallCount() {
		return ballCount;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void insertQuarter() {
		if(this.state.equalsIgnoreCase(HAS_QUARTER)) {
			System.out.println("There is already a Quarter");
		}else {
			System.out.println("Inserted a Quarter");
			this.state = HAS_QUARTER;
		}
	}

	public void turnCrank() {
		System.out.println("Turned Crank.");
		if (this.state.equalsIgnoreCase(HAS_QUARTER)) {
			System.out.println("Dispensing gumball !!");
			this.state = SOLD;
			dispense();
		} else if (this.state.equalsIgnoreCase(NO_QUARTER)) {
			System.out.println("Please insert a quarter first");
		}

	}

	private void dispense() {
		if(this.state.equalsIgnoreCase(SOLD_OUT)) {
			System.out.println("All Balls Sold out!!");
		}
		
		if (this.state.equalsIgnoreCase(SOLD)) {
			if (this.ballCount > 0) {
				System.out.println("Dispensed GumBall.");
				state = NO_QUARTER;
				this.ballCount--;
				if(ballCount == 0) {
					state = SOLD_OUT;
					System.out.println("All Balls Sold out!!");
				}
			} else {
				state = SOLD_OUT;
				System.out.println("All Balls Sold out!!");
			}
		} else {
			System.out.println("Cannot Dispense GumBall as the machine's state is not in SOLD.");
		}

	}

	public void ejectQuarter() {
		if(this.state.equalsIgnoreCase(HAS_QUARTER) ) {
			this.state = NO_QUARTER;
			System.out.println("Ejected Quarter.");
		}else if(this.state.equalsIgnoreCase(NO_QUARTER)) {
			System.out.println("No Quarter is present");
		}
		
	}
}
