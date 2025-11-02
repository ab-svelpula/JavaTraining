package com.harsha.day1;

import java.util.Scanner;

public class Code7 {
    public static void main(String[] args) {
        System.out.println("Even or odd number");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        if (a % 2 == 0 ){
            System.out.println("Even number");
        }
        else {
            System.out.println(("Odd number"));
        }
    }
}
