package conditionalStatments;

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Letter");
		char ch = s.next().charAt(0);
		if(ch =='a' || ch =='A')
			System.out.println("Vowel letter");
		else if(ch =='e' || ch =='E')
			System.out.println("Vowel letter");
		else if(ch =='i' || ch =='I')
			System.out.println("Vowel letter");
		else if(ch =='o' || ch =='O')
			System.out.println("Vowel letter");
		else if(ch =='u' || ch =='U')
			System.out.println("Vowel letter");
		else
			System.out.println("consonant letter");
			
		
	}

}
