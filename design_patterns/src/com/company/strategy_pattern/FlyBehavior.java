package com.company.strategy_pattern;

//public class FlyBehavior {
//}


public interface FlyBehavior{
    public void fly();
}
class FlyWithWings implements FlyBehavior{
    public void fly(){
        System.out.println("i'm flying!");
    }
}
class FlyNoWay implements FlyBehavior{
    public void fly(){
        System.out.println("i can't fly");
    }
}