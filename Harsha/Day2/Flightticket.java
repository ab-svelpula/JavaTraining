package com.harsha.day2;

public class Flightticket extends Ticket{

    void bookticket() {
        String flight_name="air india";
        String destination="VSKP";
        double ticket = 1700;
        System.out.println("Train: "+flight_name);
        System.out.println("Destination: "+destination);
        System.out.println("Ticket price: "+ticket);
    }
}
