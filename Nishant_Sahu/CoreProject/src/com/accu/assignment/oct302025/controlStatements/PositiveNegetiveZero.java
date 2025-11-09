package com.accu.assignment.oct302025.controlStatements;

import java.util.Scanner;

public class PositiveNegetiveZero {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = scan.nextInt();
		scan.close();
		if (number == 0) {
			System.out.println("Number is zero.");
		} else if (number > 0) {
			System.out.println("Number is positive.");
		} else {
			System.out.println("Number is negetive.");
		}
	}
}
