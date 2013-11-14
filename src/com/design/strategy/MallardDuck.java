package com.design.strategy;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackingBehaviour = new Quack();
		flyingBehavior = new FlyWithWings();
	}

	/**
	 * In the main method we are changing the flying behaviour at runtime of the duck. This is possible only 
	 * 'cos HAS-A relationship b/w DUCK and Behaviours instead IS-A relationship
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();
		duck.setflyingBehaviour(new FlyWithoutWings());
		duck.performFly();
	}

}
