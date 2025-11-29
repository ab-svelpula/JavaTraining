package CollectionTypes;

import java.util.Comparator;

public class salary {

int id;
    String name;
     double amount;

    @Override
    public String toString() {
        return id + " - " + name + " - $" + amount;
    }
}

// Ascending salary
class SortBySalaryAsc implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.amount, e2.amount);
    }
}

// Descending salary
class SortBySalaryDesc implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.amount, e1.amount); // Reverse order
    }


}
