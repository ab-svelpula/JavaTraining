package com.mrudula.assignmentone;

//Write a Java program to calculate simple interest. --> Used Instance variables concept

public class SimpleInterest {
	double P=10, T= 20, R = 30; 
	double SI;
	public static void main(String[] args) {
		SimpleInterest ar = new SimpleInterest();
		ar.SI = (ar.P * ar.T * ar.R) / 100;
		System.out.println("simple interest: " +ar.SI);
	}

}
