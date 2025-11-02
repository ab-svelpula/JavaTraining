package com.harsha.day1;

import java.util.Scanner;

public class Code8 {
    public static void main(String[] args) {
        System.out.println(" sum of three numbers entered by the user");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double sum = a+b+c;
        System.out.println("Sum of three numbers: "+sum);
    }
}
