package CollectionTypes;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	

int id;
    String name;
	public int amount;

    @Override
    public String toString() {
        return id + " - " + name;
    }

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
}

// Comparator to sort by name
class SortByName implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.name.compareTo(e2.name);
    }
}

// Comparator to sort by id
class SortById implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.id, e2.id);
    }

	
	
	

}
