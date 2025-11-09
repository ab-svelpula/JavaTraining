package com.accu.assignment.nov032025.ControlStatements;


public class NumberOfEvenandOdd {
	public static void main(String[] args) {
		int countOdd = 0;
		int countEven = 0;
		for(int i=1;i<=50;i++) {
			if(i%2==0)
				countEven++;
			else
				countOdd++;
		}
		System.out.println("Total even numbers = "+countEven);
		System.out.println("Total odd numbers = "+countOdd);
	}
}
