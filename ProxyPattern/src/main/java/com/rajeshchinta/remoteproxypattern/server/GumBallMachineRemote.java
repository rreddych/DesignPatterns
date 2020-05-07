package com.rajeshchinta.remoteproxypattern.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumBallMachineRemote extends Remote{
	public int getBallCount()  throws RemoteException;
	public String getLocation()  throws RemoteException;
	public State getState()  throws RemoteException;
}
