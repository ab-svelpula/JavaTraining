package com.harsha.day1;
import java.util.Scanner;

public class Code2 {
    public static void main(String[] args) {
        System.out.println("Temperature from Celsius to Fahrenheit");
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double f = ((c * 9/5) + 32);
        System.out.println("Fahrenheit:"+f);

    }
}
