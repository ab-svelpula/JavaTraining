package com.accu.assignment.oct282025.ticket;

public class FlightTicket extends Ticket {
	
	String flightNo = "AOI675";
	int seatNo = 58;
	String type = "Window";

	void bookTicket() {
		super.bookTicket();
		System.out.println("Flight ticket details : ");
		System.out.println("Flight : "+flightNo+" : Seat No. : "+seatNo+" : Type : "+type);
	}
}
