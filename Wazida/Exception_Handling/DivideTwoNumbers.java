package ExceptionHandling;

import java.util.Scanner;

public class DivideTwoNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
		try {
			int c = a/b;
			System.out.println("a/b value is "+c);
		}
		catch(Exception e)
		{
			System.out.println("Division by zero is not allowed.");
		}
		
	}

}
