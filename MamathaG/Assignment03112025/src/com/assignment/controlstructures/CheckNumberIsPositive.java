package com.assignment.controlstructures;

import java.util.Scanner;

/*Check Positive, Negative, or Zero
Write a Java program that takes a number from the user and prints whether it is positive, negative, or zero using if–else conditions.*/

public class CheckNumberIsPositive 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		if(num > 0)
			System.out.println("The number is positive");
		else 
			if(num <0)
				System.out.println("The number is negative");
			else
				System.out.println("The number is zero");
		sc.close();
		
	}
	

}
