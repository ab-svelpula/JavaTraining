package ExceptionHandling;

import java.util.Scanner;

public class FinallyBlockDemo {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter first number");
			int a = s.nextInt();
			System.out.println("Enter second number");
			int b = s.nextInt();
			int c = a/b;
			System.out.println("Division of two numbers is "+c);
		}
		catch(Exception e)
		{
			System.out.println("Division is not possible for the given number");
		}
		finally
		{
			System.out.println("Thank you for using our program.");
		}
	}

}
