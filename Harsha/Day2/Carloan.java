package com.harsha.day2;

public class Carloan extends Loan {
    void calculateemi(){
    double annualRate =8.4;
    double r = annualRate / 12 / 100;
    double emi = ((p * r * (double) Math.pow(1 + r, t)) )/ (double)(Math.pow(1 + r, t) - 1);
    System.out.println("Emi for car loan: "+emi);

}}
