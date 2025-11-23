package interfaces_abstract_classes;

public interface PaymentGateway {
	void makePayment(double amount); 
	void generateReceipt();

}
