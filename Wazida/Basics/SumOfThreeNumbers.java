package com.java.basic;

import java.util.Scanner;

public class SumOfThreeNumbers {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the first Number = ");
		int x = a.nextInt();
		System.out.println("Enter the second Number = ");
		int y = a.nextInt();
		System.out.println("Enter the third Number ");
		int z = a.nextInt();		
		int total = x+y+z;
		System.out.println("Sum of Three Numbers = "+total);
		
	}

}
