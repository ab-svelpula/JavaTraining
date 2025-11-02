package com.aaditya.basics.homework;
import java.util.Scanner;
public class LargestOfTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		double a = sc.nextDouble();
		System.out.println("Enter the second number");
		double b = sc.nextDouble();
		if (a>b) {
			System.out.println("The first number is greater");
		}
		else if(b>a) {
			System.out.println("The second number is greater");
		}
		
		else {
			System.out.println("Both numbers are equal");
		}
		sc.close();
	}
}
