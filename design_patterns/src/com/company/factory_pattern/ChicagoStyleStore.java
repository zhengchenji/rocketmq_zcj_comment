package com.company.factory_pattern;

public class ChicagoStyleStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else{
            return null;
        }

    }
}
