package com.assignment.Oct27;

/*Write a Java program to check if a number is even or odd.*/

public class EvenOddChecker {
   public static void main(String[] args) {
       int number = 17;

       if (number % 2 == 0) {
           System.out.println(number + " is even.");
       } else {
           System.out.println(number + " is odd.");
       }
   }
}
