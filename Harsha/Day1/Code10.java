package com.harsha.day1;

import java.util.Scanner;

public class Code10 {
    public static void main(String[] args) {
        System.out.println("square root of a number");
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();
        double sqroot = Math.sqrt(s);
        System.out.println("Square root: "+sqroot);
    }
}
