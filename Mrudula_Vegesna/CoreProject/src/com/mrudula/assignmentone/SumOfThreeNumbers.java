package com.mrudula.assignmentone;

//Write a Java program to find the sum of three numbers entered by the user.

import java.util.Scanner;

public class SumOfThreeNumbers {
	int x,y,z, add;
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter First number:");   
		 int x = sc.nextInt();
		  	
		 System.out.println("Enter Second number:");
		 int y= sc.nextInt();
		    
		 System.out.println("Enter Third number:");
		 int z= sc.nextInt();
		
		 int add = (x+y+z) ;
	
		 System.out.println("Addition of all three numbers:" +add);
	}

}
