package com.harsha.day2;

public class Gsttax extends Tax{

    void calculatetax() {
        double price=10000;
        double gstRate=18;

        double gstAmount = (price * gstRate) / 100;
        double finalPrice = price + gstAmount;
        System.out.println("The final amount after gst: "+finalPrice+" rs");


    }
}
