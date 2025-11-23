package interfaces_abstract_classes;

public class DebitCard implements BankService {
    
	double balance = 5000;
	@Override
	public void transferMoney(double amount) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("Amount before transfered is "+balance);
				balance = balance-amount;
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
		System.out.println("Transaction type is Debit Card;");
		
	}
	

}
