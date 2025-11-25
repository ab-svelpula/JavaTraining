package ExceptionHandling;

public class NullPointerException {
	public static void main(String[] args)
	{
		
		try {
			String input = null;
			System.out.println(input.length());
		}
		catch(Exception e)
		{
			System.out.println("String is null; cannot find length.");
		}
	}

}
