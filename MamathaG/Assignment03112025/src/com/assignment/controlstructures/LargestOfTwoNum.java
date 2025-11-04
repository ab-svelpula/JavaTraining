package com.assignment.controlstructures;

import java.util.Scanner;

/*
Find the Largest of Two Numbers
Accept two numbers from the user and determine which one is greater. If both are equal, print a suitable message.
*/

public class LargestOfTwoNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a>b)
			System.out.println("The largest number is :"+a);
		else
			if(a<b)
			System.out.println("The largest number is :"+b);
			else
				System.out.println("Both numbers are equal.");
		sc.close();
	}

}
