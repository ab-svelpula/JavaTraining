package interfaces_abstract_classes;

public class PaymentGatewayMain {
	public static void main(String[] args) {
		CreditCardPayment cc = new CreditCardPayment();
		cc.makePayment(1000);
		cc.generateReceipt();
		System.out.println("********************************");
		WalletPayment w = new WalletPayment();
		w.makePayment(2000);
		w.generateReceipt();
		System.out.println("********************************");
		CashOnDelivery cd = new CashOnDelivery();
		cd.makePayment(3000);
		cd.generateReceipt();
	}

}
