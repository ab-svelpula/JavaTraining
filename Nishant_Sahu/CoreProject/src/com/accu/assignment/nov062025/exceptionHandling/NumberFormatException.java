package com.accu.assignment.nov062025.exceptionHandling;

import java.util.Scanner;

public class NumberFormatException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string.");
		String line = "";
		try {
			line = scan.nextLine();
			scan.close();
			System.out.println("Integer of the given string: "+Integer.parseInt(line));
		} catch (Exception e) {
			System.out.println("Only digits are accepted. \n"+e.getMessage());
		}
	}

}
