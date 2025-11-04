package com.assignment.controlstructures;

import java.util.Scanner;

/*Check Divisibility
Take a number as input and check whether it’s divisible by 5 and 11 or not.
*/
public class CheckDivisibility {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number, will tell you if it is divisible by 5 and 11");
		int num = sc.nextInt();
		
		if(num%5 ==0 && num%11==0)
			System.out.println("This number is divisible by 5 and 11");
		else
			System.out.println("This number is NOT divisible by 5 and 11");
		sc.close();
	}

}
