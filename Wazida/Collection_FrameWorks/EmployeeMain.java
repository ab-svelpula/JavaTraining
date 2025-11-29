package CollectionTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeMain {

public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        Employee e1 = new Employee();
        e1.id = 3;
        e1.name = "Aravind";

        Employee e2 = new Employee();
        e2.id = 1;
        e2.name = "Wazida";

        Employee e3 = new Employee();
        e3.id = 2;
        e3.name = "Javid";

        list.add(e1);
        list.add(e2);
        list.add(e3);

        System.out.println("Before Sorting:");
        for (Employee e : list) {
            System.out.println(e);
        }

        // Sort by name
        Collections.sort(list, new SortByName());
        System.out.println("\nAfter Sorting by Name:");
        for (Employee e : list) {
            System.out.println(e);
        }

        // Sort by id
        Collections.sort(list, new SortById());
        System.out.println("\nAfter Sorting by ID:");
        for (Employee e : list) {
            System.out.println(e);
        }
    }

}
