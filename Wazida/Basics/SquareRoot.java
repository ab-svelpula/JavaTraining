package com.java.basic;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number = ");
		int number = scanner.nextInt();
		double value = Math.sqrt(number);
		System.out.println("Square root of a given number is = "+ value);
		
	}

}
