package com.assignment.controlstructures;

import java.util.Scanner;

/*
Check Even or Odd
Ask the user for a number and check if it’s even or odd using the modulus operator (%).*/

public class CheckEvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		if(num%2 == 0)
			System.out.println("The given number is Even");
		else
			System.out.println("The given number is Odd");
		sc.close();
		
	}

}
