package com.harsha.day2;

public class Fixeddeposit extends Account{
    void showbalance(){
        double r=5;
        double amount = p * Math.pow((1 + (r / 100)), t);
        System.out.println("Total amount FD: "+amount);
    }
}
