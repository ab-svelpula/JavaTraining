package com.mrudula.assignmentone;

//Write a Java program to calculate the cube of a number.

public class CubeOfNumber {
	int P=100, CN; 
	
	public static void main(String[] args) {
		CubeOfNumber cu = new CubeOfNumber();
		cu.CN = cu.P * cu.P * cu.P ;
		System.out.println("Cube of number: "+cu.CN); 
	}

}
