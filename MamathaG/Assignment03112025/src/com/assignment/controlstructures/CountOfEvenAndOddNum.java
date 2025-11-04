package com.assignment.controlstructures;

/*Count Even and Odd Numbers from 1 to 50
Use a for loop to count how many even and odd numbers exist between 1 and 50, then print both counts.
*/
public class CountOfEvenAndOddNum 
{
	public static void main(String[] args) {
		
		int evenTotal=0;
		int oddTotal=0;
		for(int i=1 ; i<=50; i++)
		{
			if(i%2==0)
			   evenTotal = evenTotal + 1;
			else
				oddTotal = oddTotal + 1;
		}
	 System.out.println("The Total Even numbers are : "+evenTotal);
	 System.out.println("The Total Odd numbers are : "+oddTotal);
	}
	
}
