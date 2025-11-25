package ExceptionHandling;

import java.util.Scanner;

public class NumberFormatException {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		
		try {
			String input = s.next();
			Integer.parseInt(input);
			System.out.println("Given input is "+input);
		}
		catch(Exception e)
		{
			System.out.println("Please enter digits only.");
		}
	}

}
