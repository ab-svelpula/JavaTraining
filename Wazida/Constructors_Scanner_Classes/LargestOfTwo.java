package constructors_scanner_classes;

import java.util.Scanner;

public class LargestOfTwo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = s.nextInt();
		System.out.println("Enter the second number");
		int b= s.nextInt();
		if(a>b)
			System.out.println("Largest Number is "+a);
		else
			System.out.println("Largest Number is "+b);
	}

}
