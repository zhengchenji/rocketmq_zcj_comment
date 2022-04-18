package com.company.factory_pattern;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name="Chicago Pizza";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut(){
        System.out.println("Cutting slices");
    }
}
