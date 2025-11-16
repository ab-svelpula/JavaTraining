package inheritance_encapsulation;

public class CustomerMain { 
	public static void main(String[] args) {
        PolicyHolder holder = new PolicyHolder(
            "Wazida", 28, "9876543210",
            "POL123456", "Health Insurance", 500000
        );

        holder.showPolicyDetails();
    }

}
