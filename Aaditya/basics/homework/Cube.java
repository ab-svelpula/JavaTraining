package com.aaditya.basics.homework;

import java.util.Scanner;

public class Cube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		double num = sc.nextDouble();
		System.out.println("Cube of the number is: "+num*num*num);
		sc.close();
	}
}
