package com.accu.assignment.nov062025.exceptionHandling;

import java.util.Scanner;

public class ArithmaticException {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numerator.");
		double a = scan.nextDouble();
		System.out.println("Enter the denomenator.");
		double b = scan.nextDouble();
		scan.close();
		double c = 0;
		try {
			c = a / b;
		} catch (Exception e) {
			System.out.println("Division by zero is not posible." + e.getMessage());
		}
		System.out.println("Result : " + c);
	}
}
