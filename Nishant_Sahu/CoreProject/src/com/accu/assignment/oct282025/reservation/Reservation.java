package com.accu.assignment.oct282025.reservation;

public class Reservation {
	int standardReservationCharges = 80;
	int ticketPrice = 5500;
	void calculateFare() {
		System.out.println("Total payble ticket price: Rs "+(ticketPrice+standardReservationCharges));
	}
}
