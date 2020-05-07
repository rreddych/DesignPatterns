package com.rajeshchinta.remoteproxypattern.client;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.rajeshchinta.remoteproxypattern.server.GumBallMachineRemote;

public class GumBallMachineClientTestDrive {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);
		GumBallMachineRemote gumBallMachine = (GumBallMachineRemote) registry.lookup("mightygumballsHYD");
		GumBallMonitor gumBallMonitor = new GumBallMonitor(gumBallMachine);
		gumBallMonitor.report();
	}

}
