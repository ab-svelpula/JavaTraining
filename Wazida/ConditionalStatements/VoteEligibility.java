package conditionalStatments;

import java.util.Scanner;

public class VoteEligibility {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = s.nextInt();
		if(age>=18)
			System.out.println("you are eligible for the vote");
		else
			System.out.println("You are not eligible for the vote");
	}

}
