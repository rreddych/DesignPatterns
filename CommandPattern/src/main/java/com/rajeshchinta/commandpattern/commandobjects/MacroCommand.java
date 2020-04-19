package com.rajeshchinta.commandpattern.commandobjects;

public class MacroCommand implements Command {
	
	private Command[] commands = new Command[2];
	
	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		for(int i=0; i< commands.length; i++) {
			this.commands[i].execute();
		}

	}

	@Override
	public void undo() {
		for(int i=0; i< commands.length; i++) {
			this.commands[i].undo();
		}

	}

}
