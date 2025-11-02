package com.aaditya.basics.homework;

import java.util.Scanner;

public class SumOfThreeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers: ");
		int total=0;
		for (int i = 0; i < 3; i++) {
			total+=sc.nextInt();
		}
		System.out.println("The total value is: "+total);
		sc.close();
	}
}
