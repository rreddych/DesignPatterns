package com.rajeshchinta.commandpattern.commandobjects;

// Null Object , to prevent from checking null conditions, but this does nothing,
// could be handy in appropriate scenarios
public class NoCommand implements Command {
	
	public NoCommand() {
	}
	
	public void execute() {
	}

	@Override
	public void undo() {
	}

}
