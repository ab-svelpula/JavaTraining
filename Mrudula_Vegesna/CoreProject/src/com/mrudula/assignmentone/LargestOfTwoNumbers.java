package com.mrudula.assignmentone;

//Write a Java program to find the largest of two numbers using if-else.

public class LargestOfTwoNumbers {
	void largest()   
    {
    int a=10;
    int b=20;
    if (a>b)
    {	
       System.out.println("Largest numbers:" +a);   
    }
    else
    {
    	System.out.println("Largest numbers:" +b);
    }
    }
	public static void main(String[] args) {
		
		LargestOfTwoNumbers ln = new LargestOfTwoNumbers();
		ln.largest();
		
	}

}
