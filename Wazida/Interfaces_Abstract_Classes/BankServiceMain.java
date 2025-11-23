package interfaces_abstract_classes;

public class BankServiceMain {
	public static void main(String[] args)
	{
		CreditCard cc = new CreditCard();
		cc.transactionType();
		cc.checkBalance();
		cc.transferMoney(2000);
		cc.checkBalance();
		System.out.println("*********************************************");
		DebitCard dc = new DebitCard();
		dc.transactionType();
		dc.checkBalance();
		dc.transferMoney(2000);
		dc.checkBalance();
		System.out.println("*********************************************");
		UPI u = new UPI();
		u.transactionType();
		u.checkBalance();
		u.transferMoney(1000);
		u.checkBalance();
		
		
	}

}
