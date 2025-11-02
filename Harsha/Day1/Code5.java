package com.harsha.day1;

import java.util.Scanner;

public class Code5 {
    public static void main(String[] args) {
        System.out.println("Simple Interest");
        Scanner sc = new Scanner(System.in);

        double p =sc.nextDouble();
        double t = sc.nextDouble();
        double r = sc.nextDouble();
        double s= (p*t*r)/100;
        System.out.println("Simple interest: "+s);
    }
}
