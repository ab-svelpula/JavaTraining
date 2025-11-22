package conditionalStatments;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the year");
		int year = s.nextInt();
		if(year%4==0)
			System.out.println("Given year is an leap year");
		else
			System.out.println("Given year is not an leap year");
	}

}
