package com.java.basic;
public class CalculateSimpleInterest {
	public static void main(String[] args) {
	int Principle = 100;
	int rate = 2;
	int time = 3;
	int SimpleInterest = (Principle*rate*time) /100;
	System.out.println("Given Principle amount = "+ Principle);
	System.out.println("Given Rate = "+ rate);
	System.out.println("Given Time = "+time);
	System.out.println("Simple interest is "+ SimpleInterest);
		
	}

}
