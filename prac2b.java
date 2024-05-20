// Write a program that prompts the user to enter three integers and display the integers in decreasing order.

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortThreeIntegers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.print("Enter the first integer: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int second = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int third = scanner.nextInt();

        // Store the integers in an array
        Integer[] numbers = { first, second, third };

        // Sort the array in ascending order
        Arrays.sort(numbers, Collections.reverseOrder());

        // Display the integers in decreasing order
        System.out.println("The integers in decreasing order are: " +
                           numbers[0] + ", " + numbers[1] + ", " + numbers[2]);

        // Close the scanner
        scanner.close();
    }
}
