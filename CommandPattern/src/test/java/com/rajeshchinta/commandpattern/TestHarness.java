package com.rajeshchinta.commandpattern;

import org.junit.Test;

import com.rajeshchinta.commandpattern.commandobjects.CeilingFanHighSpeedCommand;
import com.rajeshchinta.commandpattern.commandobjects.CeilingFanOffCommand;
import com.rajeshchinta.commandpattern.commandobjects.CeilingLightOffCommand;
import com.rajeshchinta.commandpattern.commandobjects.CeilingLightOnCommand;
import com.rajeshchinta.commandpattern.commandobjects.Command;
import com.rajeshchinta.commandpattern.commandobjects.MacroCommand;
import com.rajeshchinta.commandpattern.commandobjects.NoCommand;
import com.rajeshchinta.commandpattern.commandobjects.OutDoorLightOffCommand;
import com.rajeshchinta.commandpattern.commandobjects.OutDoorLightOnCommand;
import com.rajeshchinta.commandpattern.commandobjects.StereoOffCommand;
import com.rajeshchinta.commandpattern.commandobjects.StereoOnCommand;
import com.rajeshchinta.commandpattern.devices.CeilingFan;
import com.rajeshchinta.commandpattern.devices.CeilingLight;
import com.rajeshchinta.commandpattern.devices.OutDoorLight;
import com.rajeshchinta.commandpattern.devices.Stereo;

public class TestHarness {
	
	@Test
	public void testRemoteControl() {
		
		RemoteControl remoteControl = new RemoteControl();
		
		CeilingFan ceilingFan = new CeilingFan();
		CeilingLight ceilingLight = new CeilingLight();
		OutDoorLight outDoorLight = new OutDoorLight();
		Stereo stereo = new Stereo();
		
		CeilingFanHighSpeedCommand ceilingFanHighSpeedCommand = 
				new CeilingFanHighSpeedCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = 
				new CeilingFanOffCommand(ceilingFan);
		
		CeilingLightOnCommand ceilingLightOnCommand = 
				new CeilingLightOnCommand(ceilingLight);
		CeilingLightOffCommand ceilingLightOffCommand = 
				new CeilingLightOffCommand(ceilingLight);
		
		OutDoorLightOnCommand outDoorLightOnCommand = 
				new OutDoorLightOnCommand(outDoorLight);
		OutDoorLightOffCommand outDoorLightOffCommand = 
				new OutDoorLightOffCommand(outDoorLight);
		
		StereoOnCommand stereoOnCommand = 
				new StereoOnCommand(stereo);
		StereoOffCommand stereoOffCommand =
				new StereoOffCommand(stereo);
		
		remoteControl.setCommand(0, ceilingFanHighSpeedCommand, ceilingFanOffCommand);
		remoteControl.setCommand(1, ceilingLightOnCommand, ceilingLightOffCommand);
		remoteControl.setCommand(2, outDoorLightOnCommand, outDoorLightOffCommand);
		remoteControl.setCommand(3, stereoOnCommand, stereoOffCommand);
		
		remoteControl.OnbuttonPressed(1);
		remoteControl.OffbuttonPressed(1);
		
		remoteControl.OnbuttonPressed(3);
		remoteControl.OffbuttonPressed(3);
	}
	
	@Test
	public void testUndo() {
		
		RemoteControl remoteControl = new RemoteControl();
		
		CeilingFan ceilingFan = new CeilingFan();
		CeilingLight ceilingLight = new CeilingLight();
		OutDoorLight outDoorLight = new OutDoorLight();
		Stereo stereo = new Stereo();
		
		CeilingFanHighSpeedCommand ceilingFanHighSpeedCommand = 
				new CeilingFanHighSpeedCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = 
				new CeilingFanOffCommand(ceilingFan);
		
		CeilingLightOnCommand ceilingLightOnCommand = 
				new CeilingLightOnCommand(ceilingLight);
		CeilingLightOffCommand ceilingLightOffCommand = 
				new CeilingLightOffCommand(ceilingLight);
		
		OutDoorLightOnCommand outDoorLightOnCommand = 
				new OutDoorLightOnCommand(outDoorLight);
		OutDoorLightOffCommand outDoorLightOffCommand = 
				new OutDoorLightOffCommand(outDoorLight);
		
		StereoOnCommand stereoOnCommand = 
				new StereoOnCommand(stereo);
		StereoOffCommand stereoOffCommand =
				new StereoOffCommand(stereo);
		
		remoteControl.setCommand(0, ceilingFanHighSpeedCommand, ceilingFanOffCommand);
		remoteControl.setCommand(1, ceilingLightOnCommand, ceilingLightOffCommand);
		remoteControl.setCommand(2, outDoorLightOnCommand, outDoorLightOffCommand);
		remoteControl.setCommand(3, stereoOnCommand, stereoOffCommand);
		
		remoteControl.OnbuttonPressed(0);
		remoteControl.undoPreviousOperation();
	}
	
	@Test
	public void testMacroCommand() {
		
		RemoteControl remoteControl = new RemoteControl();
		
		CeilingFan ceilingFan = new CeilingFan();
		CeilingLight ceilingLight = new CeilingLight();
		Stereo stereo = new Stereo();
		
		CeilingFanHighSpeedCommand ceilingFanHighSpeedCommand = 
				new CeilingFanHighSpeedCommand(ceilingFan);
		
		CeilingLightOnCommand ceilingLightOnCommand = 
				new CeilingLightOnCommand(ceilingLight);
		
		StereoOnCommand stereoOnCommand = 
				new StereoOnCommand(stereo);
		
		Command[] commands = new Command[3];
		commands[0] = ceilingFanHighSpeedCommand;
		commands[1] = ceilingLightOnCommand;
		commands[2] = stereoOnCommand;
		
		
		MacroCommand partyCommand = new MacroCommand(commands);
		
		remoteControl.setCommand(0, partyCommand, new NoCommand());
		
		System.out.println("Party Command On..");
		remoteControl.OnbuttonPressed(0);
		
		System.out.println("Undoing the previous operation...");
		remoteControl.undoPreviousOperation();
	}

}
