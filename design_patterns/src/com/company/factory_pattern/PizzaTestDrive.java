package com.company.factory_pattern;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore=new NYPizzaStore();
        PizzaStore chicagoStore=new ChicagoStyleStore();

        Pizza pizza=nyStore.orderPizza("cheese");
        System.out.println(pizza.getName());

        pizza=chicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName());

    }
}
