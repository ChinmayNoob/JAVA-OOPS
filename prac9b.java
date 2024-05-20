// Write a recursive method that returns the smallest integer in an array.
// Write a test program that prompts the user to enter an integer and display its product.
import java.util.Scanner;

public class Main {

    // Recursive method to find the smallest integer in an array
    public static int findSmallest(int[] arr, int index, int min) {
        if (index == arr.length) {
            return min;
        } else {
            if (arr[index] < min) {
                min = arr[index];
            }
            return findSmallest(arr, index + 1, min);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Find the smallest integer in the array using the recursive method
        int smallest = findSmallest(array, 0, Integer.MAX_VALUE);
        System.out.println("The smallest integer in the array is: " + smallest);

        // Calculate the product of the elements of the array
        long product = 1;
        for (int num : array) {
            product *= num;
        }
        System.out.println("The product of the elements of the array is: " + product);

        scanner.close();
    }
}
