package com.rajeshchinta.commandpattern.commandobjects;

import com.rajeshchinta.commandpattern.devices.CeilingFan;

public class CeilingFanHighSpeedCommand implements Command {
	
	CeilingFan ceilingFan;
	public CeilingFanHighSpeedCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		this.ceilingFan.high();
	}

	@Override
	public void undo() {
		this.ceilingFan.off();
	}

}
