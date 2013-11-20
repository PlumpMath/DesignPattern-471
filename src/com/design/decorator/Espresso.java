package com.design.decorator;

public class Espresso extends Beverage {

	public Espresso () {
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}
	
	@Override
	public String getDescription() {
		return this.description;
	}

}
