package com.design.strategy;

public class FlyWithoutWings implements FlyingBehavior{

	@Override
	public void fly() {
		System.out.println("Flying without wings");
		
	}

}
