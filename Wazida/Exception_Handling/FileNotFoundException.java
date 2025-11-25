package ExceptionHandling;

import java.io.FileReader;

public class FileNotFoundException {
	public static void main(String[] args)
	{
		try {
			FileReader f = new FileReader("sample.txt");
		    System.out.println("File opened successfully!");
		        } 
		catch(Exception e)
		{
			System.out.println("File not found. Please check the path.");
		}

		}
	}

