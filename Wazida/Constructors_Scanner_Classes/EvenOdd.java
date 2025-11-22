package constructors_scanner_classes;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = s.nextInt();
		if(number%2==0)
			System.out.println("Given number "+number+" is even number");
		else
			System.out.println("Given number "+number+" is an odd number");
		
	}

}
