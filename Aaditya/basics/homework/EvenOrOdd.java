package com.aaditya.basics.homework;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double num = sc.nextDouble();
		if (num==0) {
			System.out.println("Neither even nor odd");
		}
		else if (num%2==0) {
			System.out.println("Even");
		}
		else
			System.out.println("Odd");
		sc.close();
	}
}
