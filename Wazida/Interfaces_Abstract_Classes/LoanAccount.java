package interfaces_abstract_classes;

public class LoanAccount extends BankAccount {

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.println("loan amount for this account is "+balance);
		
	}

}
