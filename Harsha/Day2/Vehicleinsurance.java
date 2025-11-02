package com.harsha.day2;

import java.util.Scanner;

public class Vehicleinsurance extends Insurancepolicy{

    void calculatepremium() {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter vehicle value: ");
        double vehicleValue=sc.nextDouble();

        double annualpremium = vehicleValue * 0.03 + 2000;
        double monthlypremium= annualpremium/12;
        System.out.println("Monthly Vehicle premium :"+monthlypremium);
    }

}
