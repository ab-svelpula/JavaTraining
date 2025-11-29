package CollectionTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {

public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Person p1 = new Person();
        p1.name = "Alice"; p1.age = 30;

        Person p2 = new Person();
        p2.name = "Bob"; p2.age = 25;

        Person p3 = new Person();
        p3.name = "Alice"; p3.age = 22;

        Person p4 = new Person();
        p4.name = "Charlie"; p4.age = 28;

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        System.out.println("Before Sorting:");
        for (Person p : people) {
            System.out.println(p);
        }

        Collections.sort(people, new SortByNameThenAge());

        System.out.println("\nAfter Sorting (Name then Age):");
        for (Person p : people) {
            System.out.println(p);
        }
    }


}
