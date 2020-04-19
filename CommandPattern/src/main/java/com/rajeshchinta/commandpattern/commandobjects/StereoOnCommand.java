package com.rajeshchinta.commandpattern.commandobjects;

import com.rajeshchinta.commandpattern.devices.Stereo;

public class StereoOnCommand implements Command {
	
	Stereo stereo;
	
	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		this.stereo.on();
		this.stereo.setCD();
		this.stereo.setVolume();
	}

	@Override
	public void undo() {
		this.stereo.off();
	}

}
