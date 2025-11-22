package conditionalStatments;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(num + "X" + i + "="+(num*i));
		}
	}

}
