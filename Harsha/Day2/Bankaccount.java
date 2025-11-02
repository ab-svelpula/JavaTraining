package com.harsha.day2;

public class Bankaccount {
    double current_bal;

    void deposit(double amount){
        current_bal+=amount;
        System.out.println("Deposited amount: "+current_bal);

    }
    void withdraw(double amount){
        if(amount<=current_bal){
            current_bal-=amount;
            System.out.println("Withdrawn amount: "+amount);
        }
        else{
            System.out.println("Insufficient bal");
        }
    }
}
