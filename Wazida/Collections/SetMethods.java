package collectionFrameWork;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {
	public static void main(String[] args) {

		// Create Set A and Set B
		        Set<Integer> setA = new HashSet<>();
		        Set<Integer> setB = new HashSet<>();

		        // Add elements to Set A
		        setA.add(1);
		        setA.add(2);
		        setA.add(3);
		        setA.add(4);
		        setA.add(5);

		        // Add elements to Set B
		        setB.add(4);
		        setB.add(5);
		        setB.add(6);
		        setB.add(7);
		        setB.add(8);

		        // Union
		        Set<Integer> union = new HashSet<>(setA);
		        union.addAll(setB);

		        // Intersection
		        Set<Integer> intersection = new HashSet<>(setA);
		        intersection.retainAll(setB);

		        // Difference (A - B)
		        Set<Integer> difference = new HashSet<>(setA);
		        difference.removeAll(setB);

		        // Print results
		        System.out.println("Set A: " + setA);
		        System.out.println("Set B: " + setB);
		        System.out.println("Union: " + union);
		        System.out.println("Intersection: " + intersection);
		        System.out.println("Difference (A - B): " + difference);

	}

}
