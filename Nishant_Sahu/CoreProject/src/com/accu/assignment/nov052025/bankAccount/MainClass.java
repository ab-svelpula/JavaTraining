package com.accu.assignment.nov052025.bankAccount;

public class MainClass {

	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount("S78137138", "Steave Rogers", 789876);
		savingsAccount.showAccoutDetails();
		savingsAccount.calculateInterest();

		CurrentAccount currentAccount = new CurrentAccount("C78137138", "Steave Rogers", 7898768);
		currentAccount.showAccoutDetails();
		currentAccount.calculateInterest();
		
		LoanAccount loanAccount = new LoanAccount("L78137138", "Steave Rogers", 750000);
		loanAccount.showAccoutDetails();
		loanAccount.calculateInterest();
	}

}
