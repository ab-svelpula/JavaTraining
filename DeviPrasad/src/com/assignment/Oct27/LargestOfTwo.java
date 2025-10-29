package com.assignment.Oct27;

/*Write a Java program to find the largest of two numbers using if-else.*/

public class LargestOfTwo {
   public static void main(String[] args) {
       int num1 = 25; 
       int num2 = 40;

       if (num1 > num2) {
           System.out.println("The largest number is: " + num1);
       } else if (num2 > num1) {
           System.out.println("The largest number is: " + num2);
       } else {
           System.out.println("Both numbers are equal.");
       }
   }
}
