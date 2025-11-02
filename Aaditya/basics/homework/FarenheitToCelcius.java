package com.aaditya.basics.homework;

import java.util.Scanner;
public class FarenheitToCelcius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Farenheit");
		double f = sc.nextDouble();
		double c = (f-32)*5/9;
		System.out.println("The Temperature in Celcius is: "+c+" degrees.");
		sc.close();
	}
}
