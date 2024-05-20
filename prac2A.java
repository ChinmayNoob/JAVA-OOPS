/*Body Mass Index (BMI) is a measure of health on weight. It can be
calculated by taking your weight in kilograms and dividing by the
square of your height in meters. Write a program that prompts the user to
enter a weight in pounds and height in inches and displays the BMI.
Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters.
 */
import java.util.Scanner;

public class prac2A {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter your weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        // Prompt the user to enter height in inches
        System.out.print("Enter your height in inches: ");
        double heightInches = scanner.nextDouble();

        // Conversion factors
        final double POUNDS_TO_KG = 0.45359237;
        final double INCHES_TO_METERS = 0.0254;

        // Convert weight to kilograms
        double weightKg = weightPounds * POUNDS_TO_KG;

        // Convert height to meters
        double heightMeters = heightInches * INCHES_TO_METERS;

        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        // Display the BMI
        System.out.printf("Your BMI is: %.2f%n", bmi);

        // Close the scanner
        scanner.close();
    }
}
