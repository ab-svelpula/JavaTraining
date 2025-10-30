package com.mrudula.assignmentone;

//Write a Java program to check if a number is even or odd.

public class EvenOrOdd {
	
	void Evenodd()       
    {
    int a=10;
   
    if (a%2==0)
    {	
       System.out.println("Even number");   
    }
    else
    {
    	System.out.println("Odd number");
    }
    }
	
	public static void main(String[] args) {
		
		EvenOrOdd eo = new EvenOrOdd();
		eo.Evenodd();

	}

}
