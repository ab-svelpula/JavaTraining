package inheritance_encapsulation;

public class PolicyHolder extends Customer {
	private String policyNumber;
    private String policyType;
    private double coverageAmount;

    public PolicyHolder(String name, int age, String contactNumber,
                        String policyNumber, String policyType, double coverageAmount) {
        super(name, age, contactNumber);
        this.policyNumber = policyNumber;
        this.policyType = policyType;
        this.coverageAmount = coverageAmount;
    }

    public void showPolicyDetails() {
        showCustomerDetails(); // Call base method
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Policy Type: " + policyType);
        System.out.println("Coverage Amount: ₹" + coverageAmount);
    }

}
