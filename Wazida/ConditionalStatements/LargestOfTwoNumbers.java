package conditionalStatments;

import java.util.Scanner;

public class LargestOfTwoNumbers {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
		if(a>b)
			System.out.println(a+" is the largest number");
		else if(a<b)
			System.out.println(b+" is the largest number");
		else if(a==b)
			System.out.println(a+" and "+b+" are equal");
		else
			System.out.println("please enter a valid number");
			
	}

}
