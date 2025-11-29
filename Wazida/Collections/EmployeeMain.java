package collectionFrameWork;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeMain {
	public static void main(String[] args) {
		LinkedList<Employee> employee = new LinkedList<Employee>();
		employee.add(new Employee(1,"wazida",100000));
		employee.add(new Employee(2,"Javid",4000000));
		employee.add(new Employee(3,"Aravind",600000));
        Iterator<Employee> itr = employee.iterator();
        while (itr.hasNext()) {
            Employee emp = itr.next();
            System.out.println("ID: " + emp.id + ", Name: " + emp.name + ", Salary: " + emp.salary);
		
	}

}
}
