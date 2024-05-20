// Write a program that prompts the user to enter a decimal number and displays the number in a fraction. Hint: Read the decimal number as a string, extract the integer part and
// fractional part from the string.
import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        String decimalNumberStr = scanner.next();

        try {
            BigDecimal decimalNumber = new BigDecimal(decimalNumberStr);
            BigDecimal numerator = decimalNumber.movePointRight(decimalNumber.scale()).setScale(0, RoundingMode.DOWN);
            BigDecimal denominator = BigDecimal.TEN.pow(decimalNumber.scale());

            System.out.println("The fraction equivalent of " + decimalNumber + " is: " + numerator + "/" + denominator);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid decimal number.");
        }

        scanner.close();
    }
}