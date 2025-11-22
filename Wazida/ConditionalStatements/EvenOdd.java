package conditionalStatments;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		if(num%2==0)
			System.out.println("Given number is even number");
		else if(num%2!=0)
			System.out.println("Given number is an odd number");
		else
			System.out.println("Enter a valid number");
	}

}
