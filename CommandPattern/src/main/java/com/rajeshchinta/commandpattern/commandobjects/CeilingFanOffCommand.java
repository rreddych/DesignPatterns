package com.rajeshchinta.commandpattern.commandobjects;

import com.rajeshchinta.commandpattern.devices.CeilingFan;

public class CeilingFanOffCommand implements Command {
	
	CeilingFan ceilingFan;
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		this.ceilingFan.off();
	}

	@Override
	public void undo() {
		this.ceilingFan.high();
		
	}

}
