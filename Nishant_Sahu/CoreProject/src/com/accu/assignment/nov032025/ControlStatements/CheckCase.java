package com.accu.assignment.nov032025.ControlStatements;

import java.util.Scanner;

public class CheckCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an english alphabet character.");
		String character = scan.next();
		scan.close();
		int charValue = character.charAt(0);
		if (charValue >= 65 && charValue <= 90) {
			System.out.println(character.charAt(0) + " is in uppper case.");
		} else if (charValue >= 97 && charValue <= 122) {
			System.out.println(character.charAt(0) + " is in lower case.");
		} else {
			System.out.println(character.charAt(0) + " is not an english alphabet.");
		}
	}

}
