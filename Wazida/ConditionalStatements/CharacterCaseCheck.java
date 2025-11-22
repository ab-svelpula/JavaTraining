package conditionalStatments;

import java.util.Scanner;

public class CharacterCaseCheck {
	public static void main(String[] args)
	{  
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single alphabet: ");
        char ch = sc.next().charAt(0); // Read first character

        if (ch >= 65 && ch <= 90) { // ASCII range for A-Z
            System.out.println("Uppercase");
        } else if (ch >= 97 && ch <= 122) { // ASCII range for a-z
            System.out.println("Lowercase");
        } else {
            System.out.println("Not an alphabet");
        }

	}

}
