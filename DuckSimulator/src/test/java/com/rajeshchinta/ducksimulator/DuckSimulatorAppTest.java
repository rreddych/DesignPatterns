package com.rajeshchinta.ducksimulator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rajeshchinta.behaviourimplementation.FlyWithRocket;
import com.rajeshchinta.behaviourimplementation.FlyWithWings;
import com.rajeshchinta.ducks.DecoyDuck;
import com.rajeshchinta.ducks.Duck;
import com.rajeshchinta.ducks.MallarDuck;
import com.rajeshchinta.ducks.RedHeadDuck;
import com.rajeshchinta.ducks.RocketDuck;
import com.rajeshchinta.ducks.RubberDuck;
import com.rajeshchinta.ducks.WoodenDuck;

/**
 * Unit test for simple App.
 */
public class DuckSimulatorAppTest 
{
    /**
     * Rigorous Test :-)
     */
	String quacking = "I am quacking";
	String squeaking = "I am squeaking";
	String flying = "I am flying";
	String notFlying = "I cannot fly";
	String rocketFlying = "I am flying with rocket speed";
	String  notQuacking = "I cannot quack";
	
	
    @Test
    public void mallarDuckSwimsAndQuacksAndFlies()
    {
    	Duck d = new MallarDuck();
    	String quackString = d.quack();
    	assertTrue("Mallar Duck quacking error", quackString.equalsIgnoreCase(quacking));
    	
    	String flyString = d.fly();
    	assertTrue("Mallar Duck flying error", flyString.equalsIgnoreCase(flying));
    }
    
    @Test
    public void redheadDuckSwimsAndQuacksAndFlies()
    {
    	Duck d = new RedHeadDuck();
    	String quackString = d.quack();
    	assertTrue("RedHead Duck quacking error", quackString.equalsIgnoreCase(quacking));
    	
    	String flyString = d.fly();
    	assertTrue("RedHead Duck flying error", flyString.equalsIgnoreCase(flying));
    }
    
    @Test
    public void rubberDuckSwimsAndSweaksAndDoesntFly()
    {
    	Duck d = new RubberDuck();
    	String quackString = d.quack();
    	assertTrue("Rubber Duck quacking error", quackString.equalsIgnoreCase(squeaking));
    	
    	String flyString = d.fly();
    	assertTrue("Rubber Duck flying error", flyString.equalsIgnoreCase(notFlying));
    }
    
    @Test
    public void decoyDuckSwimsAndSweaksAndDoesntFly()
    {
    	Duck d = new DecoyDuck();
    	String quackString = d.quack();
    	assertTrue("Decoy Duck quacking error", quackString.equalsIgnoreCase(squeaking));
    	
    	String flyString = d.fly();
    	assertTrue("Decoy Duck flying error", flyString.equalsIgnoreCase(notFlying));
    }
    
    @Test
    public void woodenDuckSwimsAndDoesntQuackandFly()
    {
    	Duck d = new WoodenDuck();
    	String quackString = d.quack();
    	assertTrue("Wooden Duck quacking error", quackString.equalsIgnoreCase(notQuacking));
    	
    	String flyString = d.fly();
    	assertTrue("Wooden Duck flying error", flyString.equalsIgnoreCase(notFlying));
    }
    
    @Test
    public void woodenDuckSetFlyBehaviourFlies()
    {
    	Duck d = new WoodenDuck();
    	String flyString = d.fly();
    	assertTrue("Wooden Duck flying error", flyString.equalsIgnoreCase(notFlying));
    	d.SetFlyBehaviour(new FlyWithWings());
    	flyString = d.fly();
    	assertTrue("Wooden Duck flying error", flyString.equalsIgnoreCase(flying));
    }
    
    @Test
    public void rocketDuckFliesWithRocketSpeed()
    {
    	Duck d = new RocketDuck();
    	d.SetFlyBehaviour(new FlyWithRocket());
    	String flyString = d.fly();
    	assertTrue("Rocket Duck flying error", flyString.equalsIgnoreCase(rocketFlying));
    }
    
    @Test
    public void duckCallQuacks()
    {
    	DuckCall dc = new DuckCall();
    	String quackString = dc.quack();
    	assertTrue("Duck Call quacking error", quackString.equalsIgnoreCase(quacking));
    }
    
    
}
