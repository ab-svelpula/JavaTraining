package com.harsha.day2;

import java.util.Scanner;

public class Healthinsurance extends Insurancepolicy{

    void calculatepremium(){
       super.calculatepremium();
       Scanner sc =new Scanner(System.in);
       System.out.println("enter coverage amt: ");
       double coverageamt= sc.nextDouble();
       System.out.println("enter age: ");
       double age= sc.nextDouble();

       double annualpremium = coverageamt * 0.05 + age * 100;
       double monthlypremium =annualpremium/12;
       System.out.println("Monthly Health Premium : "+monthlypremium);
    }

}
