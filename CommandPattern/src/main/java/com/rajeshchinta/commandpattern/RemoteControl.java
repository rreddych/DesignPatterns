package com.rajeshchinta.commandpattern;

import com.rajeshchinta.commandpattern.commandobjects.Command;
import com.rajeshchinta.commandpattern.commandobjects.NoCommand;

public class RemoteControl {
	
	private Command[] onCommands = new Command[4];
	private Command[] offCommands = new Command[4];
	private Command previousCommand = null;
	private Command partyCommand = null;
	
	public RemoteControl() {
		NoCommand noCommand = new NoCommand();
		for(int i = 0 ; i < onCommands.length; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		
		this.previousCommand = noCommand;
		this.partyCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void OnbuttonPressed(int slot) {
		this.onCommands[slot].execute();
		this.previousCommand = this.onCommands[slot];
	}
	
	public void OffbuttonPressed(int slot) {
		this.offCommands[slot].execute();
		this.previousCommand = this.offCommands[slot];
	}
	
	public void undoPreviousOperation() {
		this.previousCommand.undo();
	}
	
	public void partyButtonPressed() {
		this.partyCommand.execute();
	}
}
