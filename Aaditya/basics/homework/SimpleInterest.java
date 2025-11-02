package com.aaditya.basics.homework;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal amount: ");
		double p = sc.nextDouble();
		System.out.println("Enter time period: ");
		double t = sc.nextDouble();
		System.out.println("Enter the rate of interest: ");
		double r = sc.nextDouble();
		double i = p*t*r/100;
		System.out.println("The interest is: "+i);
		sc.close();
	}
}
