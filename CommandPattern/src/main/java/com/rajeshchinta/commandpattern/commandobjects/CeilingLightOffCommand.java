package com.rajeshchinta.commandpattern.commandobjects;

import com.rajeshchinta.commandpattern.devices.CeilingLight;

public class CeilingLightOffCommand implements Command {
	
	CeilingLight ceilingLight;
	
	public CeilingLightOffCommand(CeilingLight ceilingLight) {
		this.ceilingLight = ceilingLight;
	}

	@Override
	public void execute() {
		this.ceilingLight.dim(); // peculiar fan which needs to be dimmed before off :-)
		this.ceilingLight.off();
	}

	@Override
	public void undo() {
		this.ceilingLight.on();
		
	}
}
