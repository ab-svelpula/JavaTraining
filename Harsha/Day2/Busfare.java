package com.harsha.day2;

public class Busfare extends  Vehicle{
    void calculatefare() {
        String from ="kukatpally";
        String to = "Hitech city";
        double fare = 100;
        double distance = 12;

        System.out.println("The Bus fare for "+distance+" km is "+fare+" rs");
    }
}
