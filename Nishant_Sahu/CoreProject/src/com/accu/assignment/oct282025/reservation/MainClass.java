package com.accu.assignment.oct282025.reservation;

public class MainClass {
	public static void main(String[] args) {
		CounterReservation cr =  new CounterReservation();
		OnlineReservation or = new OnlineReservation();
		cr.calculateFare();
		or.calculateFare();
	}
}
