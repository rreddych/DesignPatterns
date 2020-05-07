package com.rajeshchinta.remoteproxypattern.server;

import java.io.Serializable;

public interface State extends Serializable{
	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
	void refill(int ballCount);
}
