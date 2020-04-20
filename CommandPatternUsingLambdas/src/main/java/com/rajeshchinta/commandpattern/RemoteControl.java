package com.rajeshchinta.commandpattern;

import com.rajeshchinta.commandpattern.commandobjects.Command;

public class RemoteControl {
	
	private Command[] onCommands = new Command[4];
	private Command[] offCommands = new Command[4];
	
	public RemoteControl() {
		for(int i = 0 ; i < onCommands.length; i++) {
			onCommands[i] = () -> {};
			offCommands[i] = () -> {};
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void OnbuttonPressed(int slot) {
		this.onCommands[slot].execute();
	}
	
	public void OffbuttonPressed(int slot) {
		this.offCommands[slot].execute();
	}
}
