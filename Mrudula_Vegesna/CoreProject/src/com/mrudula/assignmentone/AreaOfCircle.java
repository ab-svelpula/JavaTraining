package com.mrudula.assignmentone;

//Write a Java program to calculate the area of a circle using radius.--> Used Instance variables

public class AreaOfCircle {
	double area ;   
	double r= 2;
	
	public static void main(String[] args) {
        
		AreaOfCircle ar = new AreaOfCircle();
		ar.area = 3.14 * ar.r * ar.r;
		System.out.println("Area of circle=" +ar.area);

	}

}
