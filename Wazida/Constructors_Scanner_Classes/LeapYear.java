package constructors_scanner_classes;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = s.nextInt();
		if(year%4==0)
			System.out.println("Given year - "+year+" is a leap year");
		else
			System.out.println("Given year - "+year+" is not an leap year");
	}

}
