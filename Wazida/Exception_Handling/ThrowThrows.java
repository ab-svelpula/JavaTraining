package ExceptionHandling;

import java.util.Scanner;

public class ThrowThrows {
	public static int marks;
	public class checkMarksException extends Exception{
		public checkMarksException(String message)
		{
			super(message);
		}
	}
	public void checkMarks() throws checkMarksException
	{
        
		if(marks>=35 && marks<=100)
			System.out.println("Student passed");
		else if(marks>100)
			throw new checkMarksException("Please enter valid marks between 0 to 100");
		else
			throw new checkMarksException("Student failed the test");
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the marks");
		marks = s.nextInt();
		ThrowThrows t = new ThrowThrows();
		try {
			t.checkMarks();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
