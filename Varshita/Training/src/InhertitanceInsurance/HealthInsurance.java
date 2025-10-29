package InhertitanceInsurance;

public class HealthInsurance extends VehicleInsurance {
	
	void calculatePremium (){
		//calculatePremium
		int Premium;
		int SI = 2000000;  // Sum Insured
		int RF = 12 ; // Risk Factor
		int CP = 5;
			
		Premium = (RF * SI) / CP;
		System.out.println(Premium);

}
}
