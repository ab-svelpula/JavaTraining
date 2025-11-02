package com.harsha.day1;

import java.util.Scanner;

public class Code6 {
    public static void main(String[] args) {
        System.out.println("Largest of two numbers");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a<b){
            System.out.println("b is larger");
        }
        else {
            System.out.println("a is larger");
        }

    }


}
