package constructors_scanner_classes;

import java.util.Scanner;

public class NumberTypeMain {
	public static void main(String[] args)
	{
		
		System.out.println("Enter the number ");
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		NumberType n = new NumberType();
		n.checkNumber(a);
		
	}
}
