package com.aaditya.inhpol.homework.loan;

public class Main {
	public static void main(String[] args) {
		Loan l = new Loan();
		System.out.println("Interest amount is: "+l.interest);
		System.out.println("Total amount with interest is: "+l.total);
		l.calculateEMI();
		
		System.out.println("\nHome Loan");
		HomeLoan homeLoan = new HomeLoan();
		homeLoan.calculateEMI();
		
		System.out.println("\nCar Loan");
		CarLoan carLoan = new CarLoan();
		carLoan.calculateEMI();
	}
}
