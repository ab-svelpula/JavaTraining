package com.harsha.day2;

public class Test14 {
    public static void main(String[] args) {
        Cardpayment cardpayment = new Cardpayment();
        cardpayment.pay();

        Upipayment upipayment = new Upipayment();
        upipayment.pay();

        Netbanking netbanking = new Netbanking();
        netbanking.pay();
    }
}
