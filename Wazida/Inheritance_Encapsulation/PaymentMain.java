package inheritance_encapsulation;

public class PaymentMain {
	public static void main(String[] args) {
        CardPayment card = new CardPayment(1500, "1234567890123456");
        UPI upi = new UPI(750, "wazida@upi");
        NetBanking net = new NetBanking(2000, "State Bank of India");

        card.pay();
        System.out.println();
        upi.pay();
        System.out.println();
        net.pay();
    }

}
