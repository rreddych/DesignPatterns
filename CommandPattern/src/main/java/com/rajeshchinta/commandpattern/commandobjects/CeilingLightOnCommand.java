package com.rajeshchinta.commandpattern.commandobjects;

import com.rajeshchinta.commandpattern.devices.CeilingLight;

public class CeilingLightOnCommand implements Command {
	
	CeilingLight ceilingLight;
	
	public CeilingLightOnCommand(CeilingLight ceilingLight) {
		this.ceilingLight = ceilingLight;
	}

	@Override
	public void execute() {
		this.ceilingLight.on();
	}

	@Override
	public void undo() {
		this.ceilingLight.off();
	}

}
