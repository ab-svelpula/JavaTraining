package com.java.basic;

public class LargestOfTwoNumbers {
	public static void main(String[] args) {
		int a= 10;
		int b = 40;
		System.out.println("Given numbers are "+a+","+b);
		if(a>b) {
			System.out.println("Largest Number is "+a);
		}
		else if(b>a){
			System.out.println("Largest Number is " +b);
		}
		else {
			System.out.println("Both numbers are equal");
		}
	}

}
