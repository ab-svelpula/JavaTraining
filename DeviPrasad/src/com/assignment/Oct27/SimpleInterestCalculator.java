package com.assignment.Oct27;

/*Write a Java program to calculate simple interest.
(Formula: SI = (P × T × R) / 100)*/

 public class SimpleInterestCalculator {
    public static void main(String[] args) {
        double principal = 10000.0;
        double time = 2.5;
        double rate = 5.0;

        double simpleInterest = (principal * time * rate) / 100;

        System.out.println("Principal: " + principal);
        System.out.println("Time (years): " + time);
        System.out.println("Rate (%): " + rate);
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
