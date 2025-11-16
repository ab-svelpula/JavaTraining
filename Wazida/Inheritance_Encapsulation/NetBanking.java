package inheritance_encapsulation;

public class NetBanking extends Payment {
    private String bankName;

    public NetBanking(double amount, String bankName) {
        super(amount);
        this.bankName = bankName;
    }

    @Override
    public void pay() {
        System.out.println("NetBanking Payment:");
        System.out.println("Bank: " + bankName);
        System.out.printf("Amount Paid: ₹%.2f%n", amount);
    }

}
