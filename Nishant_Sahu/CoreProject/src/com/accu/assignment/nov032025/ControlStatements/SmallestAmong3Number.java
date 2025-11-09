package com.accu.assignment.nov032025.ControlStatements;

import java.util.Scanner;

public class SmallestAmong3Number {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if (num1 < num2 && num1 < num3) {
			System.out.println(num1 + " is the smallest number.");
		} else if (num2 < num1 && num2 < num3) {
			System.out.println(num2 + " is the smalest number.");
		} else {
			System.out.println(num3 + " is the smallest number.");
		}
		scan.close();
	}
}
