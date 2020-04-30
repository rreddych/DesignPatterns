package com.rajeshchinta.templatemethodinjavaarrays;

public class Duck implements Comparable<Duck>{
	
	public Duck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	String name;
	int weight;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return name + " weighs " + weight + " gms";
	}

	//Arrays.sort implements a little variant of template method pattern nevertheless
	// the spirit of the template method is present
	// the sort method expects the object to implement the compareTo method, which is
	// called in it's algorithm at runtime
	@Override
	public int compareTo(Duck targetDuck) {
		if(this.weight <targetDuck.getWeight()) {
			return -1;
		}else if(this.weight == targetDuck.getWeight()) {
			return 0;
		}else {
			return 1;
		}
	}

}
