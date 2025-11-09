package com.accu.assignment.nov062025.exceptionHandling;

import java.util.Scanner;

public class ArithmaticExceptionWithFinally {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the numerator.");
		int a = scan.nextInt();
		System.out.println("Enter the denomenator.");
		int b = scan.nextInt();
		scan.close();
		int c = 0;
		try {
			c = a / b;
		} catch (Exception e) {
			System.out.println("Division by zero is not posible." + e.getMessage());
		}finally {
			System.out.println("Thank you for using our program.");
		}
		System.out.println("Result : " + c);
	}
}
