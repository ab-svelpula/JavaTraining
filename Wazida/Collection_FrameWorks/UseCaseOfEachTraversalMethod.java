package CollectionTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class UseCaseOfEachTraversalMethod {

    public static void main(String[] args) {
        // Enumeration with Vector (Legacy)
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");

        System.out.println("Enumeration (Vector):");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }

        // Iterator with ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            arrayList.add(i);
        }

        System.out.println("\n\nIterator (ArrayList):");
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            System.out.print(num + " ");
            if (num == 3) {
                iterator.remove(); // Safe removal
            }
        }
        System.out.println("\nArrayList after removal: " + arrayList);

        // ListIterator with LinkedList
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("X", "Y", "Z"));
        System.out.println("\nListIterator (LinkedList):");
        ListIterator<String> listIterator = linkedList.listIterator();

        System.out.println("Forward:");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }

        System.out.println("\nBackward:");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
    }
}


