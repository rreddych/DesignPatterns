package com.rajeshchinta.templatemethodpattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage{

	@Override
	protected void brew() {
		System.out.println("Steeped Tea Bag");
	}

	@Override
	protected void addCondiments() {
		System.out.println("Added Lemon");
	}
	
	// Overriding Hook method
	@Override
	protected boolean doesUserWantCondiments() throws IOException {
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));   
		   String str; 
		   System.out.println("Do you want to add lemon? y/n:");
		   str = obj.readLine();   
		    System.out.println(str);
		    
			if(str.equalsIgnoreCase("y"))
				return true;
			else
				return false;
		    
	}
	
}
