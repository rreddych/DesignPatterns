package com.rajeshchinta.adapterpattern.turkey;

import com.rajeshchinta.adapterpattern.duck.Duck;

public class TurkeyAdapter implements Duck {
	Turkey turkey = null;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		this.turkey.gooble();

	}

	@Override
	public void fly() {
		for(int i = 0; i<5 ; i++)
		this.turkey.fly();
	}

}
