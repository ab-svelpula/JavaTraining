package ExceptionHandling;

public class ArrayIndexOutOfBoundsException {
	public static void main(String[] args)
	{
		
		try {
			int a[]= {10,12,13,14,15};
			System.out.println("First value is "+a[0]);
			System.out.println("second value is "+a[1]);
			System.out.println("Third value is "+a[2]);
			System.out.println("sixth value is "+a[6]);
		}
		catch(Exception e) {
			System.out.println("Invalid array index accessed.");
		}
		
	}

}
