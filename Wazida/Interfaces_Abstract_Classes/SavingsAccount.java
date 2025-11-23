package interfaces_abstract_classes;

public class SavingsAccount extends BankAccount {

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		balance = balance*1.5;
		System.out.println("Savings Account after adding interest "+balance);
	}

}
