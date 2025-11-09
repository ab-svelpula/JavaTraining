package com.accu.assignment.nov032025.ControlStatements;

import java.util.Scanner;

public class DivisibleBy5And11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number.");
		int number = scan.nextInt();
		scan.close();
		if (number % 5 == 0 && number % 11 == 0) {
			System.out.println(number +" is divisible by 5 and 11");
		}else {
			System.out.println(number +" is not divisible by 5 and 11");
		}
	}
}
