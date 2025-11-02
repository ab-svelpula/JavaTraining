package com.harsha.day2;

public class Savingsaccount extends Bankaccount{
    void withdraw(double amount){
        if(amount>5000){
            System.out.println("Withdrawal limit is 5000");
        }
        else if (amount<=current_bal){
            current_bal-=amount;
            System.out.println("withdrawn amount: "+amount);
        }
        else {
            System.out.println("insufficeint funds");
        }
    }

    public static void main(String[] args) {
        Savingsaccount savingsaccount = new Savingsaccount();
        savingsaccount.deposit(100000);
        savingsaccount.withdraw(12000);
    }
}
