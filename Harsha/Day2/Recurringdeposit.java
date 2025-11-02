package com.harsha.day2;

public class Recurringdeposit extends Account{
    void showbalance(){
        double r=7;
        double amount = p * Math.pow((1 + (r / 100)), t);
        System.out.println("Total amount RD: "+amount);
    }
}
