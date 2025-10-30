package com.mrudula.assignmentone;

//Write a Java program to find the perimeter of a rectangle. --> Used static variables concept

public class PerimeterOfRectangle {

	static double length = 20;  
	static double width = 30;
	
	public static void main(String[] args) {
		
     	double perimeter =  2 * (length + width);
		System.out.println("perimeter of a rectangle: " +perimeter);
		
	}

}
