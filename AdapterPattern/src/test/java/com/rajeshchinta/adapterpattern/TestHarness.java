package com.rajeshchinta.adapterpattern;

import org.junit.Test;

import com.rajeshchinta.adapterpattern.duck.Duck;
import com.rajeshchinta.adapterpattern.duck.DuckAdapter;
import com.rajeshchinta.adapterpattern.duck.MallarDuck;
import com.rajeshchinta.adapterpattern.turkey.Turkey;
import com.rajeshchinta.adapterpattern.turkey.TurkeyAdapter;
import com.rajeshchinta.adapterpattern.turkey.WildTurkey;

public class TestHarness {
	
	@Test
	public void testDuck() {
		Duck duck = new MallarDuck();
		duck.quack();
		duck.fly();
	}
	
	@Test
	public void testTurkeyAdapter() {
		Duck duck = new TurkeyAdapter(new WildTurkey());
		duck.quack();
		duck.fly();
	}
	
	@Test
	public void testDuckAdapter() {
		Turkey turkey = new DuckAdapter(new MallarDuck());
		turkey.gooble();
		turkey.fly();
	}
		
		
}
