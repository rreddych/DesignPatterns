package com.rajeshchinta.templatemethodpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverage{

	@Override
	protected void brew() {
		System.out.println("Brewing coffee grinds");
		
	}

	@Override
	protected void addCondiments() {
		System.out.println("Added Milk and Sugar");
	}
	
	// Overriding Hook method
		@Override
		protected boolean userWantCondiments() throws IOException {
			BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));   
			   String str; 
			   System.out.println("Do you want to add milk and sugar? y/n:");
			   str = obj.readLine();   
			    System.out.println(str);
			    
				if(str.equalsIgnoreCase("y"))
					return true;
				else
					return false;
			    
		}

}
