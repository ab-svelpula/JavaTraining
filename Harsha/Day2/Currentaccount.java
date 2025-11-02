package com.harsha.day2;

public class Currentaccount extends Bankaccount {
    void withdraw(double amount){
        double over_draft=7000;
        if(amount<current_bal+over_draft){
            current_bal-=amount;
            System.out.println("Withdrwan amount :"+amount);
        }
        else {
            System.out.println("overdraft exceeded");
        }
}

    public static void main(String[] args) {
        Currentaccount currentaccount = new Currentaccount();
        currentaccount.deposit(113082);
        currentaccount.withdraw(5783);
    }
}
