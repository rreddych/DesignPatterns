package com.rajeshchinta.commandpattern.commandobjects;

import com.rajeshchinta.commandpattern.devices.Stereo;

public class StereoOffCommand implements Command {
	
	Stereo stereo;
	
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		this.stereo.off();
	}

	@Override
	public void undo() {
		this.stereo.on();
		
	}

}
