package com.assignment.controlstructures;

import java.util.Scanner;

/*Check Eligibility to Vote
Input the user’s age and display whether the person is eligible to vote or not (eligible if age ≥ 18).
*/
public class CheckEligibilityToVote 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age of the candidate.");
		int age = sc.nextInt();
		
		if(age>=18)
			System.out.println("The candidate is eligible to vote.");
		else
			System.out.println("The candidate is not eligible to vote.");
		sc.close();
	}

}
