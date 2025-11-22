package conditionalStatments;

import java.util.Scanner;

public class NumberType {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int a= s.nextInt();
		if(a>0)
			System.out.println("Given number is positive");
		else if(a<0)
			System.out.println("Given number is negative");
		else
			System.out.println("Given number is zero");
	}

}
