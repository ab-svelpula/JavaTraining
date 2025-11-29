package CollectionTypes;

import java.util.Comparator;

public class Person {

String name;
    int age;

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

// Comparator for multiple-level sorting: name first, then age
class SortByNameThenAge implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int nameCompare = p1.name.compareTo(p2.name);
        if (nameCompare == 0) {
            return Integer.compare(p1.age, p2.age); // If names are same, compare age
        }
        return nameCompare;
    }


}
