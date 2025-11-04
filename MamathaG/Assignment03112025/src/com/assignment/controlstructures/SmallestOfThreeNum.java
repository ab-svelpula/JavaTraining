package com.assignment.controlstructures;

import java.util.Scanner;

/*Smallest of Three Numbers
Input three numbers and print which one is the smallest using nested if–else conditions.
*/
public class SmallestOfThreeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 3 numbers :");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1 < num2 && num1 < num3)
			System.out.println("The smallest number is : "+num1);
		else
			if(num2 < num3)
				System.out.println("The smallest number is : "+num2);
			else
				System.out.println("The smallest number is :"+num3);
		sc.close();
	}

}
