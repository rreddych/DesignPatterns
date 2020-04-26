package com.rajeshchinta.adapterpattern.turkey;

public class WildTurkey implements Turkey {

	@Override
	public void gooble() {
		System.out.println("Wild Turkey goobling");

	}

	@Override
	public void fly() {
		System.out.println("Wild Turkey flying");
	}

}
