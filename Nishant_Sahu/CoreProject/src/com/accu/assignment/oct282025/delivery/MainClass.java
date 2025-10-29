package com.accu.assignment.oct282025.delivery;

public class MainClass {

	public static void main(String[] args) {
		NormalDelivery nd = new NormalDelivery();
		ExpressDelivery ed = new ExpressDelivery();
		nd.getDeliveryCharges();
		ed.getDeliveryCharges();

	}

}
