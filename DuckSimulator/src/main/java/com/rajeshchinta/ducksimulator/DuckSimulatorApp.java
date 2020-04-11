package com.rajeshchinta.ducksimulator;

import com.rajeshchinta.ducks.DecoyDuck;
import com.rajeshchinta.ducks.Duck;
import com.rajeshchinta.ducks.MallarDuck;
import com.rajeshchinta.ducks.RedHeadDuck;
import com.rajeshchinta.ducks.RubberDuck;
import com.rajeshchinta.ducks.WoodenDuck;

/**
 * Hello world!
 *
 */
public class DuckSimulatorApp 
{
    public static void main( String[] args )
    {
		Duck d = new MallarDuck();
		d.playAll();
		System.out.println("");

		d = new RedHeadDuck();
		d.playAll();
		System.out.println("");

		d = new RubberDuck();
		d.playAll();
		System.out.println("");

		d = new DecoyDuck();
		d.playAll();
		System.out.println("");

		d = new WoodenDuck();
		d.playAll();
		System.out.println("");
		 
    }
}
