package com.harsha.day2;

import java.util.Scanner;

public class Product {
    String productname;
    double productprice;
    Scanner sc = new Scanner(System.in);
    void getdetails(){
        System.out.println("Enter product name: ");
        productname =sc.nextLine();

        System.out.println("Enter the product price");
        productprice= sc.nextDouble();
    }

    void calculatediscount(){
        System.out.println("calculate discount");
    }
}
