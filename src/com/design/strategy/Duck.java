package com.design.strategy;

public abstract class Duck {
	
	protected FlyingBehavior flyingBehavior;
	protected Quakingbehavior quackingBehaviour;
	
	public void display() {
		System.out.println("duck");
	}
	public void performFly() {
		flyingBehavior.fly();
	}
	public void performQuack() {
		quackingBehaviour.quack();
	}
	public void setflyingBehaviour(FlyingBehavior fb) {
		flyingBehavior = fb;
	}
	public void setQuakingBehavior(Quakingbehavior qb) {
		quackingBehaviour = qb;
	}

}
