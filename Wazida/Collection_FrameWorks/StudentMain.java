package CollectionTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 72));
        students.add(new Student("Charlie", 90));
        students.add(new Student("David", 65));
        students.add(new Student("Eva", 78));

        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort using Collections.sort()
        Collections.sort(students);

        System.out.println("\nAfter Sorting (by marks ascending):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
