package com.harsha.day2;

public class Policyholder extends Customer{
    String policyname="Hdfc click 2 protect";
    String policytype="Term";
    int coverage =85;
    void showcustomerdetails(){
        super.showcustomerdetails();

        System.out.println("Policy name: "+policyname);
        System.out.println("Policy type: "+policytype);
        System.out.println("Coverage years: "+coverage);
    }
}
