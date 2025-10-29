package com.accu.assignment.oct272025;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		double tempInFahrenheit = 88;
		double tempInCensius = (tempInFahrenheit-32)*5/9;
		System.out.println("Converted temperature = "+tempInCensius+"°C");
	}
}
