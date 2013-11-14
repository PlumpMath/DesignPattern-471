package com.design.strategy;

public class FlyWithWings implements FlyingBehavior {

	@Override
	public void fly() {
		System.out.println("Fly with wings");
	}

}
