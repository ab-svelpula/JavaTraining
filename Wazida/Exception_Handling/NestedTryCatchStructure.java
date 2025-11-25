package ExceptionHandling;

import java.io.FileReader;

public class NestedTryCatchStructure {
	public static void main(String[] args)
	{
		try 
		{
			FileReader f = new FileReader("sample.txt");
		    System.out.println("File opened successfully!");
		    try {
		    	int a =10;
		    	int b=0;
		    	int c = a/b;
				System.out.println("a/b value is "+c);
		    }
		    catch(Exception e)
		    {
		    	System.out.println("Division by zero is not allowed.");
		    }
		}
		catch(Exception e)
		{
			System.out.println("File not found. Please check the path. ");
		}
	}

}
