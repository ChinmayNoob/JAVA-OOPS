// Write a program that prompts the user to enter aletter and check whether a letter is a vowel or constant.
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);

        // Check if the entered character is a letter
        if (!Character.isLetter(letter)) {
            System.out.println("Error: Please enter a valid letter.");
        } else {
            // Convert the letter to lowercase for simplicity
            letter = Character.toLowerCase(letter);

            // Check if the letter is a vowel
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a vowel.");
            } else {
                System.out.println(letter + " is a consonant.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}

