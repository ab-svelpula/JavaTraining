package conditionalStatments;

import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter the total marks of the student");
		int total = s.nextInt();
		if(total>=75)
			System.out.println("Grade scored is A");
		else if(total>=60 && total<75)
			System.out.println("Grade scored is B");
		else if(total>=45 && total<60)
			System.out.println("Grade scored is C");
		else if(total>=35 && total<45)
			System.out.println("Grade scored is D");
		else
			System.out.println("Student failed");
			
	}

}
