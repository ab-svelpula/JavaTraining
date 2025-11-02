package com.harsha.day2;

public class Carfare extends Vehicle{

    void calculatefare() {
        String from ="kukatpally";
        String to = "Hitech city";
        double fare = 340;
        double distance = 12;

        System.out.println("The car fare for "+distance+" km is "+fare+" rs");
    }
}
