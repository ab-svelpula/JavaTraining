package com.assignment.Oct27;

/*Write a Java program to convert temperature from Celsius to Fahrenheit.
(Formula: F = (C × 9/5) + 32)*/

 public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
