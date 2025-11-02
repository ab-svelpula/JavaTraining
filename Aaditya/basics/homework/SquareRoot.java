package com.aaditya.basics.homework;

import java.util.Scanner;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double num = sc.nextDouble();
		double root = Math.sqrt(num);
		System.out.println("the square root of your number is: "+root);
		sc.close();
	}
}
