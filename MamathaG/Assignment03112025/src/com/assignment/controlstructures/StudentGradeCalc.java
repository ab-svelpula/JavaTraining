package com.assignment.controlstructures;

import java.util.Scanner;

/*Student Grade Calculation
Accept a student’s average marks and display their grade:
A if marks ≥ 75
B if marks ≥ 60
C if marks ≥ 45
D if marks ≥ 35
ail otherwise.*/

public class StudentGradeCalc 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your total average of your marks, that should be in between  1- 100. We will tell your grade.");
		
		int avg = sc.nextInt();
		
		if (avg >=75)
			System.out.println("Your grade is A");
		else
			if(avg>=60)
				System.out.println("Your grade is B");
			else
				if(avg >=45)
					System.out.println("Your grade is C");
				else
					if(avg>=35)
						System.out.println("Your grade is D");
					else
						System.out.println("Sorry! you are fail.");
		sc.close();
	}

}
