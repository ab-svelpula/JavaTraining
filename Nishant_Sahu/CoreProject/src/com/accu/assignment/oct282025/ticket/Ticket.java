package com.accu.assignment.oct282025.ticket;

public class Ticket {
	String name = "Steve Rogers";
	String emailId = "steve.rogers@mail.com";

	void bookTicket() {
		System.out.println("Ticket booked for : " + name + " : with EmailId : +" + emailId);
	}
}
