package com.rajeshchinta.commandpattern.commandobjects;

import com.rajeshchinta.commandpattern.devices.OutDoorLight;

public class OutDoorLightOffCommand implements Command {
	
	OutDoorLight outDoorLight = null;
	
	
	public OutDoorLightOffCommand(OutDoorLight outDoorLight) {
		this.outDoorLight = outDoorLight;
	}

	@Override
	public void execute() {
		this.outDoorLight.off();
	}

	@Override
	public void undo() {
		this.outDoorLight.on();
	}

}
