import java.util.Scanner;

public class prac5B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an expression (e.g., 3 + 4): ");
        String expression = scanner.nextLine();

        // Remove all spaces from the expression
        String parsedExpression = expression.replaceAll("\\s", "");

        // Check if the expression is valid (contains exactly one operator)
        if (parsedExpression.matches("\\d+\\+\\d+|\\d+-\\d+|\\d+\\*\\d+|\\d+/\\d+")) {
            // Split the expression into operands and operator
            String[] parts = parsedExpression.split("\\+|-|\\*|/");
            double operand1 = Double.parseDouble(parts[0]);
            double operand2 = Double.parseDouble(parts[1]);
            char operator = parsedExpression.charAt(parts[0].length());

            // Perform the calculation
            double result = 0;
            switch (operator) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    if (operand2 != 0) {
                        result = operand1 / operand2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    break;
            }

            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid expression. Please enter a valid expression with one operator.");
        }
    }
}


