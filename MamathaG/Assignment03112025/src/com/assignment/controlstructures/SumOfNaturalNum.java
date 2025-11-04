package com.assignment.controlstructures;

/*Sum of Natural Numbers
Write a program to find the sum of the first 50 natural numbers using a for loop.
(Hint: sum = sum + i inside the loop)
*/
public class SumOfNaturalNum {
	public static void main(String[] args) {
		int sum =0;
		
		for(int i=1 ; i<=50 ; i++)
		{
			sum = sum + i;
		}
		System.out.println("The sum of first 50 natural numbers is : " + sum);
		
	}

}
