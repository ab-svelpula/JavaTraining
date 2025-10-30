package com.mrudula.assignmentone;

//Write a Java program to convert temperature from Fahrenheit to Celsius. --> Used local variables concept

public class TemperatureFahrenheitToCelsius {

	void temperatureFtoC()  /* temperature from Fahrenheit to celsius. */
    {
    double C;
    double F = 97.1;
    System.out.println("Convert temperature from Fahrenheit to celsius:" +(C = (F-32) * 5/9));    
    }	
	
	public static void main(String[] args) {
		
		TemperatureFahrenheitToCelsius fc = new TemperatureFahrenheitToCelsius();
		fc.temperatureFtoC();
	
	}

}
