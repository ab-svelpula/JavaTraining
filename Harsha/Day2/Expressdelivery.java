package com.harsha.day2;

import java.util.Scanner;

public class Expressdelivery extends Deliveryclass{
    Scanner sc = new Scanner(System.in);
    void calculatecharge() {
        System.out.println("Express delivery charges");
        System.out.println("Enter charges: ");
        double charge = sc.nextDouble();
        System.out.println("Enter the distance: ");
        double distance = sc.nextDouble();
        double bill = distance * charge;
        System.out.println("Bill :"+bill);
    }
}
