package collectionFrameWork;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Performance {
	public static void main(String[] args) {

        int size = 10000;
        Random random = new Random();

        // HashSet performance
        HashSet<Integer> hashSet = new HashSet<>();
        long startHash = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.add(random.nextInt());
        }
        long endHash = System.nanoTime();
        long hashTime = endHash - startHash;

        // TreeSet performance
        TreeSet<Integer> treeSet = new TreeSet<>();
        long startTree = System.nanoTime();
        for (int i = 0; i < size; i++) {
            treeSet.add(random.nextInt());
        }
        long endTree = System.nanoTime();
        long treeTime = endTree - startTree;

        // Print results
        System.out.println("Time taken to insert " + size + " elements:");
        System.out.println("HashSet: " + hashTime / 1_000_000.0 + " ms");
        System.out.println("TreeSet: " + treeTime / 1_000_000.0 + " ms");
    }


}
