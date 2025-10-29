package InheritanceAccount;

public class Account extends FixedDeposit{
	
		void showbalance() {
			int Principal = 1000;
			System.out.println("Total Amount is :"+Principal); 
		}
	
	public static void Main (String [] args) {
		// Method Overriding
		FixedDeposit obj = new FixedDeposit();
		obj.calculateinterest2();
		
		// Inheritance
		obj.showbalanceRecurring();
				
	}

}


