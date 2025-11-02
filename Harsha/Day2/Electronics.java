package com.harsha.day2;

public class Electronics extends Product{

    void calculatediscount(){

        System.out.println("Entered product name: "+productname);
        System.out.println("Entered product price: "+productprice);

        double discount= productprice* 0.5;
        System.out.println("electronic discount: "+discount);

    }
}
