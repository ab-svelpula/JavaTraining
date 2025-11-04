package com.assignment.controlstructures;

import java.util.Scanner;

/*Check Leap Year
Input a year from the user and check whether it’s a leap year or not.
(Hint: A year is a leap year if it’s divisible by 4 but not by 100, or divisible by 400).
*/
public class CheckLeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year value");
		int year = sc.nextInt();
		
		if ((year%4 == 0 && year%100 !=0) || (year %400 ==0))
			System.out.println("The provided year is leap year.");
		else
			System.out.println("The provided year is not leap year");
		sc.close();
	}

}
