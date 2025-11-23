package interfaces_abstract_classes;

public class CashOnDelivery implements PaymentGateway{
	double total;

	@Override
	public void makePayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Total amount "+amount);
		total = amount + 300; //Adding charges
		System.out.println("Payment amount needs to be paid by Cash on delivery "+total);
	}

	@Override
	public void generateReceipt() {
		// TODO Auto-generated method stub
		System.out.println("Total amount needs to be paid "+total);
		
	}

}
