package com.assignment.Oct27;

/*Write a Java program to convert temperature from Fahrenheit to Celsius.*/

public class FahrenheitToCelsius {
   public static void main(String[] args) {
       double fahrenheit = 98.6;
       double celsius = (fahrenheit - 32) * 5 / 9;

       System.out.println("Temperature in Fahrenheit: " + fahrenheit);
       System.out.println("Temperature in Celsius: " + celsius);
   }
}
