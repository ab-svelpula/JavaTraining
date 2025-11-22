package constructors_scanner_classes;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first Number ");
		int a = s.nextInt();
		System.out.println("Enter the second Number ");
		int b = s.nextInt();
		System.out.println("Enter the third Number ");
		int c= s.nextInt();
		int temp =0;
		if(a>b && a>c) {
			temp =a;
			System.out.println("Largest Number is "+temp);
		}
		else if(b>a && b>c) {
			temp =b;
			System.out.println("Largest Number is "+temp);
			
		}
		else if(c>a && c>b) {
			temp = c;
			System.out.println("Largest Number is "+temp);
		}
		else System.out.println("Please enter a valid number");
		
		
	}

}
