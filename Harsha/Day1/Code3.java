package com.harsha.day1;

import java.util.Scanner;

public class Code3 {
    public static void main(String[] args) {
        System.out.println("Fahrenheit to celsius");
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = (5.0 / 9.0) * (f - 32);
        System.out.println("Celsius:"+c);
    }
}
