package com.rajeshchinta.commandpattern;

import org.junit.Test;

import com.rajeshchinta.commandpattern.devices.CeilingFan;
import com.rajeshchinta.commandpattern.devices.CeilingLight;
import com.rajeshchinta.commandpattern.devices.OutDoorLight;
import com.rajeshchinta.commandpattern.devices.Stereo;

public class TestHarness {
	
	@Test
	public void testRemoteControlWithLambdaExpressions() {
		
		RemoteControl remoteControl = new RemoteControl();
		
		CeilingFan ceilingFan = new CeilingFan();
		CeilingLight ceilingLight = new CeilingLight();
		OutDoorLight outDoorLight = new OutDoorLight();
		Stereo stereo = new Stereo();
		
		// CommandObjects implemented with lamda expressions
		remoteControl.setCommand(0, () -> {ceilingFan.on(); }, () -> {ceilingFan.off(); });
		remoteControl.setCommand(1, () -> {ceilingLight.on();}, () -> {ceilingLight.off();});
		remoteControl.setCommand(2, () -> {outDoorLight.on();}, () -> {outDoorLight.off();});
		remoteControl.setCommand(3, () -> {stereo.on();}, () -> {stereo.off();});

		remoteControl.OnbuttonPressed(0);
		remoteControl.OffbuttonPressed(0);
		remoteControl.OnbuttonPressed(1);
		remoteControl.OffbuttonPressed(1);
		remoteControl.OnbuttonPressed(2);
		remoteControl.OffbuttonPressed(2);
		remoteControl.OnbuttonPressed(3);
		remoteControl.OffbuttonPressed(3);
	}
	
	
	//Method reference is a shorthand notation of a lambda expression to call a method
	
	@Test
	public void testRemoteControlWithMethodReferences() {
		
		RemoteControl remoteControl = new RemoteControl();
		
		CeilingFan ceilingFan = new CeilingFan();
		CeilingLight ceilingLight = new CeilingLight();
		OutDoorLight outDoorLight = new OutDoorLight();
		Stereo stereo = new Stereo();
		
		// CommandObjects implemented with lamda expressions specified int he form of method references.
		remoteControl.setCommand(0, ceilingFan::on, ceilingFan::off);
		remoteControl.setCommand(1, ceilingLight::on, ceilingLight::off);
		remoteControl.setCommand(2, outDoorLight::on, outDoorLight::off);
		remoteControl.setCommand(3, stereo::on, stereo::off);

		remoteControl.OnbuttonPressed(0);
		remoteControl.OffbuttonPressed(0);
		remoteControl.OnbuttonPressed(1);
		remoteControl.OffbuttonPressed(1);
		remoteControl.OnbuttonPressed(2);
		remoteControl.OffbuttonPressed(2);
		remoteControl.OnbuttonPressed(3);
		remoteControl.OffbuttonPressed(3);
	}
}
