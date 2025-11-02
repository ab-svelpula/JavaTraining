package com.harsha.day2;

public class Trainticket extends Ticket{

    void bookticket() {
        String train_name="Duronto";
        String destination="VSKP";
        double ticket = 1700;
        System.out.println("Train: "+train_name);
        System.out.println("Destination: "+destination);
        System.out.println("Ticket price: "+ticket);
    }
}
