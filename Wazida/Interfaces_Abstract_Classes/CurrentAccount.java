package interfaces_abstract_classes;

public class CurrentAccount extends BankAccount{

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.println("Interest cannot be applied for the current account");
		
	}

}
