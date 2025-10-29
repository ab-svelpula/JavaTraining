package InheritancePolicy;

public class Customer extends PolicyHolder {
	
	void custinfo(){
	String CFName = "Don Mark";
	String CID = "12345";
	String DateofB = "01/01/1989";
	System.out.println("Customer Full Name is :"+CFName);
	System.out.println("Customer ID is :"+CID);
	System.out.println("Customer Date of Birth is :"+DateofB);
	}
	
	public static void main (String [] args) {
		
		Customer obj = new Customer();
		obj.custinfo();
		obj.Policyinfo();
	}
	
}
