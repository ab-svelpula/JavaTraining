package constructors_scanner_classes;

public class Employee {
	Employee(){
		System.out.println("Employee Details");
	}
	Employee(String Name, String Role, String company,int years){
		this();
		System.out.println("Name of the employee is "+Name);
		System.out.println("Role of the employee is "+ Role);
		System.out.println("Employer of the employee is "+company);
		System.out.println("Years of experience as "+Role+" is "+years);
	}

}
