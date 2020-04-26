package com.rajeshchinta.adapterpattern.duck;

import com.rajeshchinta.adapterpattern.turkey.Turkey;

public class DuckAdapter implements Turkey {
	
	MallarDuck mallarDuck= null;

	public DuckAdapter(MallarDuck mallarDuck) {
		this.mallarDuck = mallarDuck;
	}

	@Override
	public void gooble() {
		this.mallarDuck.quack();

	}

	@Override
	public void fly() {
		this.mallarDuck.fly();
	}

}
