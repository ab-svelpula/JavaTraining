package ExceptionHandling;

import java.util.Scanner;

public class InvalidAgeException {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = s.nextInt();
		try {
			
			if(age>=18)
				System.out.println("Eligible to register");
			else
				System.out.println("Age must be 18 or above to register.");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
