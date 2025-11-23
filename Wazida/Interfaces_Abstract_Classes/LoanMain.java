package interfaces_abstract_classes;

public class LoanMain {
	public static void main(String[] args)
	{
		HomeLoan hl = new HomeLoan();
		hl.addAmount(100000, 2, 10);
		hl.calculateEMI();
		
		CarLoan cl = new CarLoan();
		cl.addAmount(10000, 3, 15);
		cl.calculateEMI();
		
		PersonalLoan pl = new PersonalLoan();
		pl.addAmount(50000, 4, 20);
		pl.calculateEMI();
	}

}
