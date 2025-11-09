package com.accu.assignment.nov032025.ControlStatements;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an english alphabet character.");
		String character = scan.next();
		scan.close();
		int charValue = character.charAt(0);
		if ((charValue >= 65 && charValue <= 90) || (charValue >= 97 && charValue <= 122)) {
			if (character.charAt(0) == 'a' || character.charAt(0) == 'e' || character.charAt(0) == 'i'
					|| character.charAt(0) == 'o' || character.charAt(0) == 'u' || character.charAt(0) == 'A'
					|| character.charAt(0) == 'E' || character.charAt(0) == 'I' || character.charAt(0) == 'O'
					|| character.charAt(0) == 'U')
				System.out.println(character.charAt(0) + " is a vowel.");
			else
				System.out.println(character.charAt(0) + " is a consonant.");
		} else {
			System.out.println(character.charAt(0) + " is not an english alphabet.");
		}
	}

}
