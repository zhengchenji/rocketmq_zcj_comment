package com.company.strategy_pattern;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }

    @Override
    public void display() {
        System.out.println("i'm a model duck");
    }
}
