// Write a program that reads a number in meters converts it to feet, and displays the result.

import java.util.Scanner;

public class prac1C {
        public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a value in meters
        System.out.print("Enter the distance in meters: ");
        double meters = scanner.nextDouble();

        // Conversion factor
        final double METERS_TO_FEET = 3.28084;

        // Convert meters to feet
        double feet = meters * METERS_TO_FEET;

        // Display the result
        System.out.printf("%.2f meters is equivalent to %.2f feet.%n", meters, feet);

        // Close the scanner
        scanner.close();
        }
    
}
