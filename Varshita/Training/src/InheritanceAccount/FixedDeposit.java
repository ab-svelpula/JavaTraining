package InheritanceAccount;

public class FixedDeposit extends RecurringDeposit {
	

	void calculateinterest2() {
		
		int Interest;
		int Prin = 100000;
		int Tenure = 12; // in months
		int ROI = 10;
		
		Interest = (Prin *ROI * Tenure )/100;
		System.out.println(Interest);

		}

	void showbalanceFixed() {
		int Principal = 2000;
		System.out.println(Principal); 
	}
}
