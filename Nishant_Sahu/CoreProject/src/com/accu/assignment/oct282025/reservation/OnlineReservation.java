package com.accu.assignment.oct282025.reservation;

public class OnlineReservation extends Reservation{
	int onlineCharges = 99;
	void calculateFare() {
		System.out.println("Total payble ticket price: Rs "+(ticketPrice+standardReservationCharges+onlineCharges));
	}
}
