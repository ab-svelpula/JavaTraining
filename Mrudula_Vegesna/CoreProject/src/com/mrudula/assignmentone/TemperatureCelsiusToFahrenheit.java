package com.mrudula.assignmentone;

//Write a Java program to convert temperature from Celsius to Fahrenheit. --> Used local variables concept

public class TemperatureCelsiusToFahrenheit {
	
	void temperatureCtoF()  
    {
    double F;
    double C = 95.5;
    System.out.println("Convert temperature from celsius to Fahrenheit:" +(F=(C * 9/5)+ 32));    
    }
	
	public static void main(String[] args) {
		TemperatureCelsiusToFahrenheit cf = new TemperatureCelsiusToFahrenheit();
		cf.temperatureCtoF();

	}

}
