package com.accu.assignment.nov032025.ControlStatements;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to generate it's multiplication table.");
		int number = scan.nextInt();
		scan.close();
		for(int i=1;i<=10;i++) {
			System.out.println(number+" x "+i+" = "+(number*i));
		}
	}
}
