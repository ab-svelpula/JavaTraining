package InhertitanceInsurance;

public class InsurancePolicy extends HealthInsurance {
	
		void calculatePremium (){
		//calculatePremium
		int Premium;
		int SI = 1000000;  // Sum Insured
		int RF = 10 ; // Risk Factor
		int CP = 5;
			
		Premium = (RF * SI) / CP;
		System.out.println(Premium);
	}
		public static void main (String [] args) {
			
			// Method Overriding
			HealthInsurance obj = new HealthInsurance();
			obj.calculatePremium();
		}

}
