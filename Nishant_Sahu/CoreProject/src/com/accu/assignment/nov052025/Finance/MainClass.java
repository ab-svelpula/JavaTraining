package com.accu.assignment.nov052025.Finance;

public class MainClass {

	public static void main(String[] args) {
		HomeLoan homeLoan = new HomeLoan("HOQWEW123", "Steave Rogers", 9500000);
		homeLoan.showDetails();
		homeLoan.calculateEMI();
		
		CarLoan carLoan = new CarLoan("CARQWEW123", "Steave Rogers", 1200000);
		carLoan.showDetails();
		carLoan.calculateEMI();
		
		PersonalLoan personalLoan = new PersonalLoan("PERQWEW123", "Steave Rogers", 350000);
		personalLoan.showDetails();
		personalLoan.calculateEMI();

	}

}
