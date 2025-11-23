package interfaces_abstract_classes;

public class BankAccountMain {
	public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount();
		sa.deposit(15000);
		sa.calculateInterest();
		
		CurrentAccount ca = new CurrentAccount();
		ca.deposit(20000);
		ca.calculateInterest();
		
		LoanAccount la = new LoanAccount();
		la.deposit(10000);
		la.calculateInterest();
	}

}
