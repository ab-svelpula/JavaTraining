package conditionalStatments;

import java.util.Scanner;

public class Divisibility {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		if(num%5==0 && num%11==0)
			System.out.println("Given number is divisible by both 5 anf 11");
		else
			System.out.println("Given number is not divisible by 5 and 11");
	}

}
