package com.company.strategy_pattern;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior=new Quack();
        flyBehavior=new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("i'm a real mallard duck");
    }
}
