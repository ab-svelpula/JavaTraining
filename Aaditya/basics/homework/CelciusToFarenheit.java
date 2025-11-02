package com.aaditya.basics.homework;

import java.util.Scanner;
public class CelciusToFarenheit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Celcius");
		double c = sc.nextDouble();
		double f = (c*9/5)+32;
		System.out.println("Temperature in Farenheit is: "+f+" degrees");
		sc.close();
	}
}
