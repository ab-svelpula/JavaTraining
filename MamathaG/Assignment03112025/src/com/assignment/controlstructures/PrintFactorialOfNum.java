package com.assignment.controlstructures;

import java.util.Scanner;

/*Print Factorial of a Number
Ask the user to enter a number and use a for loop to find its factorial (e.g., 5! = 1×2×3×4×5).
*/
public class PrintFactorialOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number, I will give you it's factorial.");
		int num = sc.nextInt();
		
		int fact = 1;
		for(int i=num ; i>0 ; i--)
		{
			fact = fact * i;
		}
		
		System.out.println("The Factorial of "+num+ " is "+fact);
		sc.close();
	}
}
