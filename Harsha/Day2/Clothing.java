package com.harsha.day2;

public class Clothing extends Product{
    void calculatediscount(){

        System.out.println("Entered product name: "+productname);
        System.out.println("Entered product price: "+productprice);

        double discount=productprice*0.20;
        System.out.println("Clothing discount: "+discount);
    }
}
