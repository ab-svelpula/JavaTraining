package collectionFrameWork;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        // Split sentence into words
        String[] words = sentence.split("\\s+");

        // Store words in HashSet to remove duplicates
        HashSet<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }

        // Print unique words
        System.out.println("Unique words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        sc.close();
    }
}

	