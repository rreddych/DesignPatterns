package com.rajeshchinta.remoteproxypattern.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class GumBallMachineServerTestDrive {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		System.out.println("Starting GumBallMachineServerTestDrive..");
		String name = "mightygumballsHYD";
		GumBallMachine gumBallMachine = new GumBallMachine(10, name);
		System.out.println("Loaded gumBall machine with 10 balls");
		gumBallMachine.insertQuarter();
		gumBallMachine.turnCrank();
		gumBallMachine.insertQuarter();
		
		GumBallMachineRemote gumBallMachineRemote = gumBallMachine;
		
		Registry registry = LocateRegistry.createRegistry(1099);
		registry.rebind(name, gumBallMachineRemote);
		System.out.println("Name Rebind with RMI regitry completed.");
	}
}
