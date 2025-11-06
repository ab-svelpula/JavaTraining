package com.java.basic;

import java.util.Scanner;

public class CubeOfNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value = ");
		int number = scanner.nextInt();
		int cube = number*number*number;
		System.out.println("Given Number is = "+number);
		System.out.println("Cube of the given number is = "+cube);
		
	}
}
