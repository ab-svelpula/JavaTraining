package conditionalStatments;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		int f=1;
		for(int i=1;i<=num;i++)
		{
			f*=i;
		}
		System.out.println("Factorial of a number is "+f);
	}
}
