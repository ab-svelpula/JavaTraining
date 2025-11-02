package com.harsha.day1;

import java.util.Scanner;

public class Code9 {
    public static void main(String[] args) {
        System.out.println("Cube of a number");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double cube = a*a*a;
        System.out.println("Cube of a: "+cube);
    }
}
