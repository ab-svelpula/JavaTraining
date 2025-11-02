package com.harsha.day1;

import java.util.Scanner;

public class Code4 {
    public static void main(String[] args) {
        System.out.println("perimeter of a rectangle");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double perimeter = 2*(a+b);
        System.out.println("Perimeter : "+perimeter);
    }
}
