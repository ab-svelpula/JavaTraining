package interfaces_abstract_classes;

public class UPI implements BankService{

	double balance = 2000;
	@Override
	public void transferMoney(double amount) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("Amount before transfered is "+balance);
				balance = balance-amount;
				balance = balance - 10; // Subtracting the charges for the UPI transfer
				System.out.println("Transfered amount is "+amount);
				System.out.println("Amount after transfered is "+balance);
				
		
	}

	@Override
	public void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("available balance is "+balance);
	}

	@Override
	public void transactionType() {
		// TODO Auto-generated method stub
		System.out.println("Transaction type is UPI");
		
	}
	
	

}
