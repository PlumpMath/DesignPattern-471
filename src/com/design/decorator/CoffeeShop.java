package com.design.decorator;

public class CoffeeShop {
	
	public static void main(String[] args) {
		
		Beverage beverage = new Espresso();
		
		beverage = new Mocha(beverage);
		
		beverage = new Mocha(beverage);
		
		System.out.println("Description" + beverage.getDescription());
		
		System.out.println("cost" + beverage.cost());
		
	}

}
