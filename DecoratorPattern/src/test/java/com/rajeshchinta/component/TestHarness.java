package com.rajeshchinta.component;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rajeshchinta.decorator.Cardimam;
import com.rajeshchinta.decorator.Ginger;

public class TestHarness {
	@Test
	public void testStrongTeaWithCardimumCost() {
		Cardimam cardimam = new Cardimam(new StrongTea());
		double cost = cardimam.getCost();
		String desc = cardimam.getDescription();
		assertTrue(cost == 19);
		assertTrue(desc.equalsIgnoreCase("StrongTea-Cardimam"));
	}
	
	@Test
	public void testStrongTeaWithCardimumPlusGingerCost() {
		Cardimam cardimam = new Cardimam(new StrongTea());
		Ginger ginger = new Ginger(cardimam);
		double cost = ginger.getCost();
		String desc = ginger.getDescription();
		assertTrue(cost == 21);
		assertTrue(desc.equalsIgnoreCase("StrongTea-Cardimam-Ginger"));
	}
	
	@Test
	public void testLightTeaWithPlusGingerCost() {
		Ginger ginger = new Ginger(new LightTea());
		double cost = ginger.getCost();
		String desc = ginger.getDescription();
		assertTrue(cost == 12);
		assertTrue(desc.equalsIgnoreCase("LightTea-Ginger"));
	}
}
