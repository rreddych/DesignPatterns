package com.rajeshchinta.commandpattern.commandobjects;

import com.rajeshchinta.commandpattern.devices.OutDoorLight;

public class OutDoorLightOnCommand implements Command {
	
	OutDoorLight outDoorLight = null;
	
	
	public OutDoorLightOnCommand(OutDoorLight outDoorLight) {
		this.outDoorLight = outDoorLight;
	}

	@Override
	public void execute() {
		this.outDoorLight.on();
	}

	@Override
	public void undo() {
		this.outDoorLight.off();
		
	}

}
