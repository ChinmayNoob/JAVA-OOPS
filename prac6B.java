public class prac6B {
    public static int bin2Dec(String binaryString) throws NumberFormatException {
        // Check if the string is a valid binary string
        if (!binaryString.matches("[01]+")) {
            throw new NumberFormatException("The input string is not a valid binary string.");
        }

        // Convert the binary string to a decimal number
        return Integer.parseInt(binaryString, 2);
    }

    public static void main(String[] args) {
        try {
            String binaryString = "1010"; // Example binary string
            int decimalNumber = bin2Dec(binaryString);
            System.out.println("The decimal number is: " + decimalNumber);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
