package com.rajeshchinta.component;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rajeshchinta.decorator.Cardimam;
import com.rajeshchinta.decorator.Ginger;

public class TestHarness {
	@Test
	public void testStrongTeaWithCardimumCost() {
		Cardimam cardimamStrongTea = new Cardimam(new StrongTea());
		double cost = cardimamStrongTea.getCost();
		String desc = cardimamStrongTea.getDescription();
		assertTrue(cost == 19);
		assertTrue(desc.equalsIgnoreCase("StrongTea-Cardimam"));
	}
	
	@Test
	public void testStrongTeaWithCardimumPlusGingerCost() {
		Cardimam cardimamStrongTea = new Cardimam(new StrongTea());
		Ginger gingerCardimumStrongTea = new Ginger(cardimamStrongTea);
		double cost = gingerCardimumStrongTea.getCost();
		String desc = gingerCardimumStrongTea.getDescription();
		assertTrue(cost == 21);
		assertTrue(desc.equalsIgnoreCase("StrongTea-Cardimam-Ginger"));
	}
	
	@Test
	public void testLightTeaWithPlusGingerCost() {
		Ginger gingerLightTea = new Ginger(new LightTea());
		double cost = gingerLightTea.getCost();
		String desc = gingerLightTea.getDescription();
		assertTrue(cost == 12);
		assertTrue(desc.equalsIgnoreCase("LightTea-Ginger"));
	}
}
