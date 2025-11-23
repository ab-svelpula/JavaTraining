package interfaces_abstract_classes;

public class CreditCardPayment implements PaymentGateway{
	double total;

	@Override
	public void makePayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Total amount "+amount);
		total = amount + 500; //Adding charges
		System.out.println("Payment amount needs to be paid by credit card "+total);
	}

	@Override
	public void generateReceipt() {
		// TODO Auto-generated method stub
		System.out.println("Total amount needs to be paid "+total);
		
	}

}
