package com.harsha.day2;

public class Mutualfund extends Investment{

    void calculatereturns() {
       double Amount=1000;
       double Rate=12;
       double Years=5;
       double Returns = Amount *(Math.pow((1 + Rate), Years)) - Amount;
        System.out.println("Mutual funds returns: "+Returns);

    }
}
