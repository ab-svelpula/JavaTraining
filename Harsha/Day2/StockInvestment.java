package com.harsha.day2;

public class StockInvestment extends Investment {

    void calculatereturns() {
        double Amount=1000;
        double Rate=15;
        double Years=5;
        double Returns = Amount *(Math.pow((1 + Rate), Years)) - Amount;
        System.out.println("Stocks returns: "+Returns);

    }
}
