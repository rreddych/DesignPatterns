package com.rajeshchinta.remoteproxypattern.client;

import java.rmi.RemoteException;

import com.rajeshchinta.remoteproxypattern.server.GumBallMachineRemote;

public class GumBallMonitor {
	
	GumBallMachineRemote gumBallMachine = null;
	
	public GumBallMonitor(GumBallMachineRemote gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
		
	}
	
	public void report() throws RemoteException {
		System.out.println("Ball Count: "+ this.gumBallMachine.getBallCount());
		System.out.println("Location : "+ this.gumBallMachine.getLocation());
		System.out.println("State : "+ this.gumBallMachine.getState());
	}
}
