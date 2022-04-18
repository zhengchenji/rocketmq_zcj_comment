package com.company.strategy_pattern;

public class MiniDuckSimulator {

    public static void main(String[] args) {
	// write your code here
        Duck mallard=new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model=new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}



