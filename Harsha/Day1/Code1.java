package com.harsha.day1;
import java.util.Scanner;


public class Code1 {
    public static void main(String[] args) {
        System.out.println("area of circle with r:/n");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double area = 3.14 * r *r ;
        System.out.println("area is :"+area);
    }
}
