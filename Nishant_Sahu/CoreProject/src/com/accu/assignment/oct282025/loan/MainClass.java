package com.accu.assignment.oct282025.loan;

public class MainClass {

	public static void main(String[] args) {
		HomeLoan hl = new HomeLoan();
		CarLoan cl = new CarLoan();

		hl.calculateEMI();
		cl.calculateEMI();

	}

}
