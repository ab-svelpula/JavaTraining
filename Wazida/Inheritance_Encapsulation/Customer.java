package inheritance_encapsulation;

public class Customer {
	 protected String name;
	    protected int age;
	    protected String contactNumber;

	    public Customer(String name, int age, String contactNumber) {
	        this.name = name;
	        this.age = age;
	        this.contactNumber = contactNumber;
	    }

	    public void showCustomerDetails() {
	        System.out.println("Customer Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Contact Number: " + contactNumber);
	    }

}
