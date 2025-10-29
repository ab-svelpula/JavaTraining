package InheritanceAccount;

public class RecurringDeposit {
	
	void calculateinterest() {
		float Interest;
		float Prin = 100000;
		float Tenure = 24; // in months
		float ROI = 10;
		Interest = (float) (((Prin * ROI/100)* Tenure/12)*0.5);
		System.out.println(Interest);

	}
	
	void showbalanceRecurring() {
		int Principal = 1000;
		System.out.println(Principal); 
	}
	
}
