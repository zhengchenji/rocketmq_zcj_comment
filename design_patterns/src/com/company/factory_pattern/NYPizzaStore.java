package com.company.factory_pattern;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else
            return null;

    }
}
