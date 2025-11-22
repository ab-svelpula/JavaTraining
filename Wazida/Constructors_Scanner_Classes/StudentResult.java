package constructors_scanner_classes;

import java.util.Scanner;

public class StudentResult {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the student marks");
		int total = s.nextInt();
		if(total>=35)
			System.out.println("Student passed");
		else
			System.out.println("student failed");
	}

}
