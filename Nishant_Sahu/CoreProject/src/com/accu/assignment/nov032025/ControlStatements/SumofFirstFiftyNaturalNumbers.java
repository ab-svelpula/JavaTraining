package com.accu.assignment.nov032025.ControlStatements;


public class SumofFirstFiftyNaturalNumbers {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=50;i++) {
			sum +=i;
		}
		System.out.println("Sum = "+sum);
	}
}
