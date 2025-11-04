package com.assignment.controlstructures;

import java.util.Scanner;

/*Print Multiplication Table
Ask the user for a number and print its multiplication table up to 10 using a for loop.
*/
public class MultiplicationTableOfNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number, I will share you the multiplication table of that.");
		int num = sc.nextInt();
		
		for (int i=1; i<=10 ; i++)
		{
			System.out.println(num+" * " +i +" = " + (num * i));
			sc.close();
		}
	}

}
