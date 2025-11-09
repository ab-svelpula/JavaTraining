package com.accu.assignment.oct302025.controlStatements;

import java.util.Scanner;

public class LargestNumberAmongTwo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if (num1 > num2) {
			System.out.println(num1 + " is the larger number.");
		} else if (num2 > num1) {
			System.out.println(num2 + " is the larger number.");
		}else {
			System.out.println(num2 + " is equal to "+num1);
		}
		scan.close();
	}
}
