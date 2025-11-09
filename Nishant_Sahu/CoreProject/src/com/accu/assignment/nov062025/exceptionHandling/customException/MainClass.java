package com.accu.assignment.nov062025.exceptionHandling.customException;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age.");
		try {
			if (scan.nextInt() < 18) {
				throw new InvalidAgeException("Your age must be 18 or above.");
			}else {
				System.out.println("You are elegible.");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e);
		} finally {
			scan.close();
		}

	}

}
