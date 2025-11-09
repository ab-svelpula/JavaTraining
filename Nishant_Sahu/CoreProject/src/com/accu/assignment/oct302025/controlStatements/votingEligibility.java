package com.accu.assignment.oct302025.controlStatements;

import java.util.Scanner;

public class votingEligibility {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		scan.close();
		if (age >= 18) {
			System.out.println("Person is eligible to vote.");
		} else if (age < 18 || age >= 1) {
			System.out.println("Person is not eligible to vote.");
		} else {
			System.out.println("Invalid age.");
		}

	}

}
