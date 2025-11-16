package inheritance_encapsulation;

public class AccountMain {
	public static void main(String[] args) {
        FixedDeposit fd = new FixedDeposit(100000);
        fd.showBalance();
        System.out.printf("Fixed Deposit Interest: ₹%.2f%n", fd.calculateInterest());

        RecurringDeposit rd = new RecurringDeposit(5000, 12);
        rd.showBalance();
        System.out.printf("Recurring Deposit Interest: ₹%.2f%n", rd.calculateInterest());
    }

}
