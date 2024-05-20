// Write a program that reads words from a text file and displays all the nonduplicate words in descending order.The text file is passed as a command-line argument.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the path to the text file as a command-line argument.");
            return;
        }

        String filepath = args[0];
        TreeSet<String> wordSet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        try (Scanner scanner = new Scanner(new File(filepath))) {
            while (scanner.hasNext()) {
                String word = scanner.next().replaceAll("[^a-zA-Z]", "");
                wordSet.add(word);
            }

            for (String word : wordSet.descendingSet()) {
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filepath);
        }
    }
}