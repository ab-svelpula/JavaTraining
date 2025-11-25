package ExceptionHandling;

import java.util.Scanner;

public class MultipleCatch {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter the value of a ");
			int a = s.nextInt();
			System.out.println("Enter the value of b ");
			int b = s.nextInt();
			int c = a/b;
			System.out.println("a/b value is "+c);
		}
		catch(Exception e)
		{
			System.out.println("Division is not applicable for given values");
		}
		try {
			int a[]= {1,2,3,4,5};
			System.out.println("value is "+a[9]);
		}
		catch(Exception e) {
			System.out.println("Array is out of index");
		}
		finally {
			System.out.println("Program execution is completed");
		}
	}

}
