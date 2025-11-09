package com.accu.assignment.nov032025.ControlStatements;

import java.util.Scanner;

public class FindFactorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find its factorial.");
		int number = scan.nextInt();
		scan.close();
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + number + " is " + factorial);
	}
}
