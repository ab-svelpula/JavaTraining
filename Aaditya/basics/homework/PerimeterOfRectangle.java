package com.aaditya.basics.homework;
import java.util.Scanner;
public class PerimeterOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		double l = sc.nextDouble();
		System.out.println("Enter the width of the rectangle");
		double w = sc.nextDouble();
		double p = 2*(l+w);
		System.out.println("The perimeter of the rectangle is : "+p);
		sc.close();
	}
}
