package inheritance_encapsulation;

public class InsurancePolicyMain {
	public static void main(String[] args) {
        HealthInsurance hi = new HealthInsurance("Wazida", 500000, 55);
        hi.showPolicyDetails();

        VehicleInsurance vi = new VehicleInsurance("Javid", 300000, "bike");
        vi.showPolicyDetails();
    }
}
