package conditionalStatments;

import java.util.Scanner;

public class SmallestNumberThree {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b = s.nextInt();
		System.out.println("Enter the third number");
		int c = s.nextInt();
		if(a<b && a<c)
			System.out.println("smallest number is "+a);
		else if(b<a && b<c)
			System.out.println("smallest number is "+b);
		else
			System.out.println("smallest number is "+c);
	}

}
