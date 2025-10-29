package com.accu.assignment.oct282025.ticket;

public class TrainTicket extends Ticket {
	
	String berth = "Lower Berth";
	int seatNo = 58;
	int trainNumber = 110958;
	String coach = "A2";

	void bookTicket() {
		super.bookTicket();
		System.out.println("Train ticket details of : "+trainNumber);
		System.out.println("Coach : "+coach+" : Seat No. : "+seatNo+" : berth : "+berth);
	}
}
