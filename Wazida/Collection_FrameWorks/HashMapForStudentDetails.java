package CollectionTypes;

import java.util.HashMap;
import java.util.Map;

public class HashMapForStudentDetails {
	public static void main(String[] args) {

       //Create a HashMap with roll number as key and name as value
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Add 5 entries
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eva");

        // Display all entries using for-each loop
        System.out.println("Student Details:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Remove one entry (e.g., roll number 103)
        studentMap.remove(103);

        // Display updated map
        System.out.println("\nAfter removing roll number 103:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

		

}
