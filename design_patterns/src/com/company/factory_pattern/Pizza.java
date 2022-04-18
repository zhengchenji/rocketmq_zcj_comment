package com.company.factory_pattern;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings =new ArrayList();
    void prepare(){
        System.out.println("Prepare "+name);
    }
    void bake(){
        System.out.println("Bake for 25 minutes");
    }
    void cut(){
        System.out.println("Cutting pizza");
    }
    void box(){
        System.out.println("Boxing...");
    }
    public String getName(){
        return name;
    }
}
