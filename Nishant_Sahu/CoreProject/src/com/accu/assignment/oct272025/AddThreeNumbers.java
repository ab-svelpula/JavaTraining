package com.accu.assignment.oct272025;

import java.util.Scanner;

public class AddThreeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number and hit enter");
		int number1 = scan.nextInt();            
		System.out.println("Enter 2nd number and hit enter");
		int number2 = scan.nextInt();
		System.out.println("Enter 3rd number and hit enter");
		int number3 = scan.nextInt();
		System.out.println("Sum of the entered numbers = "+(number1+number2+number3));
		scan.close();
	}
}
