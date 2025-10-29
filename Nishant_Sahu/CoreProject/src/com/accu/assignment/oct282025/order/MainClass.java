package com.accu.assignment.oct282025.order;

public class MainClass {

	public static void main(String[] args) {
		Order o = new Order();
		o.calculateBill(780);
		o.calculateBill(780,9);
		o.calculateBill(780,9,25);

	}

}
