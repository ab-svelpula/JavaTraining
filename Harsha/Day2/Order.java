package com.harsha.day2;

import java.util.Scanner;

public class Order {
    Scanner sc = new Scanner(System.in);

    void calculatebill(double price){
        System.out.println("Bill: "+price);
    }
    void calculatebill(double price,int quantity){
        double bill = price * quantity;
        System.out.println("Bill: "+bill);
    }
    void calculatebill(double price,int quantity,double discount){
        double bill = price*quantity;
        double finalamt = bill - discount;
        System.out.println("Bill: "+finalamt);
    }

    public static void main(String[] args) {
        Order order = new Order();
        order.calculatebill(1000);
        order.calculatebill(1000,15);
        order.calculatebill(10000,10,20);
    }
}
