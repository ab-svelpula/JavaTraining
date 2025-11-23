package interfaces_abstract_classes;

public class WalletPayment implements PaymentGateway{
	double total;

	@Override
	public void makePayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Total amount "+amount);
		total = amount - 500; //subtracting the wallet money
		System.out.println("Payment amount needs to be paid by wallet "+total);
	}

	@Override
	public void generateReceipt() {
		// TODO Auto-generated method stub
		System.out.println("Total amount needs to be paid "+total);
		
	}

}
