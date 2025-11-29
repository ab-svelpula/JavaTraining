package CollectionTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class salaryMain {

public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee e1 = new Employee();
        e1.id = 101; e1.name = "Alice"; e1.amount = 55000;

        Employee e2 = new Employee();
        e2.id = 102; e2.name = "Bob"; e2.amount = 72000;

        Employee e3 = new Employee();
        e3.id = 103; e3.name = "Charlie"; e3.amount = 48000;

        Employee e4 = new Employee();
        e4.id = 104; e4.name = "David"; e4.amount = 90000;

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        System.out.println("Before Sorting:");
        employees.forEach(System.out::println);

        Collections.sort(employees, new SortBySalaryAsc());
        System.out.println("\nSorted by Salary (Ascending):");
        employees.forEach(System.out::println);

        Collections.sort(employees, new SortBySalaryDesc());
        System.out.println("\nSorted by Salary (Descending):");
        employees.forEach(System.out::println);
    }


}
