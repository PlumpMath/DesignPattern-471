package com.design.decorator;

public abstract class Beverage {
	
	String description = "Beverage";
	
	public abstract double cost();
	
	public String getDescription(){
		return description;
	}

}
